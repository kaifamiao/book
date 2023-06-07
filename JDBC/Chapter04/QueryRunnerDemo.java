package Chapter04;
//Chapter04/QueryRunnerDemo.java
import Chapter03.DruidExample;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 使用QueryRunner类，实现对数据库的
 * insert，delete，update
 * 调用QueryRunner类的方法update(Connection conn, String sql, Object... params)
 * Object... params表示可变参数，Object类型，SQL语句会出现?占位符
 * 数据库连接对象，自定义的工具类传递
 */
public class QueryRunnerDemo {
    // 定义成员变量DataSource
    static Connection conn = null;
    public static void main(String[] args) throws Exception {
        conn = getDataSource().getConnection();
        insert();
    }
    /**
     * 定义方法，使用Druid数据库连接池建立连接
     */
    public static DataSource getDataSource() throws Exception {
        //创建properties对象
        Properties pro = new Properties();
        //加载配置文件
        pro.load(DruidExample.class.getClassLoader().getResourceAsStream("druid.properties"));
        //创建数据库连接池对象，使用工厂类方法
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        return ds;
    }

    public static void insert() throws SQLException {
        //创建QueryRunner类对象
        QueryRunner qr = new QueryRunner();
        String sql = "INSERT INTO classmate(name, age, job, city) VALUES(?, ?, ?, ?)";
        //将4个?占位符的实际参数，写在数组中
        Object[] params = {"kfm07", 24, "python开发工程师", "北京"};
        //调用方法update
        System.out.println(conn);
        int row = qr.update(conn, sql, params);
        System.out.printf("已经有[%d]发生了变化",row);
        DbUtils.closeQuietly(conn);
    }

    public static void delete() throws SQLException {
        //创建QueryRunner类对象
        QueryRunner qr = new QueryRunner();
        String sql = "DELETE FROM classmate WHERE id <= ?";
        //调用方法update
        int row = qr.update(conn, sql, 10);
        System.out.printf("已经有[%d]发生了变化",row);
        DbUtils.closeQuietly(conn);
    }

public static void update() throws SQLException {
    //创建QueryRunner类对象
    QueryRunner qr = new QueryRunner();
    String sql = "UPDATE classmate SET age = 35 WHERE id = ?";
    //调用方法update
    int row = qr.update(conn, sql, 4);
    System.out.println(row+"行发生了变化");
    DbUtils.closeQuietly(conn);
}

}
