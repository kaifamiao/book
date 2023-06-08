-- 2 Oracle概述
-- 2.4用户和权限
-- 2.4.1.SQL*Plus
sqlplus sys/sys as sysdba

-- 2.4.2.创建用户
CREATE USER kaifamiao
IDENTIFIED BY kaifamiao	
ACCOUNT UNLOCK; 

ALTER USER 用户名 ACCOUNT LOCK | UNLOCK;

-- 2.4.4.授权
GRANT CONNECT TO kaifamiao;
GRANT RESOURCE TO kaifamiao;

