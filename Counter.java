class Counter {
  
    static int object = 0;
  
    // Instead of performing increment in the constructor
    // instance block is preferred to make this program generic.
    {
        object += 1;
    }
  
    // various types of constructors
    // that can create objects
    public Counter()
    {
    }
    public Counter(int n)
    {
    }
    public Counter(String s)
    {
    }
    public Counter (float f)
    {
    }
  
    public static void main(String args[])
    {
        Counter c1 = new Counter();
        Counter c2 = new Counter(5);
        Counter c3 = new Counter("GFG");
        Counter c4 = new Counter(5);
  
        // We can also write t1.noOfObjects or
        // t2.noOfObjects or t3.noOfObjects
        System.out.println(Counter.object);
    }
}