import java.util.*;
class Train
{
    int t_no;
    String t_name , t_source , t_destination ;
    int senior,tseat,child,seat;
	float amount , s_amount;
    void getdata()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter train number");
        t_no=sc.nextInt();
        System.out.println("enter train name");
        sc.skip("\\R");
        t_name=sc.nextLine();
        System.out.println("enter source");
        //sc.skip("\\R");
        t_source=sc.nextLine();
        System.out.println("enter destination");
        //sc.skip("\\R");
        t_destination=sc.nextLine();
    }
    void display()
    {
        System.out.println("train no :" + t_no);
        System.out.println("train name :" + t_name);
        System.out.println("source :" + t_source);
        System.out.println("destination" + t_destination);
    }
    void s1()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER NUM  OF SEAT");
		tseat=sc.nextInt();
		System.out.println("ENTER THE NUM OF SINIOR CITIZEN");
		senior=sc.nextInt();
		System.out.println("ENTER THE NUM OF CHIlD");
		child=sc.nextInt();
		s_amount=(senior*260*50)/100;
		seat=tseat-senior;
		amount=(seat*260) + s_amount;
		System.out.println("TOTAL AMOUNT IS" + amount);
    }
    void s2()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER NUM  OF SEAT");
		tseat=sc.nextInt();
		System.out.println("ENTER THE NUM OF SINIOR CITIZEN");
		senior=sc.nextInt();
		System.out.println("ENTER THE NUM OF CHIlD");
		child=sc.nextInt();
		s_amount=(senior*180*50)/100;
		seat=tseat-senior;
		amount=(seat*180) + s_amount;
		System.out.println("TOTAL AMOUNT IS" + amount );
    }
    void s3()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER NUM  OF SEAT");     
		tseat=sc.nextInt();
		System.out.println("ENTER THE NUM OF SINIOR CITIZEN");
		senior=sc.nextInt();
		System.out.println("ENTER THE NUM OF CHIlD");
		child=sc.nextInt();
        s_amount = (senior*75*50)/100;
		seat = tseat-senior;
		amount=(seat*75) + s_amount;
        System.out.println("TOTAL AMOUNT IS" + amount );
    }
    
}
class Sample4
{
    public static void main(String args[])
    {
        Train t=new Train();
        t.getdata();
        t.display();
        int ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your choice");
        System.out.println("1. S1 FIRST AC FAIR - 260 Rs.");
        System.out.println("2. S2 CHAIR CAR - 180 Rs.");
        System.out.println("3. S3 SLEEPER - 75 Rs."); 
        ch=sc.nextInt();
        switch (ch) 
        {
            case 1:
			    t.s1();
			    break;
		    case 2:
			    t.s2();
			    break;
		    case 3:
			    t.s3();
			    break;
        }

    }
}