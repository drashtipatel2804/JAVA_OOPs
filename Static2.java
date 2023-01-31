class Static2
{
    int no=0;
    String name=null;
    static String collage="BMIIT";

    Static2(int r , String n)
    {
        no=r;
        name=n;
    }
    void display()
    {
        System.out.println(no + " " + name + " " +  collage);
    }
    public static void main(String args[])
    {
        System.out.println("collage is " + collage);
        Static2 s1 = new Static2(1,"ditu");
        Static2 s2 = new Static2(2,"ritu");
        s1.display();
        s2.display();
    }

}