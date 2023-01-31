/*4. Create  a  class  inventory  that  contains  data  members  like  item  id,  item  name,  price, 
stock.  Create  two  more  classes  which  is  inherit  from  inventory  class  namely  purchase 
and  sales.  Upon  purchase  and  selling  of  the  items  stock  should  be  updated.  Implement 
the  functionality  of  a  re-order  level  while  selling  of  an  items  (Message  should  be 
displayed if item reaches to re-order level) as well as it stock should be checked before 
selling  otherwise  proper  message  should  be  displayed.  More  than  one  item  should  be 
sale at a time.*/

import java.util.Scanner;

interface Purchase{
    void getdata_2();
    void re_order();
}
interface Stock{
    void getdata_3();
    void selling();
}

class  Inventory implements Purchase,Stock{
    int p_stock;
    int s_stock;
    int i_id;
    String i_name;
    double price; 
    int stock;
    Scanner sc = new Scanner(System.in);
    Inventory(){
        p_stock = 0;
        i_id = stock = 0;
        s_stock = 0;
        i_name = null;
        price = 0.0; 
        // getdata();
    }
    
    void getdata_1(){
        System.out.println("Feel Following Detail :-");
        System.out.print("Item id    : ");
        i_id = sc.nextInt();
        sc.skip("\\R");
        System.out.print("Item Name  : ");
        i_name = sc.nextLine();
        System.out.print("Item Price : ");
        price = sc.nextDouble();
        System.out.print("Item Stock : ");
        stock = sc.nextInt();
    }

    public void getdata_2(){
        System.out.print("\nEnter a reaches : ");
        p_stock = sc.nextInt();
        re_order();
        System.out.println("Item Now Stock : "+stock);
    }    

    public void re_order(){
        stock += p_stock;
    }
    
    public void getdata_3(){
        System.out.print("\nEnter a selling : ");
        s_stock = sc.nextInt();
        selling();
        System.out.println("Item Now Stock : "+stock);
    }

    public void selling(){
        stock -= s_stock;
    }

    void manu(){
        int c;
        System.out.print("\nChoice Command \n1) Purchase \n2) Sales \n3) Display \n4) Exit\n");
        while(true){
            System.out.print("Enter a Command : ");
            c=sc.nextInt();
            switch(c){
                case 1:
                getdata_2();break;
                case 2:
                getdata_3();break;
                case 3:
                display_1();break;
            }
            if(c==4){break;}
        }
    }

    void display_1(){
        System.out.println("\n=============================\nItem id : "+  i_id+"\nItem Name : "+i_name+"\nItem Price : "+price+"\nItem Stock : "+stock);
        System.out.println("=============================");
    }
}
public class pro3_4_021 {
    public static void main(String args[]){
        Inventory box = new Inventory();
        box.getdata_1();
        box.manu();
    }
}

/*
Feel Following Detail :-
Item id    : 21
Item Name  : Card
Item Price : 100
Item Stock : 20

Choice Command
1) Purchase
2) Sales
3) Display
4) Exit

Enter a Command : 1
Enter a reaches : 5
Item Now Stock : 25

Enter a Command : 2
Enter a selling : 20
Item Now Stock : 5

Enter a Command : 3

=============================
Item id : 21
Item Name : Card
Item Price : 100.0
Item Stock : 5
=============================

Enter a Command : 4
*/