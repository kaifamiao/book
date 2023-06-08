package Chapter03;
//Chapter03/Transfer.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Transfer {
    public static void main(String[] args) {
        trans();
    }
    public static void trans() {
        try(Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bank", "root", "root");) {
            //kaifamiao2转出100元
            String sql = "UPDATE customer SET balance = balance -? WHERE customerName = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setObject(1, 100);
            ps.setObject(2, "kaifamiao2");
            ps.executeUpdate();
            System.out.println("kaifamiao2转出成功");
            //kaifamiao1转入100元
            sql = "UPDATE customer SET balance = balance +? WHERE customerName = ?";
            ps = conn.prepareStatement(sql);
            ps.setObject(1, 100);
            ps.setObject(2, "kaifamiao1");
            ps.executeUpdate();
            System.out.println("kaifamiao1转入成功");
            //关闭连接
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}