
class ConstructorOverload
{
    int i;
    public ConstructorOverload(int k)
    {
        i=k;
    }
    public ConstructorOverload(int k, int m)
    {
        System.out.println("Hi I am assigning the value max(k, m) to i");
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
        ConstructorOverload ConstructorOverload1 = new ConstructorOverload(10);
        ConstructorOverload ConstructorOverload2 = new ConstructorOverload(12, 15);
        System.out.println(ConstructorOverload1.i);
        System.out.println(ConstructorOverload2.i);
    }
}
