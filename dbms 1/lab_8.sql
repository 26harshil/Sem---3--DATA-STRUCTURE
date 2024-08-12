--lab 8
create table SALES_DATA(
Region varchar(50),
Product  varchar(50),
Sales_Amount int, 
Years int
);

drop table SALES_DATA
INSERT INTO SALES_DATA VALUES
('North America','Watch',1500,2023),
('Europe','Mobile',1200,2023),
('Asia','Watch',1800,2023),
('North America','TV',900,2024),
('Europe', 'Watch',2000,2024),
('Asia', 'Mobile',1000,2024),
('North America' ,'Mobile',1600,2023),
('Europe','TV',1500,2023),
('Asia','TV',1100,2024),
('North America','Watch',1700,2024)
select *from sales_data

--Part – A:
--1. Display Total Sales Amount by Region.

		select region ,sum(Sales_Amount)
		from Sales_data
		group by region

--2. Display Average Sales Amount by Product
		select product , avg(Sales_Amount) as avges
		from Sales_data
		group by product
--3. Display Maximum Sales Amount by Year
		select Years , max(Sales_Amount)  as max
		from Sales_data
		group by years
--4. Display Minimum Sales Amount by Region and Year
	     select Years,Region, min(Sales_Amount) as mines
	     from Sales_data
	     group by Years,Region
--5. Count of Products Sold by Region
		select Region,count(product) as prod
		from sales_data
		group by Region
--6. Display Sales Amount by Year and Product
         select Years,product ,sum(Sales_Amount) as maxval
		 from SALES_DATA
		 group by YEARs,product
		 order by years

 --   select years,product,sales_amount from sales_data
	--group by product,years,sales_amount

--7. Display Regions with Total Sales Greater Than 5000
            select Region,sum(sales_amount) as total
			from sales_data 
			group by region
			having sum(sales_amount)>5000
--8. Display Products with Average Sales Less Than 10000
           select product,avg(sales_amount) as avges
			from sales_data 
			group by product
			having avg(sales_amount)<10000
--9. Display Years with Maximum Sales Exceeding 500
            select years,max(sales_amount) as maxes
			from sales_data 
			group by years
			having max(sales_amount)>500

--10. Display Regions with at Least 3 Distinct Products Sold.
       select  distinct region,count(product)as leasts
	   from sales_data
	   group by region
	   having count(product) > 2
--11. Display Years with Minimum Sales Less Than 1000
		select years,min(sales_amount) as less
		from sales_data
		group by years
		having min(sales_amount)<1000
--12. Display Total Sales  Amount by Region for Year 2023, Sorted by Total Amount
    select region,years, sum(sales_amount) as total
	from sales_data
	group by region,years
	having years=2023
	order by region  
	
	--------------------------------------------------------------------------------------------------------------------------------------------

--	part b
--	1. Display Count of Orders by Year and Region, Sorted by Year and Region
     select years,region , count(sales_amount) as total
	from sales_data
	group by years,region
	order by years

--2. Display Regions with Maximum Sales Amount Exceeding 1000 in Any Year, Sorted by Region
     select region,years , max(sales_amount) as Maximum
	from sales_data
	group by region,years
	order by region
--3. Display Years with Total Sales Amount Less Than 1000, Sorted by Year Descending
    select years , sum(sales_amount) as Maximum
	from sales_data
	group by years
	having  sum(sales_amount)<1000
	order by years desc
--4. Display Top 3 Regions by Total Sales Amount in Year 2024
    select top 3 region,years, sum(sales_amount) as Maximum
	from sales_data
	where years=2024
	group by region,years
 

 ------------------------------------------------PART - C ------------------------------------------------------------------------------------------

--1. Display Products with Average Sales Amount Between 1000 and 2000, Ordered by Product Name
    select product, avg(sales_amount) as avges
	from sales_data
	group by product
	having   avg(sales_amount) between  1000 and 2000
	order by product
--2. Display Years with More Than 5 Orders from Each Region
    select years,region, count(product) as apr
	from sales_data
	group by region,years
	having    count(product)>5
	order by region
--3. Display Regions with Average Sales Amount Above 1500 in Year 2023 sort by amount in descending.
 select years,region, avg(sales_amount) as avges
	from sales_data
	where years=2023
	group by years, region
	having    avg(sales_amount)>1500
	order by  avg(sales_amount) desc
--4. Find out region wise duplicate product.

	select  product,region ,count(product) as pro
	from sales_data
	group by product,region
   	having   count(product)>1
	
--5. Find out region wise highest sales amount.
     select region,max(sales_amount) as pro
	from sales_data
      group by region
	
