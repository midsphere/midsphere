## 创建数据库语句
create database midsphere_dev character set utf8mb4
    collate utf8mb4_general_ci;

use midsphere_dev;


## 创建项目表
drop table if exists midsphere_project;
create table midsphere_project (
       id int primary key auto_increment comment '项目主键',
       project_name varchar(128) not null comment '项目名称',
       project_key varchar(32) not null unique comment '项目 key，用来关联, 唯一',
       project_owner varchar(32) default '' comment '项目归属人员',
       project_tester varchar(32) default '' comment '项目测试人员',
       products_location varchar(32) default '' comment '该项目下的所有应用打包存放的位置',
       status tinyint(1) default 0 comment '项目状态',
       create_at datetime default current_timestamp comment '创建项目时间',
       modify_at datetime default current_timestamp on update current_timestamp comment '项目修改时间'
)engine=InnoDB default character set utf8mb4 auto_increment=20210718 comment '项目表';


## 创建应用表
drop table if exists midsphere_application;
create table midsphere_application (
   id int primary key auto_increment comment '应用主键',
   app_name varchar(128) not null comment '应用名称',
   app_key varchar(32) not null unique comment '应用 key',
   app_type tinyint(1) not null comment '应用类型',
   app_language tinyint(2) comment '应用语言',
   create_user varchar(32) default '' comment '创建人',
   fk_project_key varchar(32) not null comment '应用关联的项目',
   status tinyint(1) default 0 comment '项目状态',
   create_at datetime default current_timestamp comment '创建项目时间',
   modify_at datetime default current_timestamp on update current_timestamp comment '项目修改时间'
)engine=InnoDB default character set utf8mb4 auto_increment=20210718 comment '应用表';