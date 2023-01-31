/*Define a class called UserAccount with Data member: username, emailId, password
Method: Constructor, getter and setter method.
Define another class called Yahoo which inherits from UserAccount class with Data
member: securityQuestion, securityAnswer
Method: Constructor, getter and setter method.
Define another class called Twitter which inherits from UserAccounr class with Data
Member: Actype (Private or Public), TwitMsg.
Create object of class yahoo and twitter and display all the user of yahoo and twitter
with all detail.*/

import java.util.*;
class Uaccount
{
	String uname , email , pass;
	Uaccount()
	{
		uname=email=pass=null;
	}
	void getdata(Scanner sc)
	{
		System.out.println("enter user details");
		System.out.println("enter user name");
		//sc.skip("\\R");
		uname=sc.nextLine();
		System.out.println("enter email");
		email=sc.nextLine();
		System.out.println("enter pass");
		pass=sc.nextLine();

	}
	void display()
	{
		System.out.println("---------User details---------");
		System.out.println("name = " + uname);
		System.out.println("email = " + email);
		System.out.println("pass = " + pass); 
	}
}
class Yahoo extends Uaccount
{
	String sq , sa;
	Yahoo()
	{
		sq=sa=null;
	}
	void getdata(Scanner sc)
	{
		super.getdata(sc);
		System.out.println("enter yahoo details");
		System.out.println("enter question");
		sq=sc.nextLine();
		System.out.println("enter ans");
		sa=sc.nextLine();
	}
	void display()
	{
		super.display();
		System.out.println("--------yahoo details-------");
		System.out.println("question is :" + sq);
		System.out.println("ans is : " + sa);
	}
}

	
class Twitter extends Uaccount
{
	String atype , msg;
	Twitter()
	{
		atype=msg=null;
	}
	void getdata(Scanner sc)
	{
		super.getdata(sc);
		System.out.println("enter twitter details");
		System.out.println("enter acc type");
		atype=sc.next();
		sc.skip("\\R");
		System.out.println("enter msg");
		msg=sc.nextLine();
	}
	void display()
	{
		super.display();
		System.out.println("------twitter details---------");
		System.out.println("acc type" + atype);
		System.out.println("message" + msg);
	}
}

public class Main_user
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Yahoo y = new Yahoo();
		y.getdata(sc);
		y.display();
		Twitter t = new Twitter();
		t.getdata(sc);
		t.display();
	}
}
/*enter user details
enter user name
drashti
enter email
p111
enter pass
drsad
enter yahoo details
enter question
is it safe?
enter ans
yes
---------User details---------
name = drashti
email = p111
pass = drsad
--------yahoo details-------
question is :is it safe?
ans is : yes
enter user details
enter user name
drashti
enter email
dd
enter pass
ddd
enter twitter details
enter acc type
private
enter msg
no
---------User details---------
name = drashti
email = dd
pass = ddd
------twitter details---------
acc typeprivate
messageno*/ 