// Write a java program which accept number from user and return the count of odd digits.
// Input : 2395.
// Output : 3.

// Program : 

import java.util.*;

class Digit
{
    public int OddCount(int iValue)
    {
        if(iValue < 0)
        {
            iValue = -iValue;
        }

        int iCnt = 0;
        while(iValue != 0)
        {
            if((iValue % 10) % 2 != 0)
            {
                iCnt++;
            }
            iValue = iValue / 10;
        }
        return iCnt;
    }
}

class Assignment33_2
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Any Number : ");
        int iNo = sobj.nextInt();

        Digit dobj = new Digit();
        int iRet = dobj.OddCount(iNo);

        System.out.println("The count of odd digits in this number is : "+iRet);
    }
}