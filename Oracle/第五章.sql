-- 2维护约束条件
-- 2.1非空约束 (not null )
CREATE TABLE t_customers(
id NUMBER(10),
username VARCHAR2(20),
password VARCHAR2(32) CONSTRAINT nn_customers_passwd NOT NULL
);

ALTER TABLE t_customers MODIFY (username NULL);

-- 2.2唯一性约束(unique key)
CREATE TABLE t_students (
id NUMBER(10), 
student_no VARCHAR2(12) CONSTRAINT uk_student_stuno UNIQUE,
name VARCHAR2(50) 
); 

ALTER TABLE t_ students ADD CONSTRAINT uk_student_id UNIQUE (id); 

ALTER TABLE t_students 
MODIFY id [ CONSTRAINT uk_student_id ] UNTQUE;

-- 2.3主键约束(primary key)
CREATE TABLE t_classes ( 
id NUMBER(10) CONSTRAINT pk_classes_ id PRIMARY KEY, 
name VARCHAR2(50) 
); 

CREATE TABLE t_teachers( 
id NUMBER(10), 
name VARCHAR2(50), 
CONSTRAINT pk_teachers_id PRIMARY KEY (id)
);

-- 创建表但未指定主健约束
CREATE TABLE t_products(
id NUMBER(10), 
name VARCHAR2(50), 
price NUMBER(10,2)
);

-- 追加主键约束
ALTER TABLE t_products
ADD CONSTRAINT pk_products_id PRIMARY KEY (id);

ALTER TABLE t_products 
MODIFY id CONSTRAINT pk_product_id PRIMARY KEY;

CREATE TABLE t_scores (
student id NUMBER(5),
course_id NUMBER(5),
score NUMBER(5,2),
CONSTRAINT pk_scores_sid_cid PRIMARY KEY (student_id, course_id)
); 

ALTER TABLE t_scores 
ADD CONSTRAINT pk_scores_sid_cid PRIMARY KEY (student_id,course_id);

-- 2.4外键约束 (foreign key)
CREATE TABLE parent ( 
id NUMBER(5) PRIMARY KEY, 
name VARCHAR2(20) 
); 

CREATE TABLE child (
id NUMBER(6) PRIMARY KEY,
name VARCHAR2(30),
pid NUMBER(5),
FOREIGN KEY (pid) REFERENCES parent(id) ON DELETE SET NULL
); 

-- 2.5检查约束 (check)
CREATE TABLE t_ masters( 
id NUMBER(4), 
name VARCHAR2(20), 
CONSTRAINT ck_masters_id_name CHECK (id > 1000 AND length(name >3) 
);

-- 创建表时大指定检查约束 
CREATE TABLE t_masters ( 
id NUMBER(4), 
name VARCHAR2(20)
);
-- 使用ALTER TABLE追加检查约束 
ALTER TABLE t_masters 
ADD CONSTRAINT ck_masters_id_name CHECK id >1000 and length(name) >3; 

-- 2.6缺省约束 (default)
CREATE TABLE t_employees(
id NUMBER(10) CONSTRAINT pk_employees_id PRIMARY KEY, 
name VARCHAR2(50),
gender VARCHAR2(6), 
hiredate DATAE DEFAULT current_date
);

-- 创建表时指定缺省约束 
CREATE TABLE t_employees (
id NUMBER(10) CONSTRAINT pk_erployees_id PRIMARY KEY, 
narne VARCHAR2(50),
gender VARCHAR2(6),
hiredate DATE DEFAULT current_date
);
-- 使用ALTER TABLE追加缺省约束 
ALTER TABLE t_employees MODIFY HIRDATE DATE DEFAULT current_date; 

INSERT INTO t_employees (id,name,gender) VALUES (9527,“华安”,’男’);

ALTER SESSION SET nls_date format = 'yyyy-mm-dd hh24:mi-ss'; 

SELECT id , name , gender , hiredate FROM t_employees; 