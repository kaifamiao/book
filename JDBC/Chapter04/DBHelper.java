package Chapter04;
//Chapter04/DBHelper.java
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 通用数据访问层，通用是指能执行任何表的sql语句
 * DBHelper类的任务就是执行sql语句
 */
public class DBHelper {
    private Connection conn = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private static final String URL = "jdbc:mysql://localhost:3306/jdbcdemo";
    private static final String USER = "root";
    private static final String PASS = "root";
    private void getConnection() throws Exception {
        if (conn != null || conn.isClosed()) {
            Class.forName("com.mysql.jdbc.Driver");
            conn = java.sql.DriverManager.getConnection(URL, USER, PASS);
        }
    }
    /**
     * 执行添加，删除，修改的sql语句
     * @param sql 要执行的sql语句
     * @param values sql语句中参数的值
     * @return 返回影响的行数
     * @throws SQLException
     * @throws ClassNotFoundException
     * */
    public int executeUpdate(String sql,Object ...values) throws
            Exception {
        //1:获取连接对象conn
        getConnection();
        //2:创建执行语句对象
        pstmt = conn.prepareStatement(sql);
        //3:为占位符?赋值
        setParameter(values);
        //4:执行sql语句
        return pstmt.executeUpdate();
    }
    /**
     * 为sql语句中的占位符？赋值
     * */
    private void setParameter(Object ...values) throws SQLException{
        if(values!=null && values.length>0){
            for (int i = 0; i < values.length; i++) {
                pstmt.setObject(i+1, values[i]);
            }
        }
    }
    /**
     * 执行查询的sql语句
     * @param sql 要执行的sql语句
     * @param values sql语句中参数的值
     * @return 返回查询结果集
     * @throws SQLException
     * @throws ClassNotFoundException
     * */
    public ResultSet executeQuery(String sql,Object ...values) throws Exception {
        //连接数据库
        getConnection();
        //创建执行语句对象
        pstmt = conn.prepareStatement(sql);
        setParameter(values);
        //执行查询
        rs = pstmt.executeQuery();
        //返回查询结果集
        return rs;
    }
    /**
     * 关系资源
     * */
    public void close() throws SQLException{
        if(rs!=null){
            rs.close();
            rs = null;
        }
        if(pstmt!=null){
            pstmt.close();
            pstmt = null;
        }
        if(conn!=null && conn.isClosed()==false){
            conn.close();
            conn = null;
        }
    }
}