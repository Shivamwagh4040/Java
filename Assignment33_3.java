// Write a java program which accept number from user and return the count of digits in between 3 & 7.
// Input : 2395.
// Output : 1.

// Program : 

import java.util.*;

class Digit
{
    public int CountRange(int iValue)
    {
        if(iValue < 0)
        {
            iValue = -iValue;
        }

        int iCnt = 0;
        while(iValue != 0)
        {
            if(((iValue % 10) >= 3) && ((iValue % 10) <= 7))
            {
                iCnt++;
            }
            iValue = iValue / 10;
        }
        return iCnt;
    }
}

class Assignment33_3
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        Digit dobj = new Digit();
        int iRet = dobj.CountRange(iNo);

        System.out.println("The count of digits in between 3 & 7 is : "+iRet);
    }
}