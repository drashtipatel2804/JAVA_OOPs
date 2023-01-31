class Visibility
{
    int p;
    private int x=10;
    protected int y=20;
    public void display()
    {
        System.out.println(x);
    }
    void display1()
    {
        //display();
        System.out.println(x);
    }
}
public class CheckAccess
{
    public static void main(String args[])
    {
        Visibility v=new Visibility();
        v.p=88;
        //v.x=20;
        v.y=45;
        v.display();
        v.display1();
    }
}