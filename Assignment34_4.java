// Write a java program which accept N numbers from user and accept Range, Display all elements from that range.
// Input : N :- 6.
//     Start :- 60.
//       End :- 90
//  Elements :- 85  66  3   76  93  88.
// Output : 85  66  76  88.

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

    public void Display(int j, int k)
    {
        int range = -1;
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= j) && (Arr[iCnt] <= k))
            {
                System.out.println(Arr[iCnt]+ "\t");
            }
        }
        System.out.println();
    }
}

class Assignment34_4
{
    public static void main(String Arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements that you want to store.");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers(iNo);

        nobj.Accept();

        System.out.println("Enter the range : ");
        int iValue1 = sobj.nextInt();
        int iValue2 = sobj.nextInt();

        nobj.Display(iValue1,iValue2);
    }
}