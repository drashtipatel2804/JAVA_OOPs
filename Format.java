import java.util.Date;
public class Format
{
    public static void main(String args[])
    {
        Date now=new Date();
        System.out.printf("%d %d %d %d %d \n" , 1,2,3,4,5);
        System.out.printf("num is %07d\n" , 5);
        System.out.printf("num is %.8f\n" , 1.333687);
        double q=4.0/2.0;
        System.out.printf("ans= %.4f \n" , q);
        System.out.printf("ans2 = %.5f \n" , 123.598765);
        System.out.printf("time = %tT \n", "1:30:45" );
    }
}