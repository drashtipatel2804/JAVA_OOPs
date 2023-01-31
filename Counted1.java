/*Create a class Counted that contains an int id. There should be default constructor in
class Counted. It should print its id and message like "It is being created", when an
object is being created using new operator. It should also print its id and message like
"It is being destroyed", when object is destroyed using delete operator.*/

/*#include<iostream>
using namespace std;
class Counted
{
	public:
	int id;
	Counted()
	{
		id=0;
		cout<<"It is being Created"<<endl;	
			                                                                                                                                                    
	}
	~Counted()
	{
		cout<<"It is being destroyed"<<endl;
	}
	
};
int main()
{
	Counted c;
	cout<<"Hello,I am in main"<<endl;
	return 0;
}


It is being Created
Hello,I am in main
It is being destroyed*/









import java.util.*;
 class Counted
{
	int id;
	Counted()
	{
		id=0;
		System.out.println("It is being Created");

	}
	public void Finalize()
	{
		System.out.println("IT is being destroyed");
	}
}
class Counted1
{

	public static void main(String args[])
	{
		Counted c1=new Counted();
		Counted c2=new Counted();
		c1.Finalize();
		//c2.null;
		System.gc();
	}
}	

