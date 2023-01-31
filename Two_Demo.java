class Student 
{
    int eno;
    String sname;
    void getdata(int e , String s)
    {
        eno=e;
        sname=s;
    }
    void display()
    {
        System.out.println("en_no is" + eno);
        System.out.println("name is" + sname);
    }
}
public class Two_Demo 
{
    public static void main(String args[])
    {
        Student s=new Student();
        s.getdata(3,"drashti");
        s.display();
    }
}
