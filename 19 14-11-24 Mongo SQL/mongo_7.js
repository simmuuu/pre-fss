/* 
Write a MongoDB query to display the name and salary of the people whose salary
exceeds their current salary by at least 5000, after a 10% increase, sort the 
data in descending order of them salary.

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
    $expr: { $gt: [{ $multiply: ["$salary", 1.1] },{ $add: ["$salary", 5000] }]}
},{name:1, salary:1, _id:0}).sort({salary:-1}));