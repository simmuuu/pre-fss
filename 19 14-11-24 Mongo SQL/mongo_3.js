/* 
Write a MongoDB query to find all people whose names start with "A"

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
    name : {$regex : /A/}
}));