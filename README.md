# StudentDetails
A simple beginner JAVA project for maintaining the student details

#SQL Queries
##Table creation:
create table Department(id number(3) primary key, name varchar(5), hod varchar(20));

create table student_details(reg_no number(5) primary key, name varchar2(20), points number(2),department_id number(3),Foreign key(department_id)references Department(id));

alter table department RENAME column name to department_name;

###INSERT A DATA:
insert into student_details(reg_no,name,points,department_id) values(?,?,?,?)

###UPDATE A DATA:
update student_details set name=? where reg_no=?

###DELETE A DATA:
delete from student_details where reg_no=?

###SEARCH BY REG_NO:
select reg_no,name,points,department_id from student_details  where reg_no =?

###SEARCH BY DEPARTMENT_NAME:
SELECT  reg_no, name, points, department_id from student_details where department_id =(SELECT id from department where department_name = ?)
