// Write a java program which accept N numbers from user and accept one another number as NO, check whether NO is present or not.
// Input : N :- 6.
//        No :- 66.
//  Elements :- 85  66  3   66  93  88.
// Output : TRUE.

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
    public boolean Check(int j)
    {
        boolean flag = false;
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == j)
            {
                flag = true;
            }
        }
        return flag;
    }
}

class Assignment34_1
{
    public static void main(String Arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements that you want to store : ");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers(iNo);

        nobj.Accept();

        System.out.println("Enter the number to check : ");
        int iValue = sobj.nextInt();

        boolean bRet = nobj.Check(iValue);

        if(bRet = true)
        {
            System.out.println(+iValue+ "is present in given array.");
        }
        else
        {
            System.out.println(+iValue+ "is not present in given array.");
        }
    }
}