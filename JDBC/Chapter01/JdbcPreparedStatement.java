package Chapter01;

import java.sql.*;

public class JdbcPreparedStatement {

    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/company_info","root","root");
            PreparedStatement stmt = conn.prepareStatement("SELECT emp_no,e_name,job FROM emp WHERE sal>?")){
            //设置参数
            int salSiza = 4000;
            stmt.setInt(1,salSiza);
            //执行查询
            System.out.println("执行查询...");
            ResultSet rs = stmt.executeQuery();
            System.out.println("查询成功...");
            while(rs.next()){
                int no = rs.getInt("emp_no");
                String name = rs.getString("e_name");
                String job = rs.getString("job");
                //输出数据
                System.out.print("EmpNo"+no);
                System.out.print(", Name"+name);
                System.out.println(", Job"+job);
            }
            //关闭资源
            rs.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("=====END=====");
    }
}
