// Write a java program which accept N numbers from user and return product of all odd elements.
// Input : N :- 6.
//  Elements :- 15  66  3   70  10  88.
// Output : 45.

// Program : 

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
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements of array are : ");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}

class Numbers extends ArrayX
{
    public Numbers(int i)
    {
        super(i);
    }

    public int Product()
    {
        int iMult = 1;
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 != 0)
            {
                iMult = iMult * Arr[iCnt];
            }
        }
        return iMult;
    }
}

class Assignment34_5
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements that you want to store.");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers(iNo);

        nobj.Accept();

        int iRet = nobj.Product();
        System.out.println("The Product of all odd numbers from the array is : "+iRet);
    }
}