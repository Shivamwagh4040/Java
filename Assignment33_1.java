// Write a java program which accept number from user and return the count of even digits.
// Input : 2395.
// Output : 1.

// Program : 

import java.util.*;

class Digit
{
    public int EvenCount(int iValue)
    {
        if(iValue < 0)
        {
            iValue = -iValue;
        }

        int iCnt = 0;
        while(iValue != 0)
        {
            if((iValue % 10) % 2 == 0)
            {
                iCnt++;
            }
            iValue = iValue / 10;
        }
        return iCnt;
    }
}

class Assignment33_1
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Any number : ");
        int iNo = sobj.nextInt();  

        Digit eobj = new Digit();
        int iRet = eobj.EvenCount(iNo);
        System.out.println("The count of Even Digits is : "+iRet);      
    }
}