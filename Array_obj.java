import java.util.*;
class Array_obj
{
	int id;
	String name;
	Array_obj()
	{
		
		id=0;
		name=null;

	}
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");  
		id=sc.nextInt();
		System.out.println("enter name");
		name=sc.next();
		
	}
	void display()
	{
		System.out.println("id " + id);
		System.out.println("name" + name);
	}
	public static void main(String args[]);
	{
	
		Array_obj stud[];
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many num of student");
		no=sc.nextInt();
		stud=new Array_obj[no];
		for(int i=0;i<no;i++)
		{
			stud[i]=new Array_obj();
		}
		System.out.println(stud.length);
		System.out.println();
		for(int i=0;i<no;i++)
		{
			stud[i]=new Array_obj();
		}
		for(int i=0;i<stud.length;i++)
		{
			stud[i].getdata();
		}
		for(int i=0;i<stud.length;i++)
		{
			stud[i].display();
		}
	
	
		
	}

}
