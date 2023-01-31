//arry in java
import java.util.*;
class Array
{
    int x[] , s;
    Array()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int s=sc.nextInt();
        x=new int[s];
    }
    void display()
    {
        for (int i=0 ; i<s ;i++)
        {
            System.out.println(x[i]);
        }
    }
    public static void main(String args[])
    {
        Array a=new Array();
        a.display();
    }
}