/*
You are tasked with building a Person Management System that processes a list 
of Person objects using Java Streams. Each Person object contains the following 
attributes:
	Name: (String) The name of the person
	Age: (int) The age of the person
	Location: (String) The location where the person lives

Your goal is to sort by age, filter who atre above 20, and group by location 
using Java Stream operation.


Sample Input:
-------------
4                   //number of persons
Alice,23,New York   //name, age, location of a person
Bob,34,Los Angeles
Charlie,18,New York
David,29,Los Angeles

Sample Output:
-------------
New York => 
Person{name='Alice', age=23, location='New York'}
Los Angeles => 
Person{name='David', age=29, location='Los Angeles'}
Person{name='Bob', age=34, location='Los Angeles'}

*/

import java.util.*;
import java.util.stream.*;


class Person{
    private int age;
    private String location;
    private String name;
    Person(String name, int age, String location){
        this.name = name;
        this.age = age;
        this.location = location;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getLocation(){
        return location;
    }
}
public class sortFilterGroup{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] parts = input.split(",");
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);
            String location = parts[2];
            persons.add(new Person(name, age, location));
        }

        Map<String, List<Person>> res = persons.stream()
        .sorted(Comparator.comparingInt(Person::getAge))
        .filter(person -> person.getAge() > 20)
        .collect(Collectors.groupingBy(Person::getLocation));

        res.forEach((location, people) -> {
            System.out.println(location + " => ");
            people.forEach(person -> System.out.println("Person{name='" + person.getName() + "', age=" + person.getAge() + ", location='" + person.getLocation() + "'}"));
        });

        sc.close();
    }
}