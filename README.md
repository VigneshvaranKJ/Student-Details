# StudentDetails
A simple beginner JAVA project for maintaining the student details

## SQL Queries
### Table creation:
create table department(id number(6) primary key, department_name varchar2(40) not null unique);


select *from department;

create table student_details(reg_no number(5) primary key, name varchar2(20) not null unique, cgpa float(5) not null ,department_id number(3) not null unique,Foreign key(department_id)references Department(id));

create sequence student_details_reg_no_seq
start with 1
increment by 1;

create sequence department_id_seq
start with 1
increment by 1;

### INSERT A DATA:
insert into student_details(reg_no,name,points,department_id) values(?,?,?,?)

### UPDATE A DATA:
update student_details set name=? where reg_no=?

### DELETE A DATA:
delete from student_details where reg_no=?

### SEARCH BY REG_NO:
select reg_no,name,points,department_id from student_details  where reg_no =?

### SEARCH BY DEPARTMENT_NAME:
SELECT  reg_no, name, points, department_id from student_details where department_id =(SELECT id from department where department_name = ?)

#### *******NOTE: Department names are mentioned as MECH ,ECE ,EEE ,CIVIL ,CSE & IT*******

## **LOGIN CREDENTIALS**
EMAIL    : **csys@gmail.com**
PASSWORD : **12345**
