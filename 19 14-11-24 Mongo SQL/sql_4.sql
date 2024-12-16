/*
Write a query to find all people whose phone number ends with "234"

Sample output
-------------
name	    age	gender	phone_number    location    salary	
Rohan Gupta	28	Male	9876501234	    Delhi	    55000.00	
Anita Reddy	45	Female	9872101234	    Bangalore   75000.00


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

select * from indianPeople where phone_number LIKE "%234";
