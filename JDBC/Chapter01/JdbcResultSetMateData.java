package Chapter01;

import java.sql.*;

public class JdbcResultSetMateData {

    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/company_info","root","root");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM dept")) {
            //获取元数据
            ResultSetMetaData rsmd = rs.getMetaData();
            int numColumns = rsmd.getColumnCount();
            System.out.println("表中有 " + numColumns + " 列");
            //打印列名和列类型
            for (int i = 1; i <= numColumns; i++) {
                String columnName = rsmd.getColumnName(i);
                String columnType = rsmd.getColumnTypeName(i);
                System.out.println(columnName + " ( " + columnType + " ) ");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
