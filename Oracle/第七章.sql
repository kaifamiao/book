-- 1日期
-- 1.1日期格式
CREATE TABLE t_staff ( 
id  NUMBER(5), 
name  VARCHAR2(50), 
hiredate  DATE,
CONSTRAINT pk_staff_id PRIMARY KEY(id)
    );
INSERT INTO t_staff VALUES (1 , ‘张翠山’ , ‘20-10月-88’); 
INSERT INTO t_staff VALUES (2 , ‘张无忌’ , ‘20-10月-16’); 

ALTER SESSION SET nls_date_format = ‘日期模式’;

ALTER SESSION SET nls_date_format = 'yyyy-mm-dd hh24:mi:ss'; 

SELECT sysdate FROM dual; 

disconnect  -- 断开连接，会话结束 

connect kaifamiao/kaifamiao  -- 使用同一个用户重新建立会话 

SELECT sysdate FROM dual ;  -- 再次查询当前时间并查看日期格式 

ALTER system SET nls_date_format = ’日期模式’; 

-- 1.2日期类型
ALTER SESSION SET nls_date_format = 'yyyy-mm-dd hh24:mi:ss'; 

SELECT HIREDATE AS 入职日期 , DUMP(hiredate, 10) AS 内部格式 FROM t_staff ; 

CREATE TABLE t_user_logs ( 
id  NUMBER(10)  primary key, 
operation  VARCHAR2(50), 
operation_time  TIMESTAMP(9) 
); 

INSERT INTO t_user_Iogs VALUES (1 , '用户登录' , systimestamp);

SELECT dump(operation_time) FROM t_user_logs; 

SELECT operation_time FROM t_user_logs; 

ALTER SESSION SET nls_timestamp_format ='日期模式' ;

ALTER SESSION SET nls_timestamp_format = 'yyyy-mm-dd hh24:mi:ssXFF9';

SELECT sysdate + 1, systimestamp + 1 FROM dual; 

-- 2日期函数
-- 2.1获取时间
ALTER SESSION SET nls_ date_format = 'yyyy-mm-dd hh24:mi:ss'; 

SELECT sysdate FROM dual ; 

SELECT systimestamp FROM dual;

SELECT current_date FROM dual ; 

SELECT current_timestamp FROM dual; 

SELECT current_timestamp FROM dual; 

-- 2.2日期转换
SELECT to_char( sysdate , 'yyyy-mm-dd hh24:mi:ss') AS 当前时间FROM dual; 

SELECT to_char(systimestamp, 'yyyy-mm-dd hh24:mi:ssXFF') as 当前时间 FROM dual;

SELECT to_char( systimestamp, 'yyyy-mm-dd hh24:mi:ssXFF3') as 当前时间FROM dual; 

SELECT to_date('1985-04-25' 'yyyy-mm-dd') birthdate FROM dual; 

SELECT to_timestamp( '2011-09-29 21:16:03.666888999', 'yyyy-mm-dd hh24:mi:ssxff') AS天宫一号发射时间 FROM dual;

SELECT to_char (to_date('04-05-14','dd-mm-yy') , 'dd-mm-yyyy') date1, 
to_char ( to_ date('04-05-75','dd-mm-yy') , 'dd-mm-yyyy') date2 
FROM dual; 

SELECT to_char(to_date( '04-05-14','dd-mm-rr'), 'dd-mm-yyyy') date1,
     to_char(to_date('04-05-75','dd-mm-rr'), 'dd-mm-yyyy') date2 
FROM dual ; 

-- 2.3日期计算
SELECT last_day(sysdate) FROM dual;

SELECT last_day (to_date('1999-08-19' , 'yry-mm-dd' )) FROM dual ; 

SELECT to_char( 
last_day(to_date('1999-08-19' , 'yyyy-mm-dd') , 'yyyy-mm-dd hh24:mi:ss')
FROM dual;

SELECT next_day(sysdate,'星期五') FROM dual; 

SELECT to_char(next_day(to_date('2006-12-31', 'yyyy-mm-dd'), '星期六'), 'yyyy-mm-dd DAY') FROM dual;

SELECT to_char(next_day(last_day(to_date('1996-02-01','yyyy-mm-dd')) - 7, 'TUESDAY'), 'yyyy-mm-dd DAY') FROM dual;

-- 3.4其他单行函数
SELECT ename , sal , comm, nvl2( comm, sal + comm, sal ) FROM emp 
WHERE deptno = 30;