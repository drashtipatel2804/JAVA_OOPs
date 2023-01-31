import java.util.*;
class Date
{
    int d,m,y;
    Date()
    {
        d=m=y=0;
    }
    void getdata()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter day");
        d=sc.nextInt();
        System.out.println("enter month");
        m=sc.nextInt();
        System.out.println("enter year");
        y=sc.nextInt();
    }
    void calculation()
    {
        total_year=y-1;
        if(total_year % 2 == 0)
        {
            
        }
        leap_year=
    }
}