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


/* 任务7 */
# 给表 emp 添加列 age 
ALTER TABLE emp ADD age int(4);
 

/*  任务8*/
# 修改emp表中的age列的数据类型为varchar(6)
ALTER TABLE emp MODIFY age varchar(6);


/*  任务9*/
# 修改emp表中age列的数据类型为int类型
ALTER TABLE emp CHANGE age age int(4);


/*  任务10*/
# 修改emp 表age列名为birthday，类型为varchar(20)
ALTER TABLE emp CHANGE age birthday varchar(20);


/*  任务11*/
#  删除emp表的birthday列
ALTER TABLE emp DROP birthday;


/*  任务12*/
#  将表emp1的表名改为 employee
RENAME TABLE emp1 TO employee;


/*  任务13*/
# 将表employee的表名改为 emp2;
ALTER TABLE employee RENAME AS emp2;


/* 任务14*/
# 删除emp2数据表
DROP TABLE emp2;


/* 任务15：创建用户*/
#  user1用户只能在localhost这个IP登录mysql服务器  
CREATE USER 'user1'@'localhost' IDENTIFIED BY '1234';  
#  user2用户可以在任何电脑上登录mysql服务器  
CREATE USER 'user2'@'%' IDENTIFIED BY '1234';  


/* 任务16*/
# 使用INSERT 创建用户user3
INSERT INTO mysql.user (Host, User, authentication_string, ssl_cipher, x509_issuer, x509_subject) VALUES('localhost', 'user3','','', '', '');


/* 任务17*/
# 将用户user1重命名为testUser1  
RENAME USER 'user1'@'localhost' TO 'testUser1'@'localhost';  


/* 任务18*/
#  修改用户user3 的密码为user3
SET PASSWORD FOR user3@localhost = 'user3';


/* 任务19*/
#修改用户user3的密码为1234
UPDATE mysql.user SET authentication_string= SHA1('1234') WHERE user='user3' AND host='localhost';


/* 任务20*/
#  删除用户testUser1
 DROP USER 'testUser1'@'localhost';


/* 任务21*/
# DELETE 删除用户
DELETE FROM mysql.user WHERE Host='localhost'AND User='user2';


/* 任务22*/
# 查看user3的权限
SHOW GRANTS FOR 'user3'@localhost;


/* 任务23：给用户分配权限*/
#  给user3用户分配对test这个数据库操作的权限
GRANT CREATE,ALTER,DROP,INSERT,UPDATE,DELETE,SELECT ON test.* TO 'user3'@'localhost';

#  给user2用户分配对所有数据库操作的权限
GRANT ALL ON *.* TO 'user2'@'%';


/* 任务24 */
# 取消用户 user3 的插入权限
REVOKE INSERT ON test.* FROM 'user3'@'localhost';


/* 任务25：添加部门和员工*/
# 给dept表中添加数据
INSERT INTO dept VALUE(10, '人事部', '北京');
INSERT INTO dept(dept_no,d_name, loc) VALUES(20,'软件部', '深圳');
INSERT INTO dept VALUES(30, '销售部', '杭州');

# 给emp表中添加数据  
INSERT INTO emp
    (emp_no, e_name, job, mgr, hirdate, sal, comm, dept_no  ) 
VALUE
    (1001, '宋江', '董事长', null, '2001-1-1', 6000, 10000, 10),
    (10011, '卢俊义', '董事助理', 1001, '2003-1-1', 3000, 1000, 10),
    (10012, '吴用', '董事助理', 1001, '2001-1-1', 4000, 4000, 10),
    (2001, '林冲', '项目经理', 1001, '2003-3-1', 6000, 5000, 20),
    (20011, '李逵', '项目组长', 2001, '2001-1-1', 3000, 1000, 20),
    (20012, '扈三娘', '项目助理', 2001, '2003-1-1', 5000, 1000, 20),
    (200111, '时迁', '程序员', 20011, '2004-1-1', 2000, 2000, 20),
    (3001, '母夜叉', '销售经理', 1001, '2005-1-1', 2000, 10000, 30),
    (30011, '张青', '销售助理', 3001, '2005-3-1', 2000, 2000, 30);  


/* 任务26*/
# 查询dept表
SELECT dept_no,d_name,loc FROM dept;


/*任务27*/
# 查询dept表并给字段和表起别名
SELECT dept_no AS ID，d_name NAME, loc ADDRESS FROM dept AS DEPT;


/* 任务28*/
# 修改emp表中员工李逵的奖金为3000
UPDATE emp SET comm = 3000 WHERE e_name='李逵';


/* 任务29*/
# 删除员工表emp中e_name为李逵的记录
DELETE FROM emp WHERE e_name='李逵';


/* 任务30*/
# 备份数据库company_info
mysqldump  -h127.0.0.1  -uroot  -proot company_info > c:/back.sql;


/* 任务31*/
# 还原数据库company_info
mysql  -h127.0.0.1  -uroot  -proot company_info < c:/back.sql;
