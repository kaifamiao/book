/*  任务1 */
# 创建银行数据库
CREATE DATABASE usermanager;

# 使用银行数据库
USE usermanager;

# 创建客户信息表
CREATE TABLE userinfo
(
  id INT PRIMARY KEY AUTO_INCREMENT,
  user_name VARCHAR(20),   #用户名
  user_pass VARCHAR(20)      #密码
);

 
/* 任务2 */
# 定义注册用户的存储过程
DELIMITER $$ 
CREATE PROCEDURE register(
  IN user_name VARCHAR(20), 
  IN user_pass VARCHAR(20), 
  OUT id INT
) BEGIN INSERT INTO userinfo(user_name, user_pass) 
VALUES 
  (user_name, user_pass); 
SELECT 
  LAST_INSERT_ID() INTO id; 
END $$


/* 任务3 */
#  调用存储过程，实现注册
SET 
  @id = 0; 
  CALL register('林冲', '123', @id); 
SELECT 
  @id;


/*  任务4 */
#  使用IF语句实现emp表中sal的变化 
DELIMITER $  
CREATE PROCEDURE test_if_pro(IN sal DOUBLE)  
BEGIN  
    IF sal<2000 THEN   
        DELETE FROM emp WHERE emp.sal=sal;  
    ELSEIF sal>=2000 AND sal<5000 THEN   
        UPDATE emp SET sal=sal+1000 WHERE emp.`sal`=sal;  
    ELSE   
        UPDATE emp SET sal=sal+500 WHERE emp.`sal`=salary;  
    END IF;   
END $  
DELIMITER;  
-- 调用  
CALL add_sal(4000, @salary);  

/* 任务5 */
# 使用case-when语句实现emp表中sal的变化
DELIMITER$$  
CREATE PROCEDURE test_case(sala DOUBLE)  
BEGIN     
    CASE  
        WHEN sala<3000 THEN   
            DELETE FROM emp WHERE emp.sal=sala;  
        WHEN sala<=5000 THEN   
            UPDATE emp SET emp.sal=emp.sal+1000 WHERE emp.sal=sala;  
        ELSE  
            UPDATE emp SET emp.sal=emp.sal+500 WHERE emp.sal=sala;  
    END CASE;  
END$$  
DELIMITER;  
  
#调用  
CALL test_if_case2(4000);  

/* 任务6 */
# 批量插入，根据次数插入到userinfo表中多条记录
DROP PROCEDURE pro_while1$
DELIMITER $
CREATE PROCEDURE pro_while1(IN insertCount INT)
BEGIN
	DECLARE i INT DEFAULT 1;
	WHILE i<=insertCount DO
		INSERT INTO userinfo(user_name, user_pass ) VALUES(CONCAT('kfm',i),CONCAT('kaifamiao',i));
		SET i=i+1;
	END WHILE;	
END $
DELIMITER;

-- 调用
CALL pro_while1(4)$

-- 查看表
SELECT * FROM userinfo;


# 创建userDetails表
CREATE TABLE UserDetails
(
  id INT PRIMARY KEY,
  age INT,
  tel VARCHAR(20),
  gender VARCHAR(20)
);
ALTER TABLE UserDetails ADD CONSTRAINT fk_UserInfo_UserDetails_Id FOREIGN KEY (id) REFERENCES UserInfo(id);


/* 任务7*/
#  使用触发器实现用户注册业务
DELIMITER $$ 
CREATE TRIGGER tr_register 
AFTER 
  INSERT ON userinfo FOR EACH ROW BEGIN INSERT INTO userdetails(id) 
VALUES 
  (NEW.id); 
END $$; 


/* 任务8*/
# 创建索引
CREATE INDEX ix_UserInfo_UserName ON userinfo(user_name);


/* 任务9*/
# 测试索引
EXPLAIN SELECT * FROM userinfo WHERE username='林冲';

/* 任务10*/
#  准备测试索引的记录
ELIMITER $
CREATE PROCEDURE pro_while(IN insertCount INT)
BEGIN
	DECLARE i INT DEFAULT 1;
	WHILE i<=insertCount DO
		INSERT INTO userinfo(user_name, user_pass ) VALUES('kfm','kaifamiao');
		SET i=i+1;
	END WHILE;	
END $
DELIMITER;

-- 调用
CALL pro_while(100000);

/*任务11*/
＃ 重新测试索引
EXPLAIN 
SELECT 
  * 
FROM 
  userinfo 
WHERE 
  user_name = 'kfm' ；


/* 任务12 */
#  测试索引对查询性能的提升
# 使用索引查询  
SELECT     
   *    
FROM     
   userinfo  
 WHERE  
   user_name = 'kfm';  


/* 任务13：使用视图查询员工信息*/
# 第一步：定义视图
CREATE VIEW v_emp AS 
SELECT 
  emp_no, 
  e_name, 
  d_name 
FROM 
  emp 
  INNER JOIN dept ON emp.dept_no = dept.dept_n;
# 第二步：查看视图
show tables;
# 第三步：使用视图
select  * from v_emp;

/* 任务14：实现转账功能*/  
-- 创建表  
CREATE TABLE account (  
    id INT PRIMARY KEY AUTO_INCREMENT,  
    NAME VARCHAR(10),  
    balance DOUBLE  
);  
-- 添加数据  
INSERT INTO account (NAME, balance) VALUES ('zhangsan', 1000), ('lisi', 1000);  
  
UPDATE account SET balance = 1000;  
SELECT * FROM account;  
-- 0. 开启事务  
START TRANSACTION;  
-- 1. 张三账户 -500  
UPDATE account SET balance = balance - 500 WHERE NAME = 'zhangsan';  
-- 2. 李四账户 +500  
-- 出错了...  
UPDATE account SET balance = balance + 500 WHERE NAME = 'lisi';  
  
-- 发现执行没有问题，提交事务  
COMMIT;  
  
-- 发现出问题了，回滚事务  
ROLLBACK;  






