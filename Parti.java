import java.util.*;
class Parti
{
    int pid  , score[] , total ;
    String pname , pcity , category ;
    long contact ;
    static int i_id ;
    static String iname;
    float rank;
    Scanner sc=new Scanner (System.in);
    Parti()
    {
        pid=i_id=total=0;
        rank=0.0f;
        contact=0;
        pname=pcity=iname=category=null;
        score = new int[5];
    }
    static 
    {
        i_id=1;
        iname="BMIIT";
    }
    void getdata()
    {
        System.out.println("enter pid");
        pid=sc.nextInt();
        System.out.println("pname");
        pname=sc.next();
        System.out.println("pcity");
        pcity=sc.next();
        System.out.println("conatct");
        contact=sc.nextLong();
        System.out.println("enter last 5 score");
        for(int i=0;i<5;i++)
        {
            score[i]=sc.nextInt();
        }

    }
    void calculation()
    {
        for(int i=0;i<5;i++)
        {
            total=total+score[i];
        }
        rank=total/5;
        if(rank>90)
        {
            category="Winner";
        }
        else if(rank>70)
        {
            category="Runners up";
        }
        else 
        {
            category="Loosers";
        }
    }
   static 
    {
        System.out.println("collage id = " + i_id);
        System.out.println("collage name =" + iname);
    }
    void display()
    {
        System.out.println("pid=" + pid);
        System.out.println("pname"+ pname);
        System.out.println("pcity" + pcity);
        System.out.println("contact" + contact);
        System.out.println("total" + total);
        System.out.println("rank = "+ rank);
        System.out.println("category ="+ category);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Parti p[];
        int n;
        System.out.println("enter how many participant");
        n=sc.nextInt();
        p=new Parti[n];
        for(int i=0;i<n;i++)
        {
            p[i]=new Parti();
        }
        for(int i=0;i<p.length;i++)
        {
            p[i].getdata();
        }
        for(int i=0;i<p.length;i++)
        {
            p[i].calculation();
        }
        for(int i =0 ; i<p.length ; i++)
        {
            p[i].display();
        }
        
    }
}