-- 1多表查询
-- 创建专业表
CREATE TABLE t_majors ( 
id NUMBER(5) CONSTRAINT pk_t_majors_id PRIMARY KEY,
name VARCHAR2(50)
);
-- 创建班级表
CREATE TABLE t_classes (
id NUMBER(5) CONSTRAINT pk_t_classes_id PRIMARY KEY,
name VARCHAR2(50),
major_id NUMBER(5)
FOREIGN KEY(major_id) REFERENCES t_majors(id)
);

-- 插入专业
INSERT INTO t_majors (id, name) VALUES (1, ‘软件’); 
INSERT INTO t_majors (id, name) VALUES (2, ‘金融’); 
-- 插入班级 
INSERT INTO t_classes (id, name, major_id) VALUES (1, ‘开发’, 1),
INSERT INTO t_classes (id, name, major_id) VALUES (2, ‘测试’, 1), 
INSERT INTO t_classes (id, name, major_id) VALUES (3, ‘会计’, NULL);

-- 1.1表的别名
SELECT m.id , m.name FROM t_majors m; 

SELECT m.id, m.name ,cid, c.name FROM t_majors m, t_classes c;

-- 1.2笛卡尔积
SELECT * FROM t_majors m, t_classes c;

-- 1.3内连接
SELECT * FROM t_majors m 
INNER JOIN t_classes c 
ON c.major_id = m.id; 

SELECT * FROM t_majors m 
INNER JOIN t_classes c 
ON c.major_id = m.id; 

SELECT e.ename, e.sal, g.grade 
FROM emp e INNER JOIN salgrade g 
ON e.sal between g.losal and g.hisal; 

SELECT e.ename , e.sal, g.grade 
FROM emp e, salgrade g 
WHERE e.sal>=g.losal and e.sal<=g.hisal; 

-- 1.4外连接
SELECT * FROM t_majors m
INNER JOIN t_classes c
ON c.major_id = m.id;

SELECT * FROM t_majors m 
LEFT OUTER JOIN t_classes c 
ON c.major_id = m.id; 

SELECT * FROM t_majors m 
RIGHT OUTER JOIN t_classes c 
ON c.major_id = m.id; 

SELECT * FROM t_majors m 
FULL OUTER JOIN t_classes c 
ON c_major_id = m.id; 

-- 2子查询
-- 2.1单行子查询
SELECT empno , ename , sal , job FROM emp 
    WHERE job =( 
    SELECT job FROM emp WHERE ename= ‘SMITH’ 
    );

SELECT job , avg (sal) FROM emp 
    GROUP BY job 
    HAVING avg (sal) > ( SELECT avg(sal) FROM emp ) 

SELECT e.empno, e.ename , e.sal , e.job , a.avgsal 
    FROM emp e ( SELECT avg(sal) avgsal FROM emp ) a 
    WHERE e.sal > a.avgsal;

SELECT first_name, dept_id FROM s_emp
WHERE dept_id =(SELECT id FROM s_dept);

SELECT first_name , dept_id FROM s_emp
WHERE dept_id in (SELECT id FROM s_dept ORDER BY id);

-- 2.2多行子查询
SELECT ename , deptno , job , sal FROM emp
    WHERE job IN(
        SELECT distinct job FROM emp WHERE deptno = 20
    ); 

SELECT ename , deptno , job , sal FROM emp 
WHERE job NOT IN (
SELECT distinct job FROM emp WHERE deptno=20 );

SELECT ename , deptno , sal , job FROM emp 
WHERE sal >any (SELECT sal FROM emp WHERE deptno = 20);

SELECT ename , deptno , sal, job FROM emp
WHERE sal=any( SELECT avg (sal) FROM emp GROUP BY job );

SELECT ename, deptno, sal , job FROM emp 
WHERE sal IN (select avg (sal) FROM emp GROUP BY job);

SELECT ename , deptno , sal , job FROM emp 
WHERE sal > all (SELECT sal FROM emp WHERE deptno=20);

-- 2.3多列子查询
SELECT ename, deptno, sal, job FROM emp 
WHERE (deptno,job)=( 
SELECT deptno, job FROM emp WHERE ename='SMITH' 
);

-- 2.4关联子查询
SELECT id, first_name, salary, dept_id 
FROM s_emp b
WHERE salary = (SELECT max(salary) FROM s_emp a WHERE a.dept_id =b.dept_id); 

SELECT deptno,
(SELECT max(sal) FROM emp b WHERE b.deptno = a.deptno) maxsal 
FROM emp a 
ORDER BY deptno; 

SELECT ename , deptno, sal , job
FROM emp 
WHERE exists (
SELECT * FROM dept
WHERE dept.deptno = emp.deptno and dept.Ioc = 'NEW YORK'
);

SELECT ename, deptno, sal , job, loc 
FROM emp 
WHERE exists (
     SELECT * FROM dept
         WHERE dept.deptno=emp.deptno and dept.Ioc = ’NEW YORK’
);

