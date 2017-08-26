import java.sql.*;

public class User {
	String in_sentence;

    public static void sql() {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/summer_vacation2017";
		private String user = "adminsv17";
		private String password = "summer17";

        try {
            // JDBCドライバのロード - JDBC4.0（JDK1.6）以降は不要
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // MySQLに接続
            con = DriverManager.getConnection(url,user,password);
            System.out.println("MySQLに接続できました。");

            // ステートメントを作成
            Statement stmt = con.createStatement();

            String user_list = "select * from users";
            ResultSet rs = stmt.executeQuery(user_list);

            while(rs.next()){
                String id = rs.getString("userid");
                String pass = rs.getString("userpass");
                System.out.println("取得結果 -> " + id + ":" + pass);
            }

            // INSERT
        //	stmt.executeUpdate("INSERT INTO users (id, email) VALUES (1001,'someone01@example.com')");
        //	stmt.executeUpdate("INSERT INTO users (id, email) VALUES (1002,'someone02@example.com')");

            // DELETE
        //	stmt.executeUpdate("DELETE FROM users where id=1001");

            // UPDATE
        //	stmt.executeUpdate("UPDATE users SET email='updated@example.com' where id=1002");

            // ステートメントをクローズ
            stmt.close();

        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            System.out.println("JDBCドライバのロードに失敗しました。");
        } catch (SQLException e) {
            System.out.println("MySQLに接続できませんでした。");
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.out.println("MySQLのクローズに失敗しました。");
                }
            }
        }
    }

	public String insert(String newid, String newpass){
		in_sentence = "INSERT INTO users(userid, userpass) VALUES(newid, newpass)";
	}
}
