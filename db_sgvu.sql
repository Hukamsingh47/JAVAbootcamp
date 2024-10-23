create database db_sgvu;
use db_sgvu;
show tables;
create table student ( id int primary key, name varchar(100), mobile_no varchar(20), email_id varchar(100));
insert into student values (1001, "aman","9799605400","aman@gmail.com");
select * from student;
create table users (id int primary key auto_increment, username varchar(100), password varchar(100), balance decimal(10,2));

insert into users (username, password, balance) values ("ashwin","12345",10000);
select * from users;