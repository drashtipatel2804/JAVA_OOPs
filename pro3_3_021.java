/*
3. Assume that a bank maintains two kinds of accounts for customers, one called as savings 
accounts  and  the  other  as  current  accounts.  The  savings  account  provides  compound 
interest  and  withdrawal  facilities  but  no  cheque  book  facility.  The  current  account 
provides cheque book facility but no interest. Current account holder should also 
maintain a minimum balance and if the balance falls below the service charge is imposed.

Create a class account that stores customer name, account number and type of account. 
From  this  derive  the  classes  CurrentAccount  and  SavingsAccount  to  make  them  more 
specific  to  their  requirements.  In  main  create  object  of  current  &  savings  accounts  and 
perform following operation on both objects: 
I. Accept deposit from the customer and update the balance. 
II. Calculate interest. 
     Write a program to implement given scenario
*/
import java.util.Scanner;

class Account{
    String c_name;
    int a_number;
    String a_type;
    double balance;
    Scanner ip = new Scanner(System.in);
    Account(){
        c_name = a_type= null;
        a_number = 0;
        balance = 0.0;
    }
    void getdata_1(){
        System.out.print("\nFeel Following Bank Account Detail :-\nCustomer Name   : ");
        c_name = ip.nextLine();
        System.out.print("Account number  : ");
        a_number= ip.nextInt();
        System.out.print("Balance         : ");
        balance = ip.nextDouble();
        // sc.Skip("\\R");
    }
    void deposit(){
        double money;
        System.out.print("\nEnter a Deposit Amount : ");
        money = ip.nextDouble();
        balance +=money;
        System.out.println("\n------Balance Updated------\nYour balance now : "+balance);
    }
    void display_1(){
        System.out.println("=================================\nCustomer name  : "+c_name+"\nAccount number : "+a_number+"\nAccount type   : "+a_type+"\nBalance        : "+balance);
    }
}
class SavingsAccount extends Account{//A = P(1 + rt)
    double interest,rate;
    Scanner ip = new Scanner(System.in);
    SavingsAccount(){
        interest = 0.0;
        rate = 4;
    }
    void getdata_2(){
        getdata_1();
        a_type  = "Saving Account";
        Cal_interest();
    }
    void Cal_interest(){
        interest = ( balance * 30 * rate/100 ) / 365;
    }
	void withdraw(){
        double money;
		System.out.print("How much Money you withdraw ? : ");
        money = ip.nextDouble();
		if(balance < money){
            System.out.println("Your Account Balance is Less for that You don't withdraw it \n");
		}
		else{
			balance -= money;
            System.out.println("------Balance Updated------\nYour balance now : "+balance);
		}
    }
	void manu_1(){
		int command;
        System.out.print("\nChoice Command\n1. Deposit\n2. Withdrawal\n3. Display\n4. Exit\n ");
		while(true){
            System.out.print("Enter a Command : ");
			command = ip.nextInt();
			switch (command) {
				case 1:
					deposit();break;
				case 2:
					withdraw();break;
				case 3:
					all_display();break;
			}
			if(command==4){break;}
		}
	}
    void all_display(){
        display_1();
        System.out.println("Monthly Interest : "+interest);
        System.out.println("=================================\n");
    }
}
class CurrentAccount extends Account{
    double min_balance,charge;
    Scanner ip = new Scanner(System.in);
    CurrentAccount(){
        min_balance = 1000;
        charge = 0.0;
    }
    void getdata_2(){
        getdata_1();
        a_type = "Current Account";
    }
    void cheque_facility(){
		double money;
		System.out.print("Enter a cheque Amount : ");
        money = ip.nextDouble();
		if(balance < money){
			System.out.println("\nYour Account Balance is Less for that You don't withdraw it ");
		}
		else{
			if(balance <= 1000){
				System.out.println("\nYou have to paid 500 Rs. Charge (Bcz your balance less than 1000 Rs.) ");
				charge += 500.0;
			}
		    balance -=money;
		    System.out.println("------Balance Updated------");
		    System.out.println("Your balance Now : "+balance);
		    System.out.println("Your Charge      : "+charge);
		}
	}
	void manu_2(){
		int command;
        System.out.print("\nChoice Command\n1. Deposit\n2. Cheque Book_facility\n3. Display\n4. Exit\n ");
        while(true){
            System.out.print("Enter a Command : ");
            command = ip.nextInt();
            switch(command) {
                case 1:
                    deposit();
                    break;
                case 2:
                    cheque_facility();break;
                case 3:
                    all_display();break;
            }
            if(command==4){break;}
        }
	}
    void all_display(){
        display_1();
        System.out.println("Charge         : "+charge+"\n=================================\n");
        
    }
}
public class pro3_3_021 {
    public static void main(String arg[]){
        Scanner ip = new Scanner(System.in);
        int type;
        // Account a;
        while(true){
            System.out.print("Choice Account type ->\n1) Saving \n2) Checking \n: ");
            type = ip.nextInt();
            if(type == 1){
                SavingsAccount a = new SavingsAccount();    
                a.getdata_2();
                a.manu_1();
                //a.all_display();
                break;
            }
            else if(type == 2){
                CurrentAccount a = new CurrentAccount();                             
                a.getdata_2();
                a.manu_2();
                //a.all_diplay();
                break;
            }
            else{System.out.println("Invalid type try again\n");}
        }
    }
}
/*
Choice Account type ->
1) Saving 
2) Checking 
: 1

Feel Following Bank Account Detail :-
Customer Name   : Hetu Dobariya
Account number  : 2019
Balance         : 100000

Choice Command
1. Deposit
2. Withdrawal
3. Display
4. Exit
Enter a Command : 1

Enter a Deposit Amount : 10000

------Balance Updated------
Your balance now : 110000.0

Enter a Command  : 2
How much Money you withdraw ? : 2000

------Balance Updated------
Your balance now : 108000.0

Enter a Command : 3
=================================
Customer name  : Hetu Dobariya
Account number : 2019
Account type   : Saving Account
Balance        : 108000.0
=================================
Monthly Interest : 328.76
=================================

Enter a Command :: 4

Choice Account type ->
1) Saving
2) Checking
: 2

Feel Following Bank Account Detail :-
Customer Name   : Hirali
Account number  : 2028
Balance         : 200000

Choice Command
1. Deposit
2. Cheque Book_facility
3. Display
4. Exit
Enter a Command : 1

Enter a Deposit Amount : 10000

------Balance Updated------
Your balance now : 210000.0

Enter a Command : 2
Enter a cheque Amount : 
2000
------Balance Updated------
Your balance Now : 208000.0
Your Charge      : 0.0

Enter a Command : 3
=================================
Customer name  : Hirali
Account number : 2028
Account type   : Current Account
Balance        : 208000.0
Charge         : 0.0
=================================

Enter a Command : 4
*/