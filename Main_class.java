import java.util.*;
interface Sport
{  
    public void gracemarks();
}
class Student

{
   String name;
   int id;
   Scanner sc=new Scanner(System.in);
   void getdata()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter id");
        id=sc.nextInt();
        System.out.println("enter name");
        name=sc.next();
    }
}
class Exam extends Student
{
   int mark[] ,n ;
   Exam()
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many subjects?");
        n=sc.nextInt();
        mark = new int[n];
   }
   void getmarks()
        {
            Scanner sc=new Scanner (System.in);
            System.out.println("Enter the marks of" + n + "subjects");
            for(int i=0;i<n;i++)
            {
              mark[i]=sc.nextInt();
            }
        }
}
class Result extends Exam implements Sport
{
    int total=0 , sm , final_mark;
    char ch;
    void calculatetotal()
    { 
           for(int i=0;i<n;i++)
           {
                total=total+mark[i];
           }
    }
    public void gracemarks()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter whether the Student participated in inter university games");
        ch=sc.next().charAt(0);
        if(ch=='Y'||ch=='y')
        {
            System.out.println("enter grace marks out og 20");
            sm=sc.nextInt();
            if((total+sm)>(n*100))
            {
                final_mark=(n*100);
            }
        } 
        else
        {
                final_mark=total;
        }
    }  
    void display()
    {
        System.out.println("id =" + id);
        System.out.println("name =" + name);
        System.out.println("total marks of subjects are" + total);
        System.out.println("final marks" + final_mark);
    }
}
public class Main_class
{
        public static void main(String args[])
        {   
    
            System.out.println("*****Details of the student*****");
            Result r=new Result();
            r.getdata();
            r.getmarks();
            r.calculatetotal();
            r.gracemarks();
            r.display();

        }

}
