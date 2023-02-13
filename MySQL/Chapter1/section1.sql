#创建公司信息数据库
CREATE DATABASE company_info;

#使用company_info数据库
USE company_info;

#删除company_info数据库
DROP DATABASE company_info;

#创建部门表  
CREATE TABLE dept(  
    deptno INT,  
    dname VARCHAR(14),  
    loc VARCHAR(13)  
); 

# 创建员工表  
CREATE TABLE emp(  
    empNo INT,  
    ename VARCHAR(10),  
    job VARCHAR(10),  
    mgr INT,  
    hirdate DATETIME,  
    sal DOUBLE,  
    comm DOUBLE,  
    deptno INT  
);  

#创建和已有表结构一样的表
CREATE TABLE emp1 LIKE emp;

#以SQL的形式展示表结构
SHOW CREATE TABLE emp;

#以表格的形式展示表结构
DESC emp; 

#删除emp1数据表
DROP TABLE emp1;

# 给dept表中添加数据
INSERT INTO dept VALUES(10, '人事部', '北京');
INSERT INTO dept(deptno,dname, loc) VALUES(20,'软件部', '深圳');
INSERT INTO dept VALUES(30, '销售部', '杭州');

# 给emp表中添加数据
INSERT INTO emp(empNo, ename, job, mgr, hirdate, sal, comm, deptno) 
VALUES(1001, '宋江', '董事长', null ,'2001-1-1', 6000, 10000, 10);
INSERT INTO emp(empNo, ename, job, mgr, hirdate, sal, comm, deptno) 
VALUES(10011, '卢俊义', '董事助理', 1001,'2003-1-1', 3000, 1000, 10);
INSERT INTO emp(empNo, ename, job, mgr, hirdate, sal, comm, deptno) 
VALUES(10012, '吴用', '董事助理', 1001,'2001-1-1', 4000, 4000, 10);
INSERT INTO emp(empNo, ename, job, mgr, hirdate, sal, comm, deptno) 
VALUES(2001, '林冲', '项目经理', 1001,'2003-3-1', 6000, 5000, 20);
INSERT INTO emp(empNo, ename, job, mgr, hirdate, sal, comm, deptno) 
VALUES(20011, '李逵', '项目组长', 2001,'2001-1-1', 3000, 1000, 20);
INSERT INTO emp(empNo, ename, job, mgr, hirdate, sal, comm, deptno) 
VALUES(20012, '扈三娘', '项目助理', 2001,'2003-1-1', 5000, 1000, 20);
INSERT INTO emp(empNo, ename, job, mgr, hirdate, sal, comm, deptno) 
VALUES(200111, '时迁', '程序员', 20011,'2004-1-1', 2000, 2000, 20);
INSERT INTO emp(empNo, ename, job, mgr, hirdate, sal, comm, deptno) 
VALUES(3001, '母夜叉', '销售经理', 1001,'205-1-1', 2000, 10000, 30);
INSERT INTO emp(empNo, ename, job, mgr, hirdate, sal, comm, deptno) 
VALUES(30011, '张青', '销售助理', 3001,'2005-3-1', 2000, 2000, 30);

#查询部门表
SELECT deptno,dname,loc FROM dept;

#修改emp表中员工李逵的奖金为3000
UPDATE emp SET comm = 3000 WHERE ename='李逵';

#删除员工表emp中ename为李逵的记录
DELETE FROM emp WHERE ename='李逵';

#备份数据库company_info
mysqldump  -h127.0.0.1  -uroot  -proot company_info > c:/back.sql;

#还原数据库company_info
mysql  -h127.0.0.1  -uroot  -proot company_info < c:/back.sql;
