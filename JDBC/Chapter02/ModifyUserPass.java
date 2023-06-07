package Chapter02;
//Chapter02/ModifyUserPass.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ModifyUserPass {
    public static void main(String[] args) {
        modify();
    }
    public static void modify(){
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","root");
        Statement stat = conn.createStatement()) {
            //定义SQL语句
            String sql = "UPDATE users SET userpass='456' WHERE username = 'admin'";
            //执行SQL语句并返回结果
            int count = stat.executeUpdate(sql);
            System.out.println("修改成功，影响了"+count+"行数据");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("=====END=====");
    }
}
