/* 
    Input : 4529

    9   2   5   4
*/


import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.print(iDigit+"\t");
            iNo = iNo / 10;
        }
        System.out.println();
    }
}

class Program248
{
    public static void main(String a[])
    {
        Pattern pobj = new Pattern();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int i = sobj.nextInt();

        pobj.Display(i);
    }
}