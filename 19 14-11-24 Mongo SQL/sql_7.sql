/*
Write a query to display the name and salary of the people whose salary
exceeds their current salary by at least 5000, after a 10% increase, sort the 
data in descending order of them salary.

Sample output
-------------
name	    salary   	
Vikas Jain	89000.00	
Anita Reddy	75000.00                                                                          


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

select name, salary from indianPeople where salary*1.1 >= salary+5000
ORDER BY salary DESC;
