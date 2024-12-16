/* 
Write a MongoDB query to find people below 40 years and display location and salary, 
sort them by location in descending order, and limit the result to 5 people.

collection: indianPeople

Sample Document:
----------------
{ 
    "name": "Priya Kumar", 
    "age": 32, 
    "gender": "Female", 
    "phone_number": "9876543210", 
    "location": "Mumbai", 
    "salary": 50000
}

Note: To write the query, use printjson() method from 'mongosh' module
    e.g., To display all the documents from 'marks' collection
        => printjson( db.marks.find())
    Where,
    db => database connection object
    marks => collections name
    find => method to retrieve all the matched docuemnts

*/

printjson(db.indianPeople.find({
    age : {$lt : 40}},
    {location : 1, salary : 1, _id:0}
).sort({location:-1}).limit(5));

