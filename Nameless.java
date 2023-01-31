class Num
{
    private int no;
    public Num()
    {
        no=0;
    }
    public Num(int x)
    {
        no=x;
    }
    public Num copy(int c)
    {
        return (new Num(c));
    }
    public void dis()
    {
        System.out.println("no:"+no);
    }
}
public class Nameless
{
    public static void main(String args[])
    {
        Num n1=new Num(10);
        Num n2=new Num(20);
        Num n3;
        n3=n2.copy(87);
        n3.dis();
        new Num(46).dis();
        new Num().dis();
    }
}