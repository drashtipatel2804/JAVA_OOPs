//Single inheritence
import java.util.*;
class Stud
{
    int id;
    String name;
    Scanner sc=new Scanner(System.in);
    Stud()
    {
        id=0;
        name=null;
    }
    void getdata(Scanner sc)
    {
        System.out.println("enter id");
        id=sc.nextInt();
        System.out.println("enter name");
        name=sc.next();
    }
    
}
class Mark extends Stud
{
    int m[];
    Mark()
    {
        m = new int [5];
        for(int i=0 ; i<5; i++)
        {
            m[i]=0;
        }
    }
    void getdata2(Scanner sc)
    {
        System.out.println("enter mark of 5 subject");
        for(int i=0;i<5;i++)
        {
            m[i]=sc.nextInt();
        }   
    }
}
public class Single 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Mark m1=new Mark();
        m1.getdata(sc);
        m1.getdata2(sc);
    }
}