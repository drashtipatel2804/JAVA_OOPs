import java.util.*;
class Bat
{
    static String c_name ,  state ;
    static int age , inning , run , match ;
    Bat()
    {
        inning=0;
        run=0;
        match=0;
        c_name=state=null;
    }
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter cricketer name");
        //sc.skip("\\R");
        c_name=sc.next();
        System.out.println("state");
        state=sc.next();
        System.out.println("age");
        age=sc.nextInt();
        System.out.println("inning");
        inning=sc.nextInt();
        System.out.println("run");
        run=sc.nextInt();
        System.out.println("num of match");
        match=sc.nextInt();
    }
    void display()
    {
        System.out.println("name" + c_name + "\n" + "state " +state +"\n"+ "inning"+inning + "\n" + "run" + run + "\n" + "match"+match);
    }
    public static void main(String args[])
    {
        Bat b=new Bat();
        b.getdata();
        char ch;
        int i , urun , avg;
        do
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter ur choice");
            System.out.println("1. Update the batsman record");
            System.out.println("2. Find the average of the batsman");
            System.out.println("3. Display information of batsman");
            System.out.println("4. Display name of cricketer in short");
            i=sc.nextInt();
        
        
            switch(i)
            {
                case 1:
                    System.out.println(" is cricketr select in match?? if yes then enter y otherwise n");
                    ch=sc.next().charAt(0);
                    if (ch=='y')
                    {
                        match=match+1;
                        System.out.println("is cricketer select for inning");
                        ch=sc.next().charAt(0);
                        {
                            if (ch=='y')
                            {
                                System.out.println("how many run");
                                urun=sc.nextInt();
                                run=run+urun;
                            }
                        }
                    }
                    else
                    {
                        System.out.println("no updation");
                    }
                    break;
                case 2:
                    avg=run/inning;
                    System.out.println("average =" + avg);
                    break;
                case 3:
                    b.display();
                    break;
                case 4:
                System.out.println(c_name + age);
                break;
                
            }
            System.out.println("you want more deatils");
            ch=sc.next().charAt(0);
        }while(ch=='y');

    }

}