package Chapter02;
//Chapter02/ModifyUserPass.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteUser {
    public static void main(String[] args) {
        delete();
    }
    public static void delete(){
        try(Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbcdemo","root","root");
            Statement stat = conn.createStatement()) {
            //定义SQL语句
            String sql = "DELETE FROM users WHERE id = 2";
            //执行SQL语句并返回结果
            int count = stat.executeUpdate(sql);
            System.out.println("数据库中有"+count+"条数据被执行...");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("=====END=====");
    }
}
