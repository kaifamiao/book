package Chapter02;
//Chapter02/AddUser1.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class AddUser1 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            //1. 注册数据库驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2. 获取数据库连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","root");
            //3. 获取Statement对象
            stmt = conn.createStatement();
            //4. 定义SQL语句
            String sql = "INSERT INTO users(username, userpass, age) VALUE" +
                    "('admin', '123', 18),('kaifamiao1', '1234', 20), ('kaifamiao2', '1234', 22)";
            //5. 执行SQL语句并返回结果
            int rows = stmt.executeUpdate(sql);
            //6. 打印执行结果
            System.out.println("数据库中新增" + rows + "条数据");
            //7. 关闭Statement对象和数据库连接,释放资源
            stmt.close();
            conn.close();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try{
                if(stmt != null) stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try{
                if(conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println("=====END=====");
    }
}