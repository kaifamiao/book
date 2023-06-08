package Chapter02;
//Chapter02/Register.java
import java.sql.*;
import java.util.Scanner;
public class GetPrimary {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try{
            //1. 获取用户名、密码、年龄
            Scanner input = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String username = input.next();
            System.out.println("请输入密码：");
            String userpass = input.next();
            System.out.println("请输入年龄：");
            int age = input.nextInt();
            //2. 获取数据库连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "root");
            //定义sql语句
            String sql = "INSERT INTO users(username,userpass,age) VALUES(?,?,?)";
            //3. 获取PreparedStatement对象
            stmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            //4. 设置参数
            stmt.setObject(1, username);
            stmt.setObject(2, userpass);
            stmt.setObject(3, age);
            //5. 执行sql语句并返回结果
            int rows = stmt.executeUpdate();
            //6. 获取新增主键
            rs = stmt.getGeneratedKeys();
            if(rs.next()){
                long id = rs.getLong(1);
                System.out.println("新增主键为："+id);
            }
            System.out.println("数据库中有"+ rows +"条数据被执行...");
            //7. 关闭资源
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            //8. 关闭资源
            try {
                if(rs != null){
                    rs.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }finally{
                try {
                    if(stmt != null) stmt.close();
                    if(conn != null) conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
