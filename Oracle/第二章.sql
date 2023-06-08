-- 2创建表
CREATE TABLE t_students ( 
id NUMBER(5),
name VARCHAR2(30), 
gender CHAR(3) 
);

-- 2.1创建标准表
CREATE TABLE t_users ( 
id NUMBER(5), 
name varchar2(10),
password VARCHAR2(32),
phone VARCHAR2(15)
);

-- 2.2.1.事务临时表
CREATE global temporary TABLE temp1 ( 
id NUMBER(9)  PRIMARY KEY ,
name VARCHAR2(20) NOT NULL
)ON COMMIT DELETE ROWS ; 

CREATE global temporary TABLE temp2 ( 
id NUMBER(9)  PRIMARY KEY, 
name VARCHAR2(20) NOT NULL
);

CREATE global temporary TABLE temp_tran (id number);
savepoint pointl;
INSERT INTO temp_tran VALUES (222);
SELECT * FROM temp_tran; -- 查询数据
ROLLBACK; --回滚事务
SELECT * FROM temp_tran; -- 重新查询

-- 2.2.2.会话临时表
CREATE global temporary TABLE temp_session (name varchar2(20));

INSERT INTO temp_session VALUES ('kaifamiao'); 

SELECT * FROM temp_ session; 

SELECT * FROM temp_session; 

-- 2.2.3.通过查询创建表
CREATE TABLE new_emp AS SELECT * FROM emp;

CREATE TABLE new_emp_2 AS SELECT * FROM emp WHERE 1 = 2;

CREATE TABLE new_emp_3 
AS SELECT empno, ename AS emp_name, mgr AS manager 
FROM emp NOLOGGING;

-- 2.2.4.查看表的系统信息
DESCRIBE t_users;

DESCRIBE user_tables;

-- 3更改表
-- 3.1增加列
ALTER TABLE t_users
ADD (hometown varchar2(50));

-- 3.2修改列
ALTER TABLE t_users
MODIFY (hometown VARCHAR2(60));

ALTER TABLE table_name RENAME COLUMN old_column_name TO new_column_name;

ALTER TABLE t_users RENAME COLUMN hometown TO address;

-- 3.3删除列 
ALTER TABLE t_users DROP (address);

-- 4重新命名表
RENAME t_users TO t_customers;

ALTER TABLE t_customers RENAME TO t_users;

ALTER TABLE schema_name.old_table_name RENAME TO schema_name.new_table_name;

-- 5删除表
-- 5.1删除表
DROP TABLE t_users;

DROP TABLE table_name PURGE;

-- 5.2恢复被删除的表
SELECT original_name, object_name, droptime FROM recyclebin;

FLASHBACK TABLE 原表名 TO BEFORE DROP;

PURGE RECYCLEBIN;

-- 6截断表