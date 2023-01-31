class Static3 
{
    int no=0;
    String name=null;
    static String collage="BMIIT";

    Static3(int r , String n)
    {
        no=r;
        name=n;
    }
    static void change_collage()
    {
        System.out.println("in static method");
        collage="CGPIT";
        //String collage="SHRIMKA";
    }
    void display()
    {
        System.out.println(no + " " + name + " " +  collage);
    }
    public static void main(String args[])
    {
        //System.out.println("collage is " + collage);
        Static3 s1 = new Static3(11,"ditu");
        Static3 s2 = new Static3(22,"ritu");
        s1.display();
        s2.display();
        Static3.change_collage();
        s1.display();

    }

}
