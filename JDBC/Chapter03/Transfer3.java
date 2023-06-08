package Chapter03;
//Chapter03/Translaction3.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 * 在事务中 kaifamiao2 给 kaifamiao1 转账
 */
public class Transfer3 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
            // 开启事务
            conn.setAutoCommit(false);
            String sql = "UPDATE customer SET balance = balance - ? where customerName = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,100);
            pstmt.setString(2,"kaifamiao2");
            // 执行事务
            pstmt.executeUpdate();
            System.out.println("kaifamiao2转出成功");
            if (true) throw new RuntimeException("转账出现异常");
            sql = "UPDATE customer SET balance = balance + ? where customerName = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,100);
            pstmt.setString(2,"kaifamiao1");
            // 执行事务
            pstmt.executeUpdate();
            System.out.println("kaifamiao1转入成功");
            // 提交事务
            conn.commit();
            // 关闭资源
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            // 回滚事务
            try{
                conn.rollback();
                System.out.println("事务回滚成功");
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
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