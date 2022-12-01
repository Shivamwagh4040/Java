import java.lang.*;

class Demo
{
    public void fun()
    {
        System.out.println("Function without parameters");

    }
    public void fun(int i)
    {
        System.out.println("Fun with one interger as a parameter");

    }
    public void fun(int i, int j)
    {
        System.out.println("Fun with two interger as a parameter");
        
    }
    public void fun(double i)
    {
        System.out.println("Fun with one double as a parameter");
        
    }
}
class Overloading
{
    public static void main(String a[])
    {
        Demo obj = new Demo();
        obj.fun();
        obj.fun(11);
        obj.fun(11,12);
        obj.fun
    }
}