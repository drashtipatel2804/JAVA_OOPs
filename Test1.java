class  Test1{
    int i;
    public Test1(int k)
    {
        i=k;
    }
    public Test1(int k,int m)
    {
        if(k>m)
        {
            i=k;
        }
        else
        {
            i=m;
        }
    }
    public static void main (String args[])
    {
        Test1 t1=new Test1(10);
        Test1 t2=new Test1(12,15);
        System.out.println(t1.i);
        System.out.println(t2.i);
    }
}