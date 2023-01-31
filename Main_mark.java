/*. Create class called marksheet class with attribute roll number and marks of five 
subjects. Provide appropriate constructor and functions to display students subject 
marks, total marks and percentage. Derive class GradeMarksheet from Marksheet 
class with added functionality of displaying grade as given below.
Subject Marks Subject Grade
0-39 F
40-100 P
Display overall grade as given below:
Percentage Overall Grade
0-39 F
40-59 B
60-100 A
Implement main to demonstrate above functionality.*/

import java.util.*;
class Marksheet
{
    int roll_no , total;
    int mark[] = new int[5];
    double per;
    Scanner sc=new Scanner(System.in);
    Marksheet()
    {
        roll_no=total=0;
        per=0.0;
    }
    void getdata()
    {
        System.out.println("enter roll_no");
        roll_no=sc.nextInt();
        System.out.println("enter mark of 5 sub");
        for(int i=0;i<5;i++)
        {
            mark[i]=sc.nextInt();
        }
    }
    void calculate()
    {
        for(int i=0;i<5;i++)
        {
            total=total+mark[i];
        }
        per=(total*100)/500;
    }
    void display()
    {
        System.out.println("roll_no" + roll_no);
        System.out.println("mark of 5 sub are");
        for(int i=0;i<5;i++)
        {
            System.out.println(mark[i]);
        }
        System.out.println("total =" + total);
        System.out.println("per =" + per);
    }
}
class Grade extends Marksheet
{
    char grade, p_grade;
    void sub_grade()
    {
        if(total >= 0 && total <=39)
        {
            grade='F';
        }
        else if (total >=40 && total <=59)
        {
            grade='B';
        }
        else
        {
            grade='A';
        }
    }
    void per_grade()
    {
        if(per >= 0 && per <=39)
        {
            p_grade='F';
        }
        else if (per >=40 && per <=59)
        {
            p_grade='B';
        }
        else
        {
            p_grade='A';
        }
    }
    void display()
    {
        super.display();
        System.out.println("grade for subjects" + grade);
        System.out.println("grade for percentafe" + p_grade);
    }
}
class Main_mark
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Grade g[];
        int n;
        System.out.println("how many student");
        n=sc.nextInt();
        g=new Grade[n];
        for(int i=0;i<n;i++)
        {
            g[i]=new Grade();
        }
        for (int i=0;i<n;i++)
        {
            g[i].getdata();
            g[i].calculate();
            g[i].sub_grade();
            g[i].per_grade();
            g[i].display();
        }
        
    }
}