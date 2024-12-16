/*
Write a query to find all people whose names start with "A"

Sample output
-------------
name	    age	gender	phone_number	location	salary	
Anita Reddy	45	Female	9872101234	    Bangalore	75000.00	
Aman Chawla	39	Male	9888777665	    Ahmedabad	64000.00                                                                          


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

select * from indianPeople where name LIKE "A%"
