/*
4. A book shop maintains the inventory of books that are been sold at the shop. The list 
includes the details such as BookTitle, Author, Price, Publisher & Stock position Whenever
 a customer wants to purchase a book, the sales person inputs the title and 
author to the system and the system searches the list & display whether it is available or 
not. If it is not, an appropriate message is displayed. If it is, then the system displays the 
book detail and request for the number of copies required. If the requested copies are 
available, the total cost of the requested copies is displayed; otherwise, the message 
"Required copies not in stock" is displayed. Design a system using a class called Books
with suitable members and member functions & constructors. Use new operator in 
constructors to allocate memory space required
*/
import java.util.Scanner;
class Books
{
    String BookTital;
    String Author;
    int Price;
    String Publisher;
    int Stock;
    Scanner sc = new Scanner(System.in);
    Books(String Tital,String author,String publisher,int price,int stock)
    {
        this.BookTital=Tital;
        Author = author;
        Price = price;
        Publisher = publisher;
        Stock = stock;
    }
    public void display()
    {
        System.out.println("\t\t-----------------BOOK DETAILS---------------\t\t");
        System.out.println("Book Tital is = "+BookTital);
        System.out.println("Book Author name is = "+Author);
        System.out.println("Book price is = "+Price);
        System.out.println("Book Publiser is = "+Publisher);
        System.out.println("Book Stock  is = "+Stock);
        System.out.println("\t\t--------------------------------------------\t\t");
    }

}
class Customer 
{
    String B_Tital;
    String B_Author;
    Scanner sc = new Scanner(System.in);
    public void getdata()
    {
        System.out.println("\t\t--------------ENTER NEEDS of BOOKS------------\t\t");
        System.out.println("Enter the Tital of Book ");
        B_Tital = sc.nextLine();
        System.out.println("Enter the Author name  of Book ");
        B_Author = sc.nextLine();
        System.out.println("\t\t----------------------------------------------\t\t");
    }
}
class PR_4_book
{
    public static void main(String args[])
    {
        int Total_price;
        int N_Stock;
        Scanner sc = new Scanner(System.in);
        Books [] Book = new Books[5];
        Book[0] = new Books("C++","V.Ram","XYZ1",300,5);
        Book[1] = new Books("Java"," JoshuaBloch "," Addison Wesley",700,3);
        Book[2] = new Books("BesicC#","MarkJ.Price","XYZ3",800,5);
        Book[3] = new Books("LearnC","Harrison","XYZ4",800,5);
        Book[4] = new Books("CoreJava","S.Horstmann"," Prentice Hall",1000,1);
         
        Customer c1 = new Customer();
        c1.getdata();

        for(int i = 0; i <=4 ; i++)
        {
            if(c1.B_Tital.equals(Book[i].BookTital) && c1.B_Author.equals(Book[i].Author) )
            {
                System.out.println("BOOK IS AVAILABLE ");
                Book[i].display();
                System.out.println("====================================================================");
                System.out.print("enter how many stock you needed = ");
                N_Stock = sc.nextInt();
                System.out.println("====================================================================");
                if( N_Stock <= Book[i].Stock && c1.B_Author.equals(Book[i].Author) )
                {
                             System.out.println("Stock is available of Books ");
                            Total_price = N_Stock * Book[i].Price;
                            System.out.println("---------------------------------------------------------");
                            System.out.println("Total price of book is = "+Total_price);
                            System.out.println("---------------------------------------------------------");
                            break;
                }
                 else{
                       System.out.println("Stock is not avialable in My shop");
                       break;
                }
            }
            else
            {
                System.out.println("BOOK IS NOT AVAILABLE");
                break;
            }
           
        } 
        
    }
}
