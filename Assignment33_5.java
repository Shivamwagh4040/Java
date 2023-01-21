// Write a java program which accept number from user and return difference between summation of even digits and summation of odd digits.
// Input : 2395.
// Output : -15     (2 - 17).

// Program : 

import java.util.*;

class Digit
{
    public int CountDiff(int iValue)
    {
        if(iValue < 0)
        {
            iValue = -iValue;
        }

        int iEvenSum = 0;
        int iOddSum = 0;
        int iDigit = 0;

        while(iValue != 0)
        {
            iDigit = iValue % 10;

            if(iDigit % 2 == 0)
            {
                iEvenSum += iDigit;
            }
            else
            {
                iOddSum += iDigit;
            }
            iValue = iValue / 10;
        }
        return iEvenSum - iOddSum;
    }
}

class Assignment33_5
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        Digit dobj = new Digit();
        int iRet = dobj.CountDiff(iNo);

        System.out.println("The Summation of Even digits and Summation of Odd digits is : "+iRet);
    }
}