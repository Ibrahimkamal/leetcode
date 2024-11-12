-- Write your PostgreSQL query statement below
Select p.product_name, s.year, s.price from Sales as s
left join Product as p 
ON p.product_id=s.product_id;
