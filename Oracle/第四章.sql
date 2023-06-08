-- 2简单查询
-- 2.1查询部分列
SELECT empno , ename , job, sal FROM EMP;

-- 2.2查询全部列
SELECT * FROM DEPT ;

-- 2.3.1.ROWID
 SELECT rowid, empno, ename, FROM EMP ;

 -- 2.3.2.ROWNUM
 SELECT * FROM (
    SELECT ROWNUM AS r, t.* FROM (
        SELECT e.* FROM emp e 
        INNER JOIN dept d ON e.deptNO = d.deptNO 
        ORDER BY e.empNO DESC
    ) t
    WHERE ROWNUM < 9
) 
WHERE r > 4;

-- 2.4虚表
SELECT * FROM dual;

SELECT  sysdate  FROM  dual;    

SELECT sysdate  FROM  dept;

SELECT  to_char ( sysdate , ‘YYYY-MM-DD HH24:MI:SS’ )  FROM dual ;

-- 2.5算数运算符
SELECT 10 + 20 FROM dual;

SELECT 50 - 9.8 FROM dual;

SELECT 5 * 5 * 3.14 FROM dual;

SELECT 10 / 3 FROM dual;

SELECT empno , ename , sal * 12 FROM emp ;

SELECT 2 % 3 FROM dual;

SELECT mod( 7 , 3 ) FROM dual;

-- 2.6列的别名
SELECT empno 编号 , ename 姓名 FROM emp ;

SELECT empno AS 编号 ,  ename AS 姓名 , sal * 12 AS 年薪 FROM emp ;

-- 2.7拼接
SELECT id AS 编号, first_name || ' ' || last_name AS 姓名 FROM s_emp;

-- 2.8空值
SELECT NVL( ‘非空’, ‘默认值’) FROM dual;

SELECT NVL( null , ‘默认值’) FROM dual;

SELECT NVL(100 , ‘默认值’) FROM dual;

SELECT NVL(TO_CHAR(100), ’默认值’) FROM dual;

SELECT empno, ename, NVL(TO_CHAR(mgr), 'BOSS') AS manager FROM emp;

-- 2.9DISTINCT
SELECT deptno FROM emp; 

SELECT ALL deptno FROM emp; 

SELECT ALL deptno FROM emp; 

SELECT DISTINCT deptno FROM emp;

SELECT DISTINCT deptno, job FROM emp; 

SELECT DISTINCT deptno FROM emp;
SELECT DISTINCT deptno, job FROM emp;

SELECT deptno, DISTINCT job FROM emp; 
SELECT deptno , DISTINCT job FROM emp 

-- 3数据过滤
-- 3.1比较运算符
SELECT id FROM s_emp WHERE id > any(22,20); 

SELECT id FROM s_emp WHERE id > 20; 

SELECT id FROM s_emp WHERE id < any(22,20); 

SELECT id FROM s_emp WHERE id <22; 

SELECT id FROM s_emp WHERE id = any(22,20); 

SELECT id FROM s_emp WHERE id = 22 or id=20; 

SELECT id FROM s_emp WHERE id > all(22,20);     

SELECT id FROM s_emp WHERE id > 22

SELECT id FROM s_emp WHERE id < all(22, 20); 

SELECT id FROM s_emp WHERE id < 20;

-- 3.2SQL 运算符
SELECT id FROM s_emp WHERE id in (22,20); 

SELECT id FROM s_emp WHERE id = any(22,20); 

SELECT id, last_name FROM s_emp WHERE lower(last_name) LIKE ' _a% ';

SELECT tname FROM tab WHERE tname LIKE 'S_% ESCAPE'; 

SELECT table_name FROM user_tables 
WHERE table_name like ‘S_%’ ; --首字母是S，后边一定还有一个字母 

SELECT table_name FROM user_tables 
WHERE table_name='_LORD' escape; 

SELECT id,last_name FROM s_emp
WHERE last_name LIKE '%a%e%' OR la
st_name LIKE '%e%a%';

-- 3.4数据分组
-- 3.4.1.组函数
SELECT max(b.name) , avg(a.salary) , max(c.name)
FROM s_emp a , s_dept b , s_regin c
WHERE a.dept_id = b.id and b.regiON_egiON_id=c.id
GROUP BY b.id; 

-- 3.4.2.GROUP BY子句
SELECT deptno, avg(sal), max(sal) 
FROM emp 
GROUP BY deptno;

SELECT deptno, avg(sal), max(sal) 
FROM emp 
GROUP BY deptno 
ORDER BY avg(sal); 

SELECT deptno, job, avg(sal),max(sal) 
FROM emp 
GROUP BY deptno, job ; 

SELECT deptno + 1,substr( job, 2,2),avg( sal),max( sal) 
FROM emp 
GROUP BY deptno , job; 

SELECT deptno , job, avg( sal),max( sal) 
FROM emp 
GROUP BY deptno, job,avg(sal);  --（参见前面使用组函数注意事项） 

SELECT (deptno + 1)*2,job,avg (sal), max(sal) 
FROM emp 
GROUP BY job; 

SELECT deptno, job , avg (sa), max(sal)3 
FROM emp 
WHERE deptno in (10,20) 
GROUP BY job , deptno; 

SELECT deptno, job, avg (sal) , max(sal) 
FROM emp 
WHERE deptno in (10,20) 
GROUP BY deptno, job;  -- 按默认排序 

SELECT deptno, job, avg (sal), max(sal) 
FROM emp 
WHERE deptno in (10,20) 
GROUP BY deptno, job
ORDER BY deptno desc; -- 自定义，按照 deptno 降序排列

SELECT deptno, job, avg (sal), max(sal) FROM emp; 

SELECT deptno, job , avg (sal), max(sal) 
FROM emp 
WHERE deptno in (10,20) 
GROUP BY deptno, job 
HAVING avg(sal) > 1500 
ORDER BY deptno desc; 

-- 3.4.3.HAVING 子句 
SELECT deptno, avg(sal), max(sal) FROM emp GROUP BY deptno HAVING avg(sal) > 2000; 

SELECT deptno,avg(sal), max(sal) 
FROM emp 
WHERE avg (sal)>2000
GROUP BY deptno;

SELECT deptno, avg(sal), max(sal) 
FROM emp 
GROUP BY deptno 
WHERE avg(sal) >2000; 

-- 3.5数据排序
SELECT first name , 12 * salary 
FROM s_emp 
ORDER BY salary desc;

SELECT first name, 12 * salary AS 年薪 
FROM S.emp 
ORDER BY 年薪 desc; 

SELECT first name , 12 * salary AS 年薪 
FROM s_ emp 
ORDER BY 2 desc; 

SELECT first name , salary*12 , commission pct 
FROM semp 
ORDER BY salary desc, commission_ pct desc; 