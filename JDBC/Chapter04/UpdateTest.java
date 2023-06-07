package Chapter04;
//Chapter04/UpdateTest.java
import java.sql.SQLException;

public class UpdateTest {
    public static void main(String[] args)
            throws ClassNotFoundException, SQLException {
        DBHelper helper =null;
        try {
            helper = new DBHelper();
            String sql = "update users set userpass=? where username=?";
            Object values[] =new Object[]{"789","admin"};
            int i = helper.executeUpdate(sql, values);
            if(i>0){
                System.out.println("修改成功");
            } else{
                System.out.println("修改失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            helper.close();
        }
    }
}
