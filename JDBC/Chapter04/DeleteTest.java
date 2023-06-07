package Chapter04;
//Chapter04/DeleteTest.java
import java.sql.SQLException;

public class DeleteTest {
    public static void main(String[] args)
            throws ClassNotFoundException, SQLException {
        DBHelper helper =null;
        try {
            helper = new DBHelper();
            String sql = "DELETE FROM users WHERE username=?";
            int i = helper.executeUpdate(sql,"admin");
            if(i>0){
                System.out.println("删除成功");
            }else{
                System.out.println("删除失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            helper.close();
        }
    }
}
