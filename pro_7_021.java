 /*
Consider the shopping cart class with all the data members related to cart. If user shops
for the first time item count should be zero initially. If user adds items to the cart, item
should be added to the item list. At the end generate the bill and display total number of
item purchased till date. (Use constructor and static variable)
*/
import java.util.Scanner;
class Shopping_cart{
	int cart_id,counter;
	static int id_count = 0;;
	String i_name[]= new String[500];
	double price[] = new double[500];
	int quan[] = new int[500];
	double total_amount;

	Scanner ip = new Scanner(System.in);
	Shopping_cart(){
		counter = 1;
		total_amount = 0.0;
		id_count++;
	}
	void getdata(){
		String command;
		cart_id = id_count;
		for(int i = 0 ; i< 500 ; i++,counter++){
			System.out.println("Feel following Item "+(i+1)+" Detail :-");
			System.out.print("Name     : ");
			i_name[i] = ip.nextLine();
			System.out.print("Prire    : ");
			price[i] = ip.nextDouble();
			System.out.print("Quantity : ");
			quan[i] = ip.nextInt();
			ip.skip("\\R");
 			total_amount += (price[i] * quan[i]);
			System.out.print("You by one more product ? ('Y' to purchased) : ");
			command = ip.nextLine();
			if( !(command.equalsIgnoreCase("y")) ){break;}
		}
	}
	void display_bill(){
		System.out.println("==========================================================================");
		System.out.println("BILL NUMBER : "+cart_id);
		System.out.println("\nNO.ITEM	          NAME              PRICE     QUANTITY       AMT");
		System.out.println("--------------------------------------------------------------------------");
		for(int i=0 ; i<counter ; i++){
			System.out.printf(" %2d    :  %22s : %6.2f : %8d : %8.2f\n",i+1,i_name[i],price[i],quan[i],(price[i] * quan[i]));
		}
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("TOTAL ITEM   : "+counter);
		System.out.println("TOTAL AMOUNT : "+total_amount);
		System.out.println("==========================================================================");
	}
}
		
class pro_7_021{
	public static void main(String args[]){
		Shopping_cart c1 = new Shopping_cart();
		c1.getdata();
		c1.display_bill();
	}
}

/*
============================================================
BILL NUMBER : 1

NO.ITEM	          NAME              PRICE     QUANTITY       AMT
  1    : 1234567890123456789012 : 123456.78 : 12345678 : 12345678.90
  2    :                        :           :          :
  
=================================================================================================
7.
Feel following Item 1 Detail :-
Name     : wafers
Prire    : 35
Quantity : 4
You by one more product ? ('Y' to purchased) : y
Feel following Item 2 Detail :-
Name     : biscuit
Prire    : 40
Quantity : 5
You by one more product ? ('Y' to purchased) : n
==========================================================================
BILL NUMBER : 1

NO.ITEM           NAME              PRICE     QUANTITY       AMT
--------------------------------------------------------------------------
  1    :                  wafers :  35.00 :        4 :   140.00
  2    :                 biscuit :  40.00 :        5 :   200.00
--------------------------------------------------------------------------
TOTAL ITEM   : 2
TOTAL AMOUNT : 340.0
==========================================================================

/*