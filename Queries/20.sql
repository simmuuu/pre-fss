/*
Write a query to display customer names in reverse order along with 
their email domain


Refer the hint for table structure.

Sample output
-------------
ReversedName    EmailDomain                                                                                             
nosnhoJ ecilA   example.com                                                                                             
htimS boB       example.com                                                                                             
sivaD eilrahC   example.com

*/

use fs;
-- write your query below

select REVERSE(Name) as ReversedName, SUBSTRING_INDEX(Email,'@',-1) as EmailDomain from Customers;
