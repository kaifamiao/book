package Chapter01;

import java.sql.*;

public class JdbcResultSet {
    static final String DB_URL = "jdbc:mysql://localhost:3306/company_info";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/company_info","root","root");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT emp_no,e_name,job FROM emp")){
            //处理结果集
            System.out.println("处理结果集...");
            while(rs.next()){
                int no = rs.getInt("emp_no");
                String name = rs.getString("e_name");
                String job = rs.getString("job");
                //输出数据
                System.out.print("EmpNo"+no);
                System.out.print(", Name"+name);
                System.out.println(", Job"+job);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("=====END=====");
    }
}