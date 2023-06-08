package Chapter04;
//Chapter04/QueryExample.java
import Chapter03.DruidExample;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.*;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class QueryExample {
    public static DataSource getDataSource() throws Exception {
        //创建properties对象
        Properties prop = new Properties();
        //加载配置文件
        prop.load(DruidExample.class.getClassLoader().getResourceAsStream("druid.properties"));
        //创建数据库连接池对象，使用工厂类方法
        DataSource ds = DruidDataSourceFactory.createDataSource(prop);
        System.out.println(ds);
        return ds;
    }

    public static void select01() throws Exception {
        //创建QueryRunner对象
        QueryRunner qr = new QueryRunner(getDataSource());
        //执行查询操作
        String sql = "SELECT * FROM classmate";
        BeanListHandler<Classmate> bh = new BeanListHandler<>(Classmate.class);
        List<Classmate> classmate = null;
        try{
            classmate = qr.query(sql,bh);
        } catch (Exception e){
            e.printStackTrace();
        }
        //处理查询结果
        for (Classmate c : classmate){
            System.out.println(c.toString());
        }
    }

    public static void select02() throws Exception {
    //创建QueryRunner对象
    QueryRunner qr = new QueryRunner(getDataSource());
    //执行查询操作
    String sql = "SELECT * FROM classmate WHERE id = ?";
    Object[] params = {2};
    BeanHandler<Classmate> bh = new BeanHandler<>(Classmate.class);
    Classmate classmate = null;
    try{
        classmate = qr.query(sql,bh,params);
    } catch (Exception e){
        e.printStackTrace();
    }
    System.out.println(classmate.toString());
}


    public static void select03() throws Exception{
        //创建QueryRunner对象
        QueryRunner qr = new QueryRunner(getDataSource());
        //执行查询操作
        String sql = "SELECT * FROM classmate";
        Long number = qr.query(sql,new ScalarHandler<Long>());
        System.out.println("人数共有" + number);
    }
    public static void select04() throws Exception{
        //创建QueryRunner对象
        QueryRunner qr = new QueryRunner(getDataSource());
        //执行查询操作
        String sql = "SELECT * FROM classmate";
        List<String> list = qr.query(sql,new ColumnListHandler<String>("name" ));
        System.out.println(list);
    }

    public static void select05() throws Exception{
        //创建QueryRunner对象
        QueryRunner qr = new QueryRunner(getDataSource());
        //执行查询操作
        String sql = "SELECT * FROM classmate";
        //对象数组存储rs第一行数据的所有列
        Object[] values = qr.query(sql,new ArrayHandler());
        System.out.println(Arrays.toString(values));
    }
public static void select06() throws Exception{
    //创建QueryRunner对象
    QueryRunner qr = new QueryRunner(getDataSource());
    //执行查询操作
    String sql = "SELECT * FROM classmate";
    //对象数组存储rs第一行数据的所有列
    List<Object[]> values = qr.query(sql,new ArrayListHandler());
    for (Object[] value : values){
        System.out.println(Arrays.toString(value));
    }
}
public static void select07() throws Exception{
    //创建QueryRunner对象
    QueryRunner qr = new QueryRunner(getDataSource());
    //执行查询操作
    String sql = "SELECT * FROM classmate";
    Object map = qr.query(sql,new MapHandler());
    System.out.println(map);
}
    public static void select08() throws Exception{
        //创建QueryRunner对象
        QueryRunner qr = new QueryRunner(getDataSource());
        //执行查询操作
        String sql = "SELECT * FROM classmate";
        //列名为String类型，值为Object类型
        Map<String, Object> map = qr.query(sql,new MapHandler());
        System.out.println(map);
    }

public static void select09() throws Exception{
    //创建QueryRunner对象
    QueryRunner qr = new QueryRunner(getDataSource());
    //执行查询操作
    String sql = "SELECT * FROM classmate";
    //列名为String类型，值为Object类型
   List<Map<String, Object>> list = qr.query(sql,new MapListHandler());
   for (Map<String, Object> map : list){
       System.out.println(map);
   }
}


}
