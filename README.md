# BJTU Spring CMS

see [vue front end](https://github.com/yangxiaobinhaoshuai/BJTU_M502034B_Springboot_CMS_Vue_frontend)
- 开发平台建议使用IDEA，后台使用spring boot框架，前端使用Echarts和Layui框架开发制作一个信息统计页面；
- 采用Spring Boot框架实现系统，采用Model作为数据容器，Reppository作为数据库交互层，Controller作为业务逻辑层，Jsp作为前端展示层；
- 前端与后台的数据交互要求使用Ajax
- 代码编写及注释规范要求执行《C/C++、Java编程规范》标准；

### mysql

- mysql -u bjtu_root -p
- 12345
- show databases;
- CREATE DATABASE db_traveler;
- use db_traveler;
- show tables;
- select * from travelers;

- drop table travelers;

#### Create Table

CREATE TABLE travelers (
id INT PRIMARY KEY AUTO_INCREMENT,
gender INT,
birth_year INT,
total_miles INT,
total_times INT
);

#### Show Columns

show columns from travelers;
show full columns from travelers;

#### Insert element

INSERT INTO travelers (id, gender, birth_year, total_miles, total_times)
VALUES (1, 1, 1990, 5000, 10);

#### Delete element

DELETE FROM travelers
WHERE id = 123;
