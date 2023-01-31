import java.util.*;
interface Concession
{
	void getdis();
}
class Publisher
{
	int pid;
	String pname , pcity ;
	float rate;
	Scanner sc=new Scanner(System.in);
	Publisher()
	{
		pid=0;
		pname=pcity=null;
		rate=0.0f;
	}
	void get_publi()
	{
		System.out.println("ENTER PUBLISHER ID");
		pid=sc.nextInt();
		System.out.println("ENTER PUBLISHER NAME");
		sc.skip("\\R");
		pname=sc.nextLine();
		System.out.println("ENTER PUBLISHER CITY");
		pcity=sc.nextLine();
		System.out.println("ENTER RATE");
		rate=sc.nextFloat();
	}
	void dis_publisher()
	{
		System.out.println("PUBLISHER ID= " + pid);
		System.out.println("PUBLISHER NAME= " + pname);
		System.out.println("PUBLISHER PCITY = " + pcity);
		System.out.println("PUBLISHER RATE= " + rate);
	}
	
}
class Author 
{
	int aid;
	long acontact;
	String aname , aemail , b_category;
	Scanner sc=new Scanner(System.in);
	Author()
	{
		aid=0;
		acontact=0;
		aname=aemail=b_category=null;
	}
	void get_author()
	{
		System.out.println("enter author id");
		aid=sc.nextInt();
		System.out.println("enter author name");
		aname=sc.nextLine();
		System.out.println("enter author email");
		aemail=sc.nextLine();
		System.out.println("enter contact no");
		acontact=sc.nextLong();
		System.out.println("enter book category of this : COMIC  , FICTION , HORROR");
		b_category=sc.nextLine();
	}
	void dis_author()
	{
		System.out.println("author id=" + aid);
		System.out.println("author name="+ aname);
		System.out.println("autho email =" + aemail);
		System.out.println("author contact = " + acontact);
		System.out.println("book  category = " + b_category);
	}
}
class Book  extends Publisher implements Concession
{

	String title;
	int isbn_no , pages , stock;
	float price,dis;	
	Scanner sc=new Scanner(System.in);
	Book()
	{
		Author a = new Author(); //-----HAS-A RELATIONSHIP---------
		title=null;
		isbn_no=pages=stock=0;
		price=dis=0.0f;	
	}
	void get_book()
	{
		System.out.println("ENTER THE TITLE OF THE BOOK");
		sc.skip("\\R");
		title=sc.nextLine();
		System.out.println("ENTER ISBN_NO");
		isbn_no=sc.nextInt();
		System.out.println("ENTER PAGES");
		pages=sc.nextInt();
		System.out.println("ENTER TOTAL STOCK");
		stock=sc.nextInt();
		System.out.println("ENTER PRICE OF THE BOOK");
		price=sc.nextFloat();
		a.get_author();
	}
	void getdis()
	{
		System.out.println("HOW MUCH DISCOUNT ON PER BOOK");
		dis=sc.nextFloat();
	}
	void dis_book()
	{
		System.out.println("TITLE = " + title);
		System.out.println("ISBN_NO =" + isbn_no);
		System.out.println("PAGES = " + pages);
		System.out.println("STOCK = " + stock);
		System.out.println("PRICE= " + price);
		System.out.println("DISCOUNT = " + dis);
		a.dis_author();
	}
}
public class Main_book
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String c_category , c_publisher;
		float amt;
		char ch;
		Book b[];
		int n , copy;
		System.out.println("HOW MANY BOOK IN THE SHOP");
		n=sc.nextInt();
		b = new Book [n]; //---------ARRAY OF OBJECT---------- && ------IS-A RELATIONSHIP------
		for (int i=0;i<n;i++)
		{
			b[i] = new Book();
		}
		for (int i=0;i<n;i++)
		{
			b[i].get_book();
		}
		for (int i=0;i<n;i++)
		{
			b[i].getdis();
		}
		for(int i=0;i<n;i++)
		{
			b[i].get_publi();
		}
		for(int i=0;i<n;i++)
		{
			b[i].dis_publisher();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("ENTER WHICH CATEGORY OF BOOK YOU WANT");
			c_category=sc.nextLine();
			sc.skip("\\R");
			System.out.println("ENTER PUBLISHER ");
			c_publisher=sc.nextLine();
			if(c_category.equals(b[i].b_category) && c_publisher.equals(b[i].pname))
			{
				System.out.println("BOOK IS AVAILABLE");
				System.out.println("---------BOOK DETAILS---------");
				b[i].dis_book();
				System.out.println("HOW MANY COPIES YOU WANT");
				copy=sc.nextnt();
				if(copy==b[i].stock)
				{
					System.out.println("NUMBER OF COPIES ARE AVAILABLE");
					amt=(b[i].price-(b[i].price*b[i].dis/100));
					System.out.println("TOTAL AMOUNT = " + amt);
				}
				else
				{
					System.out.println("NUMBER OF COPIES NOT IN THE STOCK");
				}
			}
			else
			{
				System.out.println("BOOK IS NOT AVAILABEL");
			}
			System.out.println("YOU WANT TO MORE SHOPPING");
			ch=sc.next().charAt(0);
			if(ch!='y' || ch!='Y'){break;}
		}
		
		
	}
}



