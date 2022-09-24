
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
Show databases;
USE prac02;
select database();
show tables;
create table HR(
    id int comment 'id',
  name varchar(50) comment 'name',
  age int comment 'age',
  gender varchar(1) comment 'gender'

) comment 'HR table';

desc hr;
# describe HR table
SHOW CREATE TABLE HR;

INSERT INTO HR(id, name, age, gender) VALUES
                                        (01,'Amy',20,'F'),
                                        (02,'Bob',23,'M'),
                                        (03,'Kate',19,'F'),
                                        (04,'David',21,'M');

SELECT * from HR;

create table Finance(
    id int comment 'id',
  name varchar(50) comment 'name',
  age int comment 'age',
  gender varchar(1) comment 'gender'
                    ) comment 'Finance table';

INSERT INTO Finance(id, name, age, gender) VALUES
                                        (01,'CEO',30,'M'),
                                        (02,'Amy',20,'F'),
                                        (03,'CFO',19,'F'),
                                        (04,'CTO',21,'M');

UPDATE Finance SET id = 00 where name = 'CEO';
Update Finance set name = 'CCO' where id = 02;

# 内连接
# 隐式内连接
SELECT * from HR, Finance where HR.id = Finance.id;
# 显式内连接
SELECT * from HR inner join Finance F on HR.age = F.age order by hr.age;

# 外连接
# 左外连接
select F.*,H.* from Finance F left outer join HR H on F.name = H.name;
# 右外连接
select F.*,H.* from Finance F right outer join HR H on F.age = H.age;

#自连接
SELECT a.name,b.name from Finance a, Finance b where a.age = b.age;

# union, union all
SELECT name from HR H
union
select name from Finance F;

SELECT age from HR H where h.age > 20
UNION ALL
Select id from Finance F where F.id = 00;

select * from HR where id = 01 or name is not null
union
select * from Finance;

#子查询

# 标量子查询
# including = <> > >= etc.


# substring
# distinct
select distinct * from HR
where substr(gender,1,1) is not null;

# Cast converting data types
select id
from prac02.hr h
order by id desc
;

