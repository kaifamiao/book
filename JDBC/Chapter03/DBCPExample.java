package Chapter03;
//Chapter03/DBCPExample.java
import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBCPExample {
    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        try{
            //配置连接池参数
            dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
            dataSource.setUrl("jdbc:mysql://localhost:3306/jdbcdemo");
            dataSource.setUsername("root");
            dataSource.setPassword("root");
            dataSource.setMaxTotal(20);
            dataSource.setMinIdle(5);
            //获取连接
            Connection conn = dataSource.getConnection();
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
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            //关闭连接池
            try {
                dataSource.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
//使用DBCP数据库连接池的配置文件方式，获取数据库的连接
private static DataSource source = null;
static {
    try{
        Properties prop = new Properties();
        InputStream in = DBCPExample.class.getClassLoader().getResourceAsStream("dbcp.properties");
        prop.load(in);
        //根据提供的BasicDataSourceFactory类的createDataSource方法，创建数据源
        source = BasicDataSourceFactory.createDataSource(prop);
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}

public static Connection getConnection4() throws SQLException {
    Connection conn = source.getConnection();
    return conn;
}



//使用DBCP数据库连接池的方式，获取数据库的连接
public static Connection getConnection3() throws SQLException {
    BasicDataSource source = new BasicDataSource();
    source.setDriverClassName("com.mysql.cj.jdbc.Driver");
    source.setUrl("jdbc:mysql://localhost:3306/test?serverTimezone=UTC");
    source.setUsername("root");
    source.setPassword("123456");
    source.setInitialSize(10);
    Connection conn = source.getConnection();
    return conn;
}
}
