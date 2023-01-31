/*. Assume that a bank maintains two kinds of accounts for customers, one called as savings 
accounts and the other as current accounts. The savings account provides compound 
interest and withdrawal facilities but no cheque book facility. The current account 
provides cheque book facility but no interest. Current account holder should also 
maintain a minimum balance and if the balance falls below the service charge is imposed.
Create a class account that stores customer name, account number and type of account. 
From this derive the classes CurrentAccount and SavingsAccount to make them more 
specific to their requirements. In main create object of current & savings accounts and 
perform following operation on both objects:
I. Accept deposit from the customer and update the balance.
II. Calculate interest.
Write a program to implement given scenario */


import java.util;
class Account
{
    String name , type ;
    long no;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        name=sc.next();
        System.out.println("enter ac no");
        no=sc.nextLong();
        System.out.println("enter type");
        type=sc.next();
    }
    void display()
    {
        System.out.println("name=" +  name);
        System.out.println("ac no=" + no);
        System.out.println("type =" + type );
    }
}
class Saving extends Account
{
    
}
