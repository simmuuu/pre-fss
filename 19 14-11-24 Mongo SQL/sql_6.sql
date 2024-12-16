/*
Write a query to find people whose name contains "ita" anywhere in it.

Sample output
-------------
name	    age	gender	phone_number	location	salary	
Anita Reddy	45	Female	9872101234	    Bangalore	75000.00                                                                         


Table:   
======
indianPeople
    - name VARCHAR(100),
    - age INT,
    - gender VARCHAR(10),
    - phone_number VARCHAR(15),
    - location VARCHAR(50),
    - salary DECIMAL(10, 2)

*/

use fs;
-- write your query below

select * from indianPeople where name LIKE "%ita%";
