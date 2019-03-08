Table creation:
create table department(id number(6) primary key, department_name varchar2(40) not null unique);
insert into department values(101, 'Civil');
insert into department values(102, 'Mech');
insert into department values(103, 'EEE');
insert into department values(104, 'CSE');
insert into department values(105, 'ECE');
insert into department values (106,'IT'); 

select *from department;

create table student_details(reg_no number(5) primary key, name varchar2(40) not null unique, cgpa float(5) not null ,department_id number(3) not null unique,Foreign key(department_id)references Department(id));

create sequence student_details_reg_no_seq
start with 1
increment by 1;

create sequence department_id_seq
start with 1
increment by 1;

INSERT A DATA:
insert into student_details(reg_no,name,cgpa,department_id) values(?,?,?,?)

UPDATE A DATA:
update student_details set name=? where reg_no=?

DELETE A DATA:
delete from student_details where reg_no=?

SEARCH BY REG_NO:
select reg_no,name,cgpa,department_id from student_details  where reg_no =?

SEARCH BY DEPARTMENT_NAME:
SELECT  reg_no, name, cgpa, department_id from student_details where department_id =(SELECT id from department where department_name = ?)


flyway
junit
throws user defined exceptions
sql, core java, servlets, fundas, jsp, html, etc.,