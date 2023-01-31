/*Assume that a bank maintains two kinds of accounts for customers, one called as savings 
accounts and the other as current accounts. The savings account provides compound 
interest and withdrawal facilities but no cheque book facility. The current account 
provides cheque book facility but no interest. Current account holder should also 
maintain a minimum balance and if the balance falls below the service charge is imposed.
Create a class account that stores customer name, account number and type of account. 
From this derive the classes CurrentAccount and SavingsAccount to make them more 
specific to their requirements. In main create object of current & savings accounts and 
perform following operation on both objects:
I. Accept deposit from the customer and update the balance.
II. Calculate interest */


import java.util.*;
import java.lang.Math;
class Account 
{
    long ac_no;
    float r , money;
    String name , type;

    Account()
    {
        r=0.0f;
        ac_no=0;
        name=type=null;
    }
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        name=sc.nextLine();
        System.out.println("enter account type saving or current");
        type=sc.next();
        if(type.equals(saving))
        {
            System.out.println("what is the  rate for intrest in bank ?");
            r=sc.nextFloat();
        }
        System.out.println("enter ac no");
        ac_no=sc.nextLong();
        
    }
    void display()
    {
        System.out.println("name = " + name);
        System.out.println("type of account =" + type);
        System.out.println("ac no=" + ac_no);
    }
    void deposite()
    {
        System.out.println("how mamu amount u want to deposite");
        money=sc.nextFloat();
    }
    void withdraw()
    {
        System.out.println("how many amount you want to withdraw");
        money=sc.nextFloat();
    }

}
class Saving extends Account
{
    int n,t , cho;
    float p,a ;
    String  time;
    char ch;
    Scanner sc=new Scanner(System.in);
    Saving()
    {
        n=0;
        p=a=t=0.0f;
        ch=null;
    }
    void getdata()
    {
        super.getdata();
        System.out.println("enter how many amount in your accxount");
        p=sc.nextFloat();
        
        System.out.println("wnter which type of  interest you want  monthly or yearly");
        time=sc.next();
        if(time.equals(monthly))
        {
            System.out.println("enter the number of month");
            t=sc.nextFloat();
        }
        else if (time.equals(yearly))
        {
            System.out.println("enter the num of year");
            t=sc.nextFloat();
        }
        else
        {
            System.out.println("enter valid time");
        }
        System.out.println("enter number of the times compounded annually ");
        n=sc.nextInt();
    }
    void choice()
    {
        System.out.println("enter your choice");
        cho=sc.nextInt(); 
        System.out.println("1.deposite");
        System.out.println("2.withdraw");
        System.out.println("3.exit");
        switch (cho) 
        {
            case 1:
                deposite();
                p=p+money;
                System.out.println("updated balance =" + p);
                break;
            case 2:
                withdraw();
                if(money>p)
                {
                    System.out.println("u can't withdraw");
                }
                else
                {
                    p=p-money;
                    System.out.println("updated balance =" + p);
                }
                break;
            case 3:
                System.exit(0);
        }
    }
    void calculate()
    {
        if(time.equals(monthly))
        {
            a=(p*Math.pow(1+(r/12) , (12*t)) - p);
        }           
        else
        {
            a=(p*Math.pow(1+(r/n) , (n*t)));
        } 
    }
    void display()
    {
        /*System.out.println("name"+ name);
        System.out.println("ur saving account no" + ac_no);*/
        super.display();
        System.out.println("ur current balance is" + p);
        System.out.println("interst = " + a);
    }

}
/*class Current extends Account
{
    long ac_no;
    float b;
    String ch;
    static int min_balance=500 , charge = 100;
    void getdata(Scanner sc)
    {
        System.out.println("enter current ac no");
        ac_no=sc.nextLong();
        System.out.println("enter ur account balance");
        b=sc.nextFloat();
        
    }


}*/
public class Bank
{
    public static void main(String args[])
    {
        Saving s=new Saving();
        s.getdata();
        s.choice();
        s.calculate();
        s.display();
    }

}