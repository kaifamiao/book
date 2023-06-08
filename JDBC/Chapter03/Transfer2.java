package Chapter03;
//Chapter03/Transfer2.java
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * 在事务中 kaifamiao2 给 kaifamiao1 转账
 */
public class Transfer2 {
    public static void main(String[] args) {
        PreparedStatement pstmt = null;
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","123456");
            //kaifamiao2转出100元
            String sql = "UPDATE customer SET balance = balance - ? where customerName = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,100);
            pstmt.setString(2,"kaifamiao2");
            pstmt.executeUpdate();
            System.out.println("kaifamiao2转出100元");
            //特意抛出异常，表示第二条语句执行失败
            if (true) throw new RuntimeException("转账出现异常");
            //kaifamiao1转入100元
            sql = "UPDATE customer SET balance = balance + ? where customerName = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,100);
            pstmt.setString(2,"kaifamiao1");
            pstmt.executeUpdate();
            System.out.println("kaifamiao1转入100元");
           //关闭资源
            pstmt.close();
            conn.close();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try{
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}