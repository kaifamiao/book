package Chapter04;
//Chapter04/SelectTest.java
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {
    public static void main(String[] args) throws ClassNotFoundException,
            SQLException {
        DBHelper helper =null;
        try {
            helper = new DBHelper();
            String sql = "SELECT * FROM users";
            ResultSet rs = helper.executeQuery(sql);
            while(rs.next()){
                System.out.print(rs.getInt("id"));
                System.out.print("\t");
                System.out.println(rs.getString("username"));
                System.out.print("\t");
                System.out.println(rs.getString("userpass"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            helper.close();
        }
    }
}
