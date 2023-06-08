-- 1序列
-- 1.1创建序列
CREATE SEQUENCE seq_users_id
START WITH 200
INCREMENT BY 1
MAXVALUE 999999
MINVALUE 1
CACHE 10
NOCYCLE 
ORDER; 

-- 1.2使用序列
SELECT seq_users_id.nextval FROM dual;

SELECT seq_users_id.currval FROM dual;

INSERT INTO users VALUE( seq_usersid.nextval ,'han' , 'Man' , '135');

-- 2视图
-- 2.1创建视图 
CREATE VIEW han_ view_emp
SELECT empno, ename, job, hiredate, deptno FROM emp ;

CREATE VIEW han_v_dept_emp
AS
SELECT a.deptno, a.dname, a.oc, b.empno, b.ename, b.sal
FROM dept a, emp b
WHERE a.deptno=b.deptno and a.deptno in (10,30);

CREATE VIEW han_v_emp_job_sal
(job,avgsal , sumsal , maxsal , minsal)
AS
SELECT job, avg(sal), sum(sal), max(sal), min(sal)
FROM emp
GROUP BY job;

-- 2.2使用视图
SELECT job, avgsal , sumsal, maxsal, minsal FROM han_v_emp_job_sal;

SELECT * FROM han_v_emp_job_sal ; 

-- 2.3删除视图
DROP VIEW view_name;

-- 3索引
-- 3.1创建索引
CREATE INDEX han_user_index_1 ON han_user (id asc , sex desc ); 
CREATE INDEX han_user_index_1 ON han_ user (sex desc , id asc); 