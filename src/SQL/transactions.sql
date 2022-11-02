create table account(
    id int auto_increment primary key comment 'Primary KEY ID',
    name varchar(10) comment 'Name',
    money int comment 'Balance'
) comment '账户表';
insert into account(id, name, money) values (null,'A',2000),(null,'B',2000);

update account set money = 1999 where name = 'A' or name = 'B';

select * from account where name = 'A';
update account set money = money - 1000 where name = 'A';
update account
set money = money + 1000
where name = 'B';