// Write a java program which accept number from user and return multiplication of all digits.
// Input : 2395.
// Output : 270.

// Program : 

import java.util.*;

class Digit
{
    public int Multiply(int iValue)
    {
        if(iValue < 0)
        {
            iValue = -iValue;
        }

        int iMult = 1;
        int iDigit = 0;
        while(iValue != 0)
        {
            iDigit = (iValue % 10);

            if(iDigit == 0)
            {
                iDigit = 1;
            }
            iMult *= iDigit;
            iValue = iValue / 10;
        }
        return iMult;
    }
}

class Assignment33_4
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        Digit dobj = new Digit();
        int iRet = dobj.Multiply(iNo);

        System.out.println("Multiplication of all the digits of this number is : "+iRet);
    }
}