insert into roles(roleid,role)
values(1,'admin');

insert into users(userid,pasword,username,fk_roles)
values(1,'shubham','shubham',1);

insert into roles_users(roles_roleid,users_userid)
values(1,1);

