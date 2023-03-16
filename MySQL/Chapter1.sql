/* 任务1 */
# 创建公司信息数据库
CREATE DATABASE company_info;


/* 任务2 */
# 使用 company_info 数据库
USE company_info;


/* 任务3*/
# 删除 company_info 数据库
DROP DATABASE company_info;


/* 任务4：创建部门表和员工表*/
# 创建部门表  
CREATE TABLE dept(  
    dept_no INT,  
    d_name VARCHAR(14),  
    loc VARCHAR(13)  
); 

# 创建员工表  
CREATE TABLE emp(  
    emp_no INT,  
    e_name VARCHAR(10),  
    job VARCHAR(10),  
    mgr INT,  
    hirdate DATETIME,  
    sal DOUBLE,  
    comm DOUBLE,  
    dept_no INT  
);  


/* 任务5*/
# 创建和已有表结构一样的表  
CREATE TABLE emp1 LIKE emp;  


/* 任务6：以SQL形式和表格形式查看emp数据表*/
# 以SQL的形式展示表结构
SHOW CREATE TABLE emp;

# 以表格的形式展示表结构
DESC emp; 


/* 任务7*/
# 删除emp1数据表
DROP TABLE emp1;


/* 任务8：创建用户*/
#  user1用户只能在localhost这个IP登录mysql服务器  
CREATE USER 'user1'@'localhost' IDENTIFIED BY '1234';  
#  user2用户可以在任何电脑上登录mysql服务器  
CREATE USER 'user2'@'%' IDENTIFIED BY '1234';  


/* 任务9*/
# 使用 GRANT 语句创建test3 用户  
GRANT   
SELECT   
  ON *.* TO 'test3' @localhost IDENTIFIED BY 'test3';  


/* 任务10*/
# 修改用户  
RENAME USER 'test1'@'localhost' TO 'testUser1'@'localhost';  


/* 任务11*/
#  删除用户
 DROP USER 'test1'@'localhost';


/* 任务12*/
# DELETE 删除用户
DELETE FROM mysql.user WHERE Host='localhost'AND User='test2';



/* 任务13：给用户分配权限*/
#  给user1用户分配对test这个数据库操作的权限
GRANT CREATE,ALTER,DROP,INSERT,UPDATE,DELETE,SELECT ON test.* TO 'user1'@'localhost';

#  给user2用户分配对所有数据库操作的权限
GRANT ALL ON *.* TO 'user2'@'%';


/* 任务8：添加部门和员工*/
# 给dept表中添加数据
INSERT INTO dept VALUES(10, '人事部', '北京');
INSERT INTO dept(dept_no,d_name, loc) VALUES(20,'软件部', '深圳');
INSERT INTO dept VALUES(30, '销售部', '杭州');

# 给emp表中添加数据  
INSERT INTO emp(  
  emp_no, e_name, job, mgr, hirdate, sal, comm, dept_no  
) VALUES (  
    1001, '宋江', '董事长', null, '2001-1-1', 6000, 10000, 10  
  ); INSERT INTO emp(  
    emp_no, e_name, job, mgr, hirdate, sal, comm, dept_no  
  ) VALUES (  
    10011, '卢俊义', '董事助理', 1001, '2003-1-1', 3000, 1000, 10  
  ); INSERT INTO emp(  
    emp_no, e_name, job, mgr, hirdate, sal, comm, dept_no  
  ) VALUES (  
    10012, '吴用', '董事助理', 1001, '2001-1-1', 4000, 4000, 10  
  ); INSERT INTO emp(  
    emp_no, e_name, job, mgr, hirdate, sal, comm, dept_no  
  ) VALUES (  
    2001, '林冲', '项目经理', 1001, '2003-3-1', 6000, 5000, 20  
  ); INSERT INTO emp(  
    emp_no, e_name, job, mgr, hirdate, sal, comm, dept_no  
  ) VALUES (  
    20011, '李逵', '项目组长', 2001, '2001-1-1', 3000, 1000, 20  
  ); INSERT INTO emp(  
    emp_no, e_name, job, mgr, hirdate, sal, comm, dept_no
  ) VALUES (  
    20012, '扈三娘', '项目助理', 2001, '2003-1-1', 5000, 1000, 20  
  ); INSERT INTO emp(  
    emp_no, e_name, job, mgr, hirdate, sal, comm, dept_no  
  ) VALUES (  
    200111, '时迁', '程序员', 20011, '2004-1-1', 2000, 2000, 20  
  ); INSERT INTO emp(  
    emp_no, e_name, job, mgr, hirdate, sal, comm, dept_no  
  ) VALUES (  
    3001, '母夜叉', '销售经理', 1001, '205-1-1', 2000, 10000, 30  
  ); INSERT INTO emp(  
    emp_no, e_name, job, mgr, hirdate, sal, comm, dept_no 
  ) VALUES (  
    30011, '张青', '销售助理', 3001, '2005-3-1', 2000, 2000, 30  
  );  


/* 任务9*/
# 查询dept表
SELECT dept_no,d_name,loc FROM dept;


/* 任务10*/
# 修改emp表中员工李逵的奖金为3000
UPDATE emp SET comm = 3000 WHERE e_name='李逵';


/* 任务11*/
# 删除员工表emp中e_name为李逵的记录
DELETE FROM emp WHERE e_name='李逵';


/* 任务12*/
# 备份数据库company_info
mysqldump  -h127.0.0.1  -uroot  -proot company_info > c:/back.sql;


/* 任务13*/
# 还原数据库company_info
mysql  -h127.0.0.1  -uroot  -proot company_info < c:/back.sql;
