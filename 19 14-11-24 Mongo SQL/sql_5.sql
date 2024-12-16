/*
Write a query to find people whose salary is more than 10 times their age.

Sample output
-------------                                                                           
name	        age	gender	phone_number	location	salary	
Lata Kulkarni	29	Female	9000055555	    Pune	    62000.00	
Reshma Rai	    30	Female	9666335522	    Surat	    61000.00


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

select * from indianPeople where salary > 2000*age;
