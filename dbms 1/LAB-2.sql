--1. Retrieve all data from table DEPOSIT.
    SELECT * FROM deposit

--2. Retrieve all data from table BORROW.
 SELECT * FROM BORROW

--3. Retrieve all data from table CUSTOMERS.
SELECT * FROM CUSTOMERS
--4. Display Account No, Customer Name & Amount from DEPOSIT.
SELECT ACTNO,CNAME,AMOUNT FROM deposit
--5. Display Loan No, Amount from BORROW.
SELECT LOANNO,AMOUNT FROM BORROW
--6. Display loan details of all customers who belongs to ‘ANDHERI’ branch from borrow table.
SELECT*FROM BORROW
WHERE BNAME='ANDHERI'
--7. Give account no and amount of depositor, whose account no is equals to 106 from deposit table.


SELECT ACTNO,AMOUNT FROM deposit
WHERE actno=106
--8. Give name of borrowers having amount greater than 5000 from borrow table.
 SELECT CNAME FROM BORROW
 WHERE AMOUNT>5000
--9. Give name of customers who opened account after date '1-12-96' from deposit table.

SELECT CNAME FROM deposit
WHERE ADATE >'1996-12-1'
--10. Display name of customers whose account no is less than 105 from deposit table.
SELECT CNAME FROM deposit
WHERE actno<105

--11. Display name of customer who belongs to either ‘NAGPUR’ or ‘DELHI’ from customer table. (OR & IN)
SELECT CNAME FROM CUSTOMERS
WHERE CITY IN('NAGPUR','DELHI')

SELECT CNAME FROM CUSTOMERS
WHERE CITY='NAGPUR' OR CITY='DELHI'
--12. Display name of customers with branch whose amount is greater than 4000 and account no is less than
--105 from deposit table.
SELECT CNAME,BNAME FROM deposit
WHERE amount>4000 AND actno<105
--13. Find all borrowers whose amount is greater than equals to 3000 & less than equals to 8000 from borrow
--table. (AND & BETWEEN)
SELECT *FROM BORROW
WHERE AMOUNT>=3000 AND AMOUNT<8000 

SELECT *FROM BORROW
WHERE AMOUNT BETWEEN 3000 AND 8000;
--14. Find all depositors who do not belongs to ‘ANDHERI’ branch from deposit table.

SELECT*FROM deposit
WHERE bname='ANDHERI'

--15. Display Account No, Customer Name & Amount of such customers who belongs to ‘AJNI’, ‘KAROLBAGH’
--Or ‘M.G.ROAD’ and Account No is less than 104 from deposit table.
SELECT ACTNO,CNAME,AMOUNT FROM deposit
WHERE  Bname='AJNI' OR bname='KAROLBAGH'OR bname='M.G.ROAD'  AND actno<104


--PART B 
--1. Display all the details of first five customers from deposit table.
   
   SELECT TOP 5* FROM deposit 
--2. Display all the details of first three depositors whose amount is greater than 1000.

  SELECT TOP 3 *FROM deposit
  WHERE amount>1000
--3. Display Loan No, Customer Name of first five borrowers whose branch name does not belongs to
--‘ANDHERI’ from borrow table.

SELECT  TOP 5 LOANNO,CNAME FROM BORROW 
      
--4. Retrieve all unique cities using DISTINCT. (Use Customers Table)

SELECT DISTINCT CITY  FROM CUSTOMERS

--5. Retrieve all unique branches using DISTINCT. (Use Branch Table)
SELECT DISTINCT BNAME FROM BRANCH

--PART C
--1. Retrieve top 50% record from table BORROW.
SELECT TOP 50 PERCENT *FROM BORROW

--2. Display top 10% amount from table DEPOSIT.
SELECT TOP 10 PERCENT AMOUNT FROM  deposit
--3. Display top 25% customer who deposited more than 5000.
SELECT TOP 25 PERCENT CNAME FROM deposit
WHERE amount >5000
--4. Retrieve first 10% Loan Amounts.
SELECT TOP 10 PERCENT* FROM BORROW


--5. Retrieve all unique customer names with city.
SELECT DISTINCT CNAME,CITY FROM CUSTOMERS
--6. Retrieve all Loan records with one more column in Loan Amount as 10% extra amount.

SELECT * ,(AMOUNT + AMOUNT*0.1) AS 'EXTRE AMOUNT' FROM BORROW
SELECT*,(AMOUNT + AMOUNT*0.1)[EXTRE AMOUNT] FROM BORROW
--7. Retrieve all odd/even value loan number from Borrow table.
SELECT*FROM BORROW
WHERE LOANNO%2 = 0
