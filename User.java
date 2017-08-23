import java.sql.*;

public class User {
    public static void main(String[] args) {
        Connection con = null;
        try {
            // JDBCドライバのロード - JDBC4.0（JDK1.6）以降は不要
            Class.forName("com.mysql.jdbc.Driver").newInstance();
         //   Class.forName("./mysql-connector-java-5.1.43-bin.jar").newInstance();
            // MySQLに接続
            con = DriverManager.getConnection("jdbc:mysql://localhost/loginadmin_sv17", "adminsv17", "summer17");
            System.out.println("MySQLに接続できました。");
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
}


