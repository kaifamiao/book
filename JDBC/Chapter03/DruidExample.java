package Chapter03;
//Chapter03/DruidExample.java
import com.alibaba.druid.pool.DruidDataSourceFactory;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class DruidExample {
    public static void main(String[] args) {
        try{
            Properties prop = new Properties();
            prop.load(DruidExample.class.getClassLoader().getResourceAsStream("druid.properties"));
            DataSource ds = DruidDataSourceFactory.createDataSource(prop);
            Connection conn = ds.getConnection();
            System.out.println(conn);
            //执行SQL查询
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
            while(rs.next()){
                String username = rs.getString("username");
                String password = rs.getString("userpass");
                Integer age = rs.getInt("age");
                System.out.println("username: "+username + ",userpass: " + password + ",age: " + age);
            }
            //关闭连接
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

public static Connection getConnection5() throws Exception {
    Properties prop = new Properties();
    prop.load(DruidExample.class.getClassLoader().getResourceAsStream("druid.properties"));
    DataSource ds = DruidDataSourceFactory.createDataSource(prop);
    Connection conn = ds.getConnection();
    System.out.println(conn);
    return conn;
}
}
