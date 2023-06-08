package Chapter04;
//Chapter04/InsertTest.java
import java.sql.SQLException;

public class InsertTest {
    public static void main(String[] args)
            throws ClassNotFoundException, SQLException {
        DBHelper helper =null;
        try {
            helper = new DBHelper();
            String sql = "INSERT INTO users(username,userpass)VALUES(?,?)";
            Object values[] =new Object[]{"admin","1234"};
            int i = helper.executeUpdate(sql, values);
            if(i>0){
                System.out.println("添加成功");
            }else{
                System.out.println("添加失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            helper.close();
        }
    }
}
