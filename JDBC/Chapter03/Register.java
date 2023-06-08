package Chapter03;
//Chapter03/Register.java
import java.sql.*;

public class Register {
    public static void main(String[] args) {
        CallableStatement cstmt = null;
        try(Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bank","root","root");){
            //调用存储过程register，其中{CALL}是固定写法
            cstmt = conn.prepareCall("{CALL register(?,?,?)}");
            //为前两个占位符赋值
            cstmt.setString(1,"kaifamiao3");
            cstmt.setString(2,"123456");
            //为第三个占位符注册为OUT类型的整型参数
            cstmt.registerOutParameter(3, Types.INTEGER);
            //执行存储过程
            cstmt.execute();
            //获取第三个占位符的值
            int result = cstmt.getInt(3);
            System.out.println("新增用户的主键是" + result);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(cstmt != null) cstmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}