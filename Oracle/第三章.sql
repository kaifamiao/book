-- 1插入数据
-- 1.2插入数据
INSERT INTO t_user VALUES (1, '张翠山', '男', '123456');

INSERT INTO t_user (id, name) VALUES (2, '殷素素');

-- 1.3插入空值
INSERT INTO t_user VALUES (3, '张无忌', NULL, NULL);

INSERT INTO t_user VALUES (4, '敏敏''特穆尔', '女', '12"33"');

-- 1.5INSERT SELECT
INSERT INTO x_users
SELECT * FROM t_users;

-- 2更新数据
UPDATE t_users SET name = '李二牛' WHERE id = 3;

-- 3删除数据
DELETE FROM t_users WHERE id = 3;
