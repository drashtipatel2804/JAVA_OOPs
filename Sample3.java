import java.util.*;
class Hotel
{
    int r_no , days;
	String c_name;
	float tarrif ;

    void check_in()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter room num");
        r_no=sc.nextInt();
        System.out.println("enter customer name");
        sc.skip("\\R");
        c_name=sc.nextLine();
        System.out.println("enter per day of charge");
        tarrif=sc.nextFloat();
        System.out.println("ENTER NUMBER OF DAYS OF STAY");
        days=sc.nextInt();
    }
    void display()
    {
        System.out.println("customer name :" + c_name);
        System.out.println("room no :" + r_no);
        System.out.println("per day charge is " + tarrif);
        System.out.println("no of days :" + days);
    }
    void calculate()
    {
        float amount;
		System.out.println("total amount is" + (amount=days*tarrif));
		//System.out.println("total amount is" + amount);
    }
}
class Sample3
{
    public static void main(String ards[])
    {
        Hotel h=new Hotel();
        h.check_in();
        h.display();
        h.calculate();

    }
}