/* 任务1 */
# 部门编号设置为主键 
ALTER TABLE dept
   ADD CONSTRAINT pk_dept_deptno 
   PRIMARY KEY (dept_no);


/* 任务2 */
# 创建员工表，emp_no为自增长主键
CREATE TABLE emp(
	emp_no INT PRIMARY KEY AUTO_INCREMENT,
	e_name VARCHAR(10),
	job VARCHAR(10),
	mgr INT,
	hirdate DATETIME,
	sal DOUBLE,
	comm DOUBLE,
	dept_no INT
);


/* 任务3 */
# 部门名称设置成唯一约束
ALTER TABLE dept ADD CONSTRAINT UNIQUE(d_name);

# 在创建表时可以直接设置唯一约束
CREATE TABLE dept(
	dept_no INT,
	d_name VARCHAR(14) UNIQUE,
	loc VARCHAR(13)
);


/* 任务4 */
# 员工的默认薪水设置为500
ALTER TABLE emp
	CHANGE COLUMN comm comm DOUBLE DEFAULT 500;

# 在创建表时直接设置默认约束
CREATE TABLE dept(
	dept_no INT,
	d_name VARCHAR(14),
	loc VARCHAR(13) DEFAULT "北京"
);


/* 任务5 */
# 为员工表设置部门外键  
ALTER TABLE emp
ADD CONSTRAINT  fk_dept_no  FOREIGN KEY ( dept_no ) REFERENCES  dept ( dept_no );


/* 任务6 */
# 测试添加数据违反外键约束
INSERT INTO emp(  
  emp_no, e_name, job, mgr, hirdate, sal,   
  comm, dept_no  
)   
VALUES   
  (  
    4001, '晁盖', '总裁', null, '2001-1-1',   
    6000, 10000, 40  
  );  


/* 任务7 */
# 测试删除数据违反外键约束   
DELETE FROM   
  dept   
WHERE   
  dept_no = 10;


/* 任务8 */
# 查看部门表dept中所有记录
SELECT * FROM dept;


/* 任务9 */
# 查询公司员工的姓名、工资、奖金信息
SELECT e_name，sal，comm FROM emp；


/* 任务10 */
# 查看公司所有员工工资等级
SELECT 
  DISTINCT sal 
FROM 
  emp;


/* 任务11 */
# 计算员工奖金增加500后的奖金结果
SELECT 
  e_name, 
  comm + 500 
FROM 
  emp;


/* 任务12 */
# 列的别名
SELECT
  e_name AS '姓名',
  comm+500 '预期奖金'
FROM
  emp;


/* 任务13 */
# 查询公司中薪水低于3000的所有员工
SELECT * FROM emp WHERE sal < 3000;


/* 任务14 */
#　查询薪水大于4000，奖金大于4000的所有员工
SELECT * FROM emp WHERE sal > 4000 and comm>4000;


/* 任务15 */
#　查询公司中奖金在1000~5000之间的所有员工
SELECT * FROM emp WHERE comm BETWEEN 1000 AND 5000;


/* 任务16 */
#　查询公司中职位为项目经理，项目组长的员工
SELECT * FROM emp WHERE job IN('项目经理','项目组长');


/* 任务17 */
#　查询姓宋的员工
SELECT * FROM emp WHERE e_name LIKE '宋%';


/* 任务18 */
#　查询姓名由三个字构成，并且以义结尾的员工。
SELECT * FROM emp WHERE e_name LIKE '__义';


/* 任务19 */
#　查询mgr的值为NULL的员工
SELECT * FROM emp WHERE mgr IS null;


/* 任务20 */
#　查询mgr的值不为NULL的员工
SELECT * FROM emp WHERE mgr IS NOT null;


/* 任务21 */
# 按照工资从高到低查询员工信息，工资相同的再按照奖金升序排序
SELECT
   *
FROM
   emp
ORDER BY
  sal DESC,
  comm ASC;


/* 任务22 */
# 分页查询员工信息
SELECT * FROM emp LIMIT 0,2;


/* 任务23 */
# 查询最高工资、最低工资、平均工资、总工资、公司总人数
SELECT 
  MAX(sal) 最高工资, 
  MIN(sal) 最低工资, 
  AVG(sal) 平均工资, 
  SUM(sal) 总工资, 
  COUNT(*) 公司总人数 
FROM 
  emp;


/* 任务24 */
# 统计每个部门的员工数量
SELECT dept＿no 部门编号,COUNT(*) 人数 FROM emp GROUP BY dept＿no;


/* 任务25 */
# 统计部门的员工数量超过3人的部门
SELECT dept_no 部门编号,COUNT(*) 人数 FROM emp GROUP BY dept_no HAVING COUNT(*)>3;


/* 任务26 */
# 笛卡尔积现象
SELECT * FROM emp ,dept;


/* 任务27 */
# 查询每个部门的所有员工
SELECT dept.d_name,emp.e_name FROM emp,dept WHERE emp.dept_no = dept.dept_no;


/* 任务28 */
# 查询当前公司员工和所属上级员工的信息
SELECT 
  e1.emp_no AS 员工编号, 
  e1.e_name AS 员工姓名, 
  e2.emp_no AS 领导编号, 
  e2.e_name AS 领导姓名 
FROM 
  emp AS e1, 
  emp AS e2 
WHERE 
  e1.mgr = e2.emp_no;


/* 任务29 */
# 查询每个部门的所有员工
SELECT dept.d_name,emp.e_name 
FROM emp INNER JOIN dept ON emp.dept_no = dept.dept_no;


/* 任务30 */
# 查询每个部门的所有员工
SELECT dept.d_name,emp.e_name 
FROM emp RIGHT OUTER JOIN dept ON emp.dept_no = dept.dept_no;


/* 任务31 */
# 查询软件部门下的所有员工
SELECT * FROM emp e 
WHERE e.dept_no = (SELECT d.dept_no FROM dept d WHERE d.d_name='软件部');


/* 任务32 */
# 统计所有的员工都分布在那些部门信息
SELECT * FROM dept d
WHERE d.dept_no IN (SELECT e.dept_no FROM emp e);


/* 任务33 */
# 查询公司中比任意一个员工的工资高的所有员工
SELECT * FROM emp e1
WHERE e1.sal >ANY(SELECT e2.sal FROM emp e2);


/* 任务34 */
# 查询公司中比所有的助理工资高但不是助理的员工
SELECT * FROM emp e1 
  WHERE e1.sal >ALL(SELECT e2.sal FROM emp e2 WHERE e2.job LIKE '%助理');


/* 任务35 */
# 查询公司中和员工张青相同薪水和奖金的员工
SELECT * FROM emp e1 
WHERE (e1.sal,e1.comm) = (SELECT e2.sal,e2.comm FROM emp e2 WHERE e2.e_name='张青');


/* 任务36 */
# 统计2000年以后入职，部门人数超过2人的部门，按照部门人数从多到少排序输出，分页显示，每页5条。
SELECT dept_no 部门编号, e_name 员工, hirdate 入职时间 FROM emp WHERE hirdate>='2000-01-01'
GROUP BY dept_no HAVING COUNT(*)>=2 ORDER BY COUNT(*)DESC LIMIT 0,5; 


/* 任务37 */
# 将字符串“ABCDefer”分别转为大写和小写
SELECT UPPER('AbcDef'), LOWER('AbcDef');


/* 任务38 */
# 将字符串连接
SELECT CONCAT('TE XUN', ' SQL');


/* 任务39 */
# 获取子字符串函数SUBSTR
SELECT SUBSTR('java web sniper', 10);