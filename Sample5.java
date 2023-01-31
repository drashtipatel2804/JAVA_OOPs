import java.util.*;
class Library
{
    int m_id , b_id ;
	String m_name , b_name , a_name ; 
    void member()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter member id");
        m_id=sc.nextInt();
        System.out.println("enter member name");
        sc.skip("\\R");
        m_name=sc.nextLine();
    }
    void book()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter book name");
       // sc.skip("\\R");
        b_name=sc.next();
        System.out.println("enter book id");
        b_id=sc.nextInt();
        System.out.println("enter author name");
        //sc.skip("\\R");
        a_name=sc.next();
    }
    void dismember()
    {
        System.out.println("member name :" + m_name );
        System.out.println("member id :" + m_id);
    } 
    void disbook()
    {
        System.out.println("book name :" + b_name )
        System.out.println("book id :" + b_id );
        System.out.println("author is : " + a_name );
    }
}
class Sample5
{
    public static void main(String args[])
    {
        Library l=new Library();
        l.member();
        l.book();
        int ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur choice");
        System.out.println("1.member details ");
        System.out.println("2.book details ");
        System.out.println("3.exit");
        ch=sc.nextInt();
        switch (ch)
        {
            case 1 :
                l.dismember();
                break;
            case 2 :
                l.disbook();
                break;
            case 3 :
                System.exit(0);
                
        } 
    }
}