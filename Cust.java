/* Write a Java program to calculate average purchase of the customer as well as calculate
and display discount earned by the customer.Create a class called Customer by
considering customer id, customer name, city, contact no and last five purchases from
the store.
Perform following operations to calculate discount:
1. Get the values from user
2. Display the customer data
3. Calculate average purchase using (Total purchase/ 5)
4. Calculate discount based on following criteria
If average purchase > 50000 then discount = 5000
If average purchase > 35000 then discount = 3500
If average purchase > 20000 then discount = 2000
If average purchase < 20000 then discount = 0
5. Identify all the instance method
Note: Add if you need extra instance variables*/

import java.util.*;
class Cust
{
	int id , dis;
	String name , city ;
	long contact;
	float p[] , avg , total;
	Cust()
	{
		id=dis=0;
		name=city=null;
		contact=0;
		avg=total=0.0f;
		p=new float [5];
	}
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		id=sc.nextInt();
		System.out.println("enter name");
		name=sc.next();
		System.out.println("enter city");
		city=sc.next();
		System.out.println("contact no");
		contact=sc.nextLong();
		System.out.println("enter last 5 purchase");
		for(int i=0;i<5;i++)
		{
			p[i]=sc.nextFloat();
		}
	}
	void calculation()
	{
		for(int i=0;i<5;i++)
		{
			total = total+p[i];
		}

		avg=total/5;

		if(avg>50000)
		{
			dis=5000;
		}
		else if(avg>35000)
		{
			dis=3500;
		}
		else if(avg>20000)
		{
			dis=2000;
		}
		else
		{
			dis=0;
		}
	}
	void display()
	{
		System.out.println("id"+id);
		System.out.println("name"+name);
		System.out.println("city" +city);
		System.out.println("contact"+contact);
		System.out.println("total ="+total);
		System.out.println("average ="+avg);
		System.out.println("discount ="+dis);
	}
	public static void main(String args[])
	{
		Cust c = new Cust();
		c.getdata();
		c.calculation();
		c.display();
	}
}


