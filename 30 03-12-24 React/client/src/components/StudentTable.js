import React from 'react';
import axios from 'axios';
import { useState, useEffect } from 'react';
function StudentTable() {
  const [data, setData] = useState(null);
  useEffect(() => { 
    const fetchData = async () => {
      try{
        const response = await axios.get("https://7d57-49-204-6-83.ngrok-free.app/students",
          {
            headers: {
              'ngrok-skip-browser-warning': 'true'
            }
          }
        );
        setData(response.data);
      }
      catch(err){
        console.error(err);
      }
    };
    fetchData();
  }
  , []);

  return (
      <div>
        <h3>Students List</h3>
        {data ? (
          <table border="1">
            <thead>
              <tr>
                <th>Name</th>
                <th>Roll Number</th>
                <th>Java</th>
                <th>CPP</th>
                <th>Python</th>
                <th>GenAI</th>
                <th>FSD</th>
              </tr>
            </thead>
            <tbody>
              {data.map((student, index) => (
                <tr key={index}>
                  <td>{student.name}</td>
                  <td>{student.rollNo}</td>
                  <td>{student.scores.Java}</td>
                  <td>{student.scores.CPP}</td>
                  <td>{student.scores.Python}</td>
                  <td>{student.scores.GenAI}</td>
                  <td>{student.scores.FSD}</td>
                </tr>
              ))}
            </tbody>
          </table>
        ) : (
          <p>Loading...</p>
        )}
      </div>
  );
}

export default StudentTable;