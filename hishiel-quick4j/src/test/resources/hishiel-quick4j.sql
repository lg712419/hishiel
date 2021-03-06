create database if not exists hishiel_quick4j;

use hishiel_quick4j;

drop table if exists permission;

create table permission (
	id bigint (20) unsigned auto_increment comment '权限id',
	permission_name varchar (32) comment '权限名',
	permission_sign varchar (128) comment '权限标识，程序中判断使用，如"user:create"',
	description varchar (256) comment '权限描述，ui界面中显示使用',
	primary key (id)
) comment = '权限表';

drop table if exists role;

create table role (
	id bigint (20) unsigned auto_increment comment '角色id',
	role_name varchar (32) comment '角色名',
	role_sign varchar (128) comment '角色标识，程序中判断使用，如"admin"',
	description varchar (256) comment '角色描述，ui界面中显示使用',
	primary key (id)
) comment = '角色表';

drop table if exists role_permission;

create table role_permission (
	id bigint (20) unsigned auto_increment comment '主键id',
	role_id bigint (20) unsigned comment '角色id',
	permission_id bigint (20) unsigned comment '权限id',
	primary key (id)
) comment = '角色与权限关系表';

drop table if exists user;

create table user (
	id bigint (20) unsigned auto_increment comment '用户id',
	username varchar (50) comment '用户名',
	password char (64) comment '密码',
	state varchar (32) comment '状态',
	create_time datetime comment '创建时间',
	primary key (id)
) comment = '用户表';

drop table if exists user_role;

create table user_role (
	id bigint (20) unsigned auto_increment comment '主键id',
	user_id bigint (20) unsigned comment '用户id',
	role_id bigint (20) unsigned comment '角色id',
	primary key (id)
) comment = '用户与角色关系表';

insert into permission ( id, permission_name, permission_sign, description ) values ( 1, "用户新增", "user:create", null );
insert into role ( id, role_name, role_sign, description ) values ( 1, "admin", "admin", "管理员" );
insert into user ( id, username, password, state, create_time ) values ( 1, 'hishiel', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', null, current_date );
insert into user_role (id, user_id, role_id) values (1, 1, 1);