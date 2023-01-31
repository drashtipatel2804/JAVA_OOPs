/*Create a class Person which stores information of person like name, age, city and gender. Create 
function compare() to compare person based on age. Write a main to create two objects of 
person class using constructor and display their information. Also display person who is elder 
than other person in main().*/

import java.util.*;
class Person
{
    String name , city ;
    char gender;
    int age;
    Person()
    {
        name = city = null;
        gender=0;
        age=0;

    }
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        name=sc.next();
        System.out.println("city");
        city=sc.next();
        System.out.println("gender");
        gender=sc.next().charAt(0);
        System.out.println("age");
        age=sc.nextInt();

    } 
     void compare (Person p1 , Person p2)
    {
        if (p1.age>p2.age)
        {
            System.out.println("person 1 is older");
        }
        else
        {
            System.out.println("person 2 is older");
        }
    }
    public static void main(String args[])
    {
        Person p1=new Person();
        Person p2=new Person();
        p1.getdata();
        p2.getdata();
        p1.compare(p1,p2);

    }

}
