create database cse_3a_233


create table deposit(

   actno int,
   cname varchar(50),
   bname varchar(50),
   amount decimal(8,2),
   adate datetime
);

insert into  deposit values(101,'anil','vrce',1000,'1995-3-1')
insert into  deposit values(102,'SUNIL','AJNI',5000,'1996-1-4')
insert into  deposit values(103,'MEHUL','KAROLBAGH',3500,'1995-11-7')
insert into  deposit values(104,'MADHURI','CHANDI',1200,'1996-3-17')
insert into  deposit values(105,'PRAMOD','M.G.ROAD',3000,'1996-3-27')
insert into  deposit values(106,'SANDIP','ANDHERI',2000,'1996-3-31')
insert into  deposit values(107,'SHIVANI','VIRAR',1000,'1995-9-5')
insert into  deposit values(108,'KRANTI','NEHRU PLACE',5000,'1995-7-2')
insert into  deposit values(109,'MINU','POWAI',7000,'1995-8-10')








select * from deposit

CREATE TABLE BRANCH(
    BNAME VARCHAR(50),
	CITY VARCHAR(50)
	);

	INSERT INTO BRANCH  VALUES('VRCE','NAGPUR')
	INSERT INTO BRANCH  VALUES('AJNI','NAGPUR')
	INSERT INTO BRANCH  VALUES('KAROLBAGH','DELHI')
	INSERT INTO BRANCH  VALUES('CHANDI','DELHI')
	INSERT INTO BRANCH  VALUES('DHARAMPETH','NAGPUR')
	INSERT INTO BRANCH  VALUES('M.G.ROAD','BANGLORE')
	INSERT INTO BRANCH  VALUES('ANDHERI','BOMBAY')
	INSERT INTO BRANCH  VALUES('VIRAR','BOMBAY')
	INSERT INTO BRANCH  VALUES('NEHRU PLACE','DELHI')
	INSERT INTO BRANCH  VALUES('POWAI','BOMBAY')

	SELECT *FROM BRANCH


	CREATE TABLE CUSTOMERS(
	CNAME VARCHAR(50),
	CITY  VARCHAR(50)
	);


	INSERT INTO CUSTOMERS  VALUES('ANIL','CALCUTTA')
	INSERT INTO CUSTOMERS  VALUES('SUNIL','DELHI')
	INSERT INTO CUSTOMERS  VALUES('MEHUL','BORODA')
	INSERT INTO CUSTOMERS  VALUES('MANDAR','PATNA')
	INSERT INTO CUSTOMERS VALUES('MADHURI','NAGPUR')
	INSERT INTO CUSTOMERS  VALUES('PRAMOD','NAGPUR')
	INSERT INTO CUSTOMERS VALUES('SANDIP','SURAT')
	INSERT INTO CUSTOMERS  VALUES('SHIVANI','BOMBAY')
	INSERT INTO CUSTOMERS  VALUES('KRANTI','BOMBAY')
	INSERT INTO CUSTOMERS  VALUES('NAREN','BOMBAY')

	SELECT * FROM CUSTOMERS

	CREATE TABLE BORROW(
	
	LOANNO INT,
	CNAME VARCHAR(50),
	BNAME VARCHAR(50),
	AMOUNT DECIMAL(8,2)
	);

	INSERT INTO BORROW VALUES
	(201,'ANIL','VRCE',1000),
	(206,'MEHUL','AJNI',5000),
	(311,'SUNIL','DHARAMPETH',3000),
	(321,'MADHURI','ANDHERI',2000),
	(375,'PRAMOD','VIRAR',8000),
	(481,'KRANTI','NEHRU PLACE',3000)

	SELECT * FROM BORROW	
--1. Retrieve all data from table DEPOSIT.
    SELECT * FROM deposit

--2. Retrieve all data from table BORROW.
 SELECT * FROM BORROW

--3. Retrieve all data from table CUSTOMERS.
SELECT * FROM CUSTOMERS
--4. Display Account No, Customer Name & Amount from DEPOSIT.
SELECT 
--5. Display Loan No, Amount from BORROW.
--6. Display loan details of all customers who belongs to ‘ANDHERI’ branch from borrow table.
--7. Give account no and amount of depositor, whose account no is equals to 106 from deposit table.
--8. Give name of borrowers having amount greater than 5000 from borrow table.
--9. Give name of customers who opened account after date '1-12-96' from deposit table.
--10. Display name of customers whose account no is less than 105 from deposit table.
--11. Display name of customer who belongs to either ‘NAGPUR’ or ‘DELHI’ from customer table. (OR & IN)
--12. Display name of customers with branch whose amount is greater than 4000 and account no is less than
--105 from deposit table.
--13. Find all borrowers whose amount is greater than equals to 3000 & less than equals to 8000 from borrow
--table. (AND & BETWEEN)
--14. Find all depositors who do not belongs to ‘ANDHERI’ branch from deposit table.
--15. Display Account No, Customer Name & Amount of such customers who belongs to ‘AJNI’, ‘KAROLBAGH’
--Or ‘M.G.ROAD’ and Account No is less than 104 from deposit table.
