import java.util.*;
import java.text.SimpleDateFormat;

//java.util.Date;
//java.time.Instant;
class Baby
{
    String name;
    String bdate , bcg , polio;
    Baby()
    {
        name=null;
        bdate=bcg=polio="yyyy-mm-dd";
    }
    void calculation()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse(bdate));
        c.add(Calendar.DATE, 60);  // number of days to add
        bcg = sdf.format(c.getTime());
    }
    public static void main(String args[])
    {
        Baby b = new Baby();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter bdat");
        b.bdate=sc.next();
        b.calculation();
        System.out.println("bcg =" + b.bcg);


    }
}