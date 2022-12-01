import java.io.*;

class Wrapper
{
    public static void main(String a[]) throws IOException
    {
        int no = 11;

        Integer iobj = new Integer(no); //Boxing - converting primitive to Wrapper

        System.out.println(no);
        System.out.println(iobj);

        int x = iobj;                 //Unboxing - Converting Wrapper to primitive
        System.out.println(x);
    }
}