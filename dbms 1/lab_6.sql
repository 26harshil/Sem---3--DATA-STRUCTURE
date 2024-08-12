--Math functions
--Part – A:
--1. Display the result of 5 multiply by 30.

       SELECT 5 * 30 AS result;

--2. Find out the absolute value of -25, 25, -50 and 50.

        SELECT ABS(-25),ABS(25),ABS(-50),ABS(50) AS OUTPUTS
--3. Find smallest integer value that is greater than or equal to 25.2, 25.7 and -25.2.
          SELECT  CEILING(25.2),CEILING(25.7),CEILING(-25.2)
--4. Find largest integer value that is smaller than or equal to 25.2, 25.7 and -25.2.
           SELECT  FLOOR(25.2),FLOOR(25.7),FLOOR(-25.2)

--5. Find out remainder of 5 divided 2 and 5 divided by 3.
SELECT 
    5% 2 AS remainder_5_div_2,
    5% 3 AS remainder_5_div_3;
	 
--6. Find out value of 3 raised to 2nd power and 4 raised 3rd power.
	 SELECT POWER(3,2)  AS  OUTPUT 
	 SELECT POWER(4,3) AS OUTPUT
--7. Find out the square root of 25, 30 and 50.
	  SELECT SQRT(25)AS SQAREROOT
	  SELECT SQRT(30)AS SQAREROOT
	  SELECT SQRT(50)AS SQAREROOT
--8. Find out the square of 5, 15, and 25.
	 SELECT SQUARE(5)  AS  OUTPUT 
	 SELECT SQUARE(15) AS OUTPUT
	 SELECT SQUARE(25) AS OUTPUT
--9. Find out the value of PI.
SELECT PI() AS PIE
--10. Find out round value of 157.732 for 2, 0 and -2 decimal points.
  SELECT ROUND(157.732,2) AS ROUND
    SELECT ROUND(157.732,0) AS ROUND
	  SELECT ROUND(157.732,-2,1) AS ROUND
--11. Find out exponential value of 2 and 3.
       SELECT exp(2) as expon
	   SELECT exp(3) as expon
--12. Find out logarithm having base e of 10 and 2.
       select log(10) as logaritm
	     select log(2) as logaritm
--13. Find out logarithm having base b having value 10 of 5 and 100.
       select log(10,10) as logaritm
	    select log(10,5) as logaritm
		 select log(10,100) as logaritm
--14. Find sine, cosine and tangent of 3.1415.
            select sin(3.1415) as sinvalue
			select cos(3.1415) as cosvalue
			select tan(3.1415) as tangentvalue
--15. Find sign of -25, 0 and 25.
       select sign(-25) as num
	   select sign(0) as num
	   select sign(25) as num
--16. Generate random number using function
       select rand() as random



--	   String functions
--Part – A:
--1. Find the length of following. (I) NULL (II) ‘ hello ’ (III) Blank

select len(NULL)as lengtho
select len('helllo')as lengthes
select len('')as lengths
--erorr
--2. Display your name in lower & upper case.
select lower('HARSHIL') AS LOWER
select upper('HARSHIL') AS LOWER

--3. Display first three characters of your name.
select 
	substring('HARSHIL',1,3)
--4. Display 3rd to 10th character of your name.
select substring('HARSHILsolanki',3,7)
--5. Write a query to convert ‘abc123efg’ to ‘abcXYZefg’ & ‘abcabcabc’ to ‘ab5ab5ab5’ using REPLACE.
select replace('here_abc123efgsd','abc123efg' ,'abcXYZefg')
select replace('here_abcabcabc','abcabcabc' ,'ab5ab5ab5’')
--6. Write a query to display ASCII code for ‘a’,’A’,’z’,’Z’, 0, 9.
select ascii('a'),ascii('A'),ascii('z'),ascii('Z'),ascii(0),ascii(9) as asciii
--7. Write a query to display character based on number 97, 65,122,90,48,57.

 SELECT 
    CHAR(97) AS Char1,
    CHAR(65) AS Char2,
    CHAR(122) AS Char3,
    CHAR(90) AS Char4,
    CHAR(48) AS Char5,
    CHAR(57) AS Char6;
--8. Write a query to remove spaces from left of a given string ‘hello world ‘.
select 
		ltrim('hello world ')
--9. Write a query to remove spaces from right of a given string ‘ hello world ‘.
  select 
			rtrim('hello world ')
--10. Write a query to display first 4 & Last 5 characters of ‘SQL Server’.
 SELECT 
    LEFT('SQL Server', 4)+
    RIGHT('SQL Server', 5) AS Last5Characters


--11. Write a query to convert a string ‘1234.56’ to number (Use cast and convert function).
    select cast('1234.56' as DECIMAL(10,2))
--12. Write a query to convert a float 10.58 to integer (Use cast and convert function).
       select cast(10.58  as int)
--13. Put 10 space before your name using function.
         select 
		 space(10)+'harshil'
--14. Combine two strings using + sign as well as CONCAT ().
          select concat('harshil',' solanki')
		  select 'harshil'+' solanki'
--15. Find reverse of “Darshan”.
               select reverse ('darshan')
--16. Repeat your name 3 times.
            select replicate('harshil - ',3)


--			Date Functions
--Part – A:
--1. Write a query to display the current date & time. Label the column Today_Date.


         select getdate()
--2. Write a query to find new date after 365 day with reference to today.
              select dateadd(day,365,getdate())
--3. Display the current date in a format that appears as may 5 1994 12:00AM.
          SELECT FORMAT(GETDATE(), 'MMM d yyyy hh:mm tt') AS FormattedDate;
  
--4. Display the current date in a format that appears as 03 Jan 1995.
           SELECT FORMAT(GETDATE(), ' d mm yyyy ') AS FormattedDate;
  
--5. Display the current date in a format that appears as Jan 04, 96.
             SELECT FORMAT(GETDATE(), '  MMM d, yyyy ') AS FormattedDate;
--6. Write a query to find out total number of months between 31-Dec-08 and 31-Mar-09.
		  select datediff( month,'31-Dec-08','31-Mar-09')
--7. Write a query to find out total number of years between 25-Jan-12 and 14-Sep-10.
               select datediff( year,'25-Jan-12','14-Sep-10')
--8. Write a query to find out total number of hours between 25-Jan-12 7:00 and 26-Jan-12 10:30.
          select datediff( hour,'25-Jan-12 7:00 ','26-Jan-12 10:30')
--9. Write a query to extract Day, Month, Year from given date 12-May-16.
                    select day( '12-May-16')
					    select month( '12-May-16')
						    select year( '12-May-16')
--10. Write a query that adds 5 years to current date.
             select dateadd(year,5,getdate())
--11. Write a query to subtract 2 months from current date.
          select dateadd(month,-2, getdate())
--12. Extract month from current date using datename () and datepart () function.
    select 
	datename(dd,getdate()), datename(m,getdate())
	     
		 select 
		 datepart(dd,getdate()),datepart(m,getdate())
--13. Write a query to find out last date of current month.
       select eomonth(getdate())
--14. Calculate your age in years and months.

           select datediff(year,'2005-10-26',getdate())
		   
           select datediff(month,'2005-10-26',getdate())

  
