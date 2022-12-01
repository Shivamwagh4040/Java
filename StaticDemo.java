
class StaticDemo
{
    static
    {
        System.out.println("Inside static block of staticdemo class which contains main");
    }
    public StaticDemo()
    {
        System.out.println("Inside constructor of StaticDemo");
    }
    public static void main(String arg[])
    {
        System.out.println("Inside main");
        System.out.println("Value of static No3 : "+Demo.No3);   // in c++ Demo::No3
        System.out.println("Value of static No4 : "+Demo.No4);   // in c++ Demo::No4
        Demo.gun();     //// in c++ Demo::gun()

        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        obj1.Fun();

    }
}

class Demo
{
    public int No1;            //non ststic characteristics
    public int No2;            //non ststic characteristics
    public static int No3;     //ststic characteristics
    public static int No4;     //ststic characteristics

    static                     //static block
    {
        No3 = 51;
        No4 = 101;
        System.out.println("Inside static block");
    }
    public Demo()              //constructor
    {
        System.out.println("Inside constructor ");
        No1 = 11;
        No2 = 21;
    }
    public void Fun()           //non ststic method
    {
        //non ststic method can access static as weoll as non static data
        //we can use this keyword
        System.out.println("Inside non static method fun");
        System.out.println("Value of No1 : "+this.No1);
        System.out.println("Value of No2 : "+this.No2);
        System.out.println("Value of No3 : "+this.No3);
        System.out.println("Value of No4 : "+this.No4);
    }

    public static void gun()    //static method
    {
        //static method can access only static data
        //we cannot use this keyword
        System.out.println("Inside static method gun");
        //System.out.println("Value of No1 : "+No1);
        //System.out.println("Value of No2 : "+No2);
        System.out.println("Value of No3 : "+No3);
        System.out.println("Value of No4 : "+No4);
    }
}