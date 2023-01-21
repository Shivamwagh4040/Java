// Write a java program which accept N numbers from user and display all such elements which are divisible by 5.
// Input : N : 6.
// Elements : 85    66  3   80  93  88
// Output : 85  80.

// Program Layout : 

import java.util.*;

class ArrayX
{
    public int Arr[];
    public ArrayX(int iSize)
    {
        Arr = new int[iSize];
    }

    public void Accept()
    {
        System.out.println("Enter the elements of array.");
        Scanner sobj = new Scanner(System.in);
        for(int iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements of array are : ");
        for(int iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}

class ArrayDemo extends ArrayX
{
    public ArrayDemo(int iNo)
    {
        super(iNo);
    }

    public void Display2()
    {
        System.out.println("The number which are divisible by 5 are : ");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 5 == 0)
            {
                System.out.println(Arr[iCnt]+"\t");
            }
        }
        System.out.println();
    }
}

class Assignment32_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array ");
        int iNo = sobj.nextInt();

        ArrayDemo aobj = new ArrayDemo(iNo);

        aobj.Accept();
        aobj.Display2();
    }
}

