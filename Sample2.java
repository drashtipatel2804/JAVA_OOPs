import java.util.*;
class Student
{
    int id ,  total=0;
    //int []  m ;
   int []  m = new int[5];
    String name;
    float per;
    char grade;
    
    void getdata()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter id");
        id=sc.nextInt();
        System.out.println("enter name");
        sc.skip("\\R");
        name=sc.nextLine();
        System.out.println("enter marks of 5 subjects");
        for(int i=0 ; i<5 ; i++)
        {  
            m[i]=sc.nextInt();
        }
        //System.out.println("marks of 5 subjects are");
        for(int i=0;i<5;i++)
        {
            //System.out.println(m[i]);
            total=total+m[i]; 
        }
        System.out.println("total =" + total ); 
    }
    void per_grade()
    {
        if(total<=500)
        {  
            System.out.println(per=total*100/500);
            if (total<165)
            {
                grade='F';
                //System.out.println("grade is"+grade);
            }
            else if (per >=70 )
            {
                grade='A';
                //System.out.println("grade is"+grade);
            }
            else if (per>=60 && per<70)
            {
                grade='B';
                //System.out.println("grade is"+grade);				
            }
            else if (per >= 50 && per<60)
            {
                grade='C';
            // System.out.println("grade is"+grade);			
            }
            else
            {
                grade='D';
                //System.out.println("grade is"+grade);
            }
        }
        else
        {
            System.out.println("enter valid marks");
        }
    }
        
    void display_result()
        {
            System.out.println("RESULT");
            System.out.println("ID :" + id);
            System.out.println("NAME :" + name);
            System.out.println("PERCENTAGE : " + per);
            //per_grade();
            System.out.println("grade is"+grade);
        }

        
    
        
}
class Sample2
{
    public static void main (String args[])
    {
        Student s1=new Student() ;
        Student s2=new Student() ;
        Student s3=new Student() ;
        Student s4=new Student() ;
        Student s5=new Student() ;
        s1.getdata();
        s1.per_grade();
        s1.display_result(); 
        s2.getdata();
        s2.per_grade();
        s2.display_result();
        s3.getdata();
        s3.per_grade();
        s3.display_result();
        s4.getdata();
        s4.per_grade();
        s4.display_result();
        s5.getdata();
        s5.per_grade();
        s5.display_result();
    }
}