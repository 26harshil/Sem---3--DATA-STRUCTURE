create table emp(
EID int,
EName varchar(50),
Department varchar(50),
Salary int,
JoiningDate date,
City varchar(50)
);

INSERT INTO emp VALUES
	(101,'Rahul' ,'Admin',56000,'1990-jan-1','Rajkot'),
	(102,'Hardik','IT',18000,'1990-sep-25','Ahmedabad'),
	(103,'Bhavin','HR',25000,'1991-may-14','Baroda'),
	(104,'Bhoomi','Admin',39000,'1991-feb-8','Rajkot'),
	(105,'Rohit','IT',17000, '1990-jul-23','Jamnagar'),
	(106,'Priya','IT',9000 ,'1990-oct-18','Ahmedabad'),
	(107,'Bhoomi','HR',34000, '1991-dec-25','Rajkot')
	 drop table emp
	select*from emp
--lab 7
--1. Display the Highest, Lowest, Label the columns Maximum, Minimum respectively.

   select max(Salary) as max,min (Salary) as min
   from emp
--2. Display Total, and Average salary of all employees. Label the columns Total_Sal and Average_Sal,
--respectively.
select sum(Salary) as Total_Sal , avg(Salary) as Average_Sal
from emp
--3. Find total number of employees of EMPLOYEE table.
select count(EID) as totalnumber
from emp


--4. Find highest salary from Rajkot city.
select max(Salary) as max 
from emp
where City ='rajkot'
--5. Give maximum salary from IT department.
select max(Salary) as max
from emp
where Department ='it'
--6. Count employee whose joining date is after 8-feb-91.
select count(eid) as joiningdate
from emp
where JoiningDate > '1991-2-8'

--7. Display average salary of Admin department.
select avg(salary)  as avgsal
from emp
where  Department ='admin '

--8. Display total salary of HR department.
select sum(salary) as total
from emp
where Department = 'hr'
--9. Count total number of cities of employee without duplication.
select count( distinct city) as total 
from emp
--10. Count unique departments.
select count(distinct Department) as   uniqe
from emp
--11. Give minimum salary of employee who belongs to Ahmedabad.
select city ,min(salary) as mini
from emp
group by city
--12. Find city wise highest salary.
select city, max(salary) as highest
from emp
group by city
--13. Find department wise lowest salary.
select department ,min(salary) as lowest
from emp
group  by department
--14. Display city with the total number of employees belonging to each city.
select city , count(eid) as total 
 from emp 
 group by city
--15. Give total salary of each department of EMP table.
select department , sum(salary) as total
 from emp
  group by department
--16. Give average salary of each department of EMP table without displaying the respective department
--name.select avg(salary) as averagefrom emp group by department--part b--Part – B:
--1. Count the number of employees living in Rajkot.

select count(eid) as total
from emp
where city='rajkot'

--2. Display the difference between the highest and lowest salaries. Label the column DIFFERENCE.
   
   select (max(salary) - min(salary) )  as diff
   from emp 
 
--3. Display the total number of employees hired before 1st January, 1991.
select  count(eid) as total 
from emp
where JoiningDate<'1991-1-1'


--Part – C:
--1. Count the number of employees living in Rajkot or Baroda.
 select city,count(eid) as total 
 from emp
 where city='rajkot' or city='baroda'
 group by city
--2. Display the total number of employees hired before 1st January, 1991 in IT department.
    select department ,count(eid) as total 
	from emp
	where JoiningDate <'1991-1-1' 
	group by department
	having department = 'it'
--3. Find the Joining Date wise Total Salaries.
select JoiningDate,sum(salary)
from emp
group by JoiningDate
--4. Find the Maximum salary department & city wise in which city name starts with ‘R’.   select department, max(salary) as max   from emp   where city like 'R%'   group by department
