
interface Circle
{
    float PI = 3.14f;

    float Area(float Radius);
    float Circumference(float Radius);
}

class Marvellous implements Circle
{
    public float Area(float Radius);
    {
        return PI * Radius * Radius;
    }
    public float Circumference(float Radius);
    {
        return 2 * PI * Radius;
    }
}

class InterfaceDemo
{
    public static void main(String Arr[])
    {
        System.out.println("Value of PI is : "+Circle.PI);
        //Circle.PI = 7.12;
        circle cobj = new Mravellous();
        float ret = 0.0f;
        Ret = cobj.Area(10.5);
    }
}