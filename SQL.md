
# DDL Data definition language
# DML Data manipulation language
# DQL Data query language
# DCL Data control language


# DDL
SHOW DATABASES;

CREATE DATABASE IF NOT EXISTS prac02 default char set utf8mb4;

DROP DATABASE IF EXISTS prac01;

USE prac02;

SELECT DATABASE();

SHOW tables;

CREATE TABLE tb_user(
  id int comment 'id',
  name varchar(50) comment 'name',
  age int comment 'age',
  gender varchar(1) comment 'gender'

) comment 'user table';

DESC user;

SHOW CREATE TABLE user;

ALTER TABLE tb_user ADD NICKNAME VARCHAR(20) COMMENT 'nickname';
ALTER TABLE tb_user MODIFY NICKNAME INT COMMENT 'modified';
ALTER TABLE tb_user CHANGE USERNAME username VARCHAR(30) COMMENT 'username';
ALTER TABLE tb_user DROP  username;
ALTER TABLE tb_user RENAME TO user;

DROP TABLE IF EXISTS tb_user;
TRUNCATE TABLE user;
DESC user;

# DML

INSERT INTO user (id, name, age, gender) VALUE (1,'NANA',22,'M');
INSERT INTO user(id, name, age, gender) VALUE (2,'X',24,'F');
INSERT INTO user(id, name, age, gender) VALUE (4,'B',20,'F');
INSERT INTO user(id, name, age, gender) VALUE (7,'e',21,'F');

SELECT * FROM user;

UPDATE user SET name = 'Cindy' where id = 1;

DELETE FROM user WHERE id = 7;

# DQL
# Compiling order: Select, From, where, group by, having, order by, limit
# Executing order: from, where, group by, having, select, order by, limit.

INSERT INTO user(id, name, age, gender) VALUES
                                        (4,'5',20,'F'),
                                        (5,'C',23,'M'),
                                        (6,'D',19,'F'),
                                        (7,'D',21,'M');

SELECT name,id,gender from user;

SELECT * FROM user;

SELECT name "names" from user;

SELECT distinct gender 'sex' from user;

SELECT  * from user where age = 21;
SELECT  * from user where age <= 20;

# select where x is null

SELECT * FROM user order by age asc, id desc;
SELECT * FROM user WHERE gender = "F" AND AGE  BETWEEN 19 AND 21 ORDER BY id , id ASC LIMIT 5;

# Test executing order
SELECT name,e.age from user e where e.age > 19 order by e.age;

# DCL

select getdate();