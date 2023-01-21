// Write a java program which accept N numbers from user and accept one another number as NO, return index of first occurence of that NO.
// Input : N :- 6.
//        No :- 66.
//  Elements :- 85  66  3   66  93  88.
// Output : 1.

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

    public int FirstOccurence(int j)
    {
        int Occur = -1;
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == j)
            {
                Occur = iCnt;
                break;
            }
        }
        return Occur;
    }

}

class Assignment34_2
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements that you want to store : ");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers(iNo);

        nobj.Accept();

        System.out.println("Enter the number to check : ");
        int iValue = sobj.nextInt();

        int iRet = nobj.FirstOccurence(iValue);
        System.out.println("First Occurence of"  + iValue +  "is : "+iRet);
    }
}