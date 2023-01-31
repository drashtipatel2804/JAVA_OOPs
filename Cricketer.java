/*Write a Java program to calculate strike rate of the cricketer as well as allocate and
display player category based on strike rate.
Create a class called Cricketer by considering cricketer id, cricketer name, specialization
and score of last five tournaments out of 100.
Perform following operations to allocate category
1. Get the values from user
2. Display all the platinum cricketer data
3. Calculate strike rate using (Total score of 5 tournaments *100/500)
4. Allocate category based on following criteria
Babu Madhav Institute of Information Technology 2021 - 22
BHUMIKA PATEL 4
If strike rate> 90 then category = Platinum
If strike rate> 70 then category = Gold
If strike rate> 60 then category = Silver
5. Identify all the instance method
6. Implement the concept of array of object
Note: Add if you need extra instance variables*/
import java.util.*;
class Cricketer
{
	int cid , score[],total;
	float rate;
	String cname , special , cetegory;
	Scanner sc=new Scanner (System.in);
	Cricketer()
	{
		cid=total=0;
		rate=0.0f;
		cname=special=cetegory=null;
		score = new int [5];
	}
	void getdata()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter id");
		cid=sc.nextInt();
		System.out.println("enter name");
		cname=sc.next();
		System.out.println("enter specialization");
		special=sc.next();
		System.out.println("enter last 5 score");
		for(int i=0;i<5;i++)
		{
			score[i]=sc.nextInt();
		}
		
	}
	void strike()
	{
		for(int i=0;i<5;i++)
		{
			total=total+score[i];
		}
		Scanner sc=new Scanner (System.in);
		System.out.println("total = " + total);
		rate=(total*100)/500;
		System.out.println("rate="+rate);
		if (rate>90)
		{
			cetegory="platinum";
		}
		else if (rate>70)
		{
			cetegory="gold";
		}
		else if (rate>60)
		{
			cetegory="silver";
		}
		else
		{
			cetegory="out of cetegory";
		}
		
		System.out.println("cetegory = " + cetegory);
		
	}
	void display()
	{
		Scanner sc=new Scanner (System.in);
		if (cetegory=="platinum")
		{
			System.out.println("cricketer id " + cid);
			System.out.println("cricketer name" + cname);
			System.out.println("cricketer specialization :" + special);
			System.out.println("last 5 score");
			for(int i=0;i<5;i++)
			{
				System.out.println(score[i]);
			}
		}
		else
		{
			System.out.println("cricketer not have strike of platinum");
		}
	}
	public static void main(String args[])
	{

		Cricketer c[];
		int n;
		Scanner sc=new Scanner (System.in);
		System.out.println("how many cricketer play  a match");
		n=sc.nextInt();
		c=new Cricketer [n];
		for(int i=0;i<n;i++)
		{
			c[i]=new Cricketer ();
		}
		System.out.println("ENTER CRICKETER DETAILS");
		for(int j=0;j<n;j++)
		{
			c[j].getdata();
		}
		System.out.println("CRICKETER STRIKE ");
		for(int k=0;k<n;k++)
		{
			c[k].strike();
		}
		System.out.println("PLATINUM CRICKETER DETAILS");
		for(int l=0;l<n;l++)
		{
			c[l].display();
		}
	}
}


