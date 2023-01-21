// Armstrong number

import java.util.*;

class Digits
{
    private int CountDigits(int iNo)
    {
        int iCnt = 0;
        while(iNo != 0)
        {
            iCnt++;
            iNo = iNo / 10;
        }
        return iCnt;
    }

    private int power(int Base, int index)  // Base = 4   index = 5
    {
        int iAns = 1;

        for(int iCnt = 1; iCnt <= index; iCnt++)
        {
            iAns = iAns * Base;
        }
        return iAns;
    }

    public boolean CheckArmstrong(int iNo)
    {
        int iTemp = iNo;
        int iSum = 0;
        int iDigit = 0;
        int iRet = 0;

        int iCount = CountDigits(iNo);

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRet = power(iDigit, iCount);
            iSum = iSum + iRet;
            iNo = iNo / 10;
        }

        if(iSum == iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Program232
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please Enter the number : ");
        int iNo = sobj.nextInt();

        Digits nobj = new Digits();

        boolean bRet = nobj.CheckArmstrong(iNo);

        if(bRet == true)
        {
            System.out.println(iNo+ " is a Armstrong number.");
        }
        else
        {
            System.out.println(iNo+ " is not a Armstrong number.");           
        }
    }
}