// ユーザのアカウント
import java.sql.*;

class User {
    public static void main (String[] args) {
        try {
            // 先程インストールしたMySQLのドライバを指定
            Class.forName("com.mysql.jdbc.Driver");

            // MySQLデータベースに接続 (DB名,ID,パスワードを指定)
            Connection conn =
                DriverManager.getConnection("jdbc:mysql://localhost/YOUR_DBNAME?"+
                                            "user=USER_ID&password=PASSWORD");
            // ステートメントを作成
            Statement stmt = conn.createStatement();

            // INSERT
            stmt.executeUpdate("INSERT INTO users (id, email) VALUES (1001,'someone01@example.com')");
            stmt.executeUpdate("INSERT INTO users (id, email) VALUES (1002,'someone02@example.com')");

            // DELETE
            stmt.executeUpdate("DELETE FROM users where id=1001");

            // UPDATE
            stmt.executeUpdate("UPDATE users SET email='updated@example.com' where id=1002");

            // SELECT
            ResultSet rset = stmt.executeQuery("SELECT id, email FROM users");
            while ( rset.next() ) {
                System.out.println(rset.getInt(1) + "\t" + rset.getString(2)); // ()内は列番号です
            }

            // 結果セットをクローズ
            rset.close();
            // ステートメントをクローズ
            stmt.close();
            // 接続をクローズ
            conn.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
