import java.util.*;

class Numbers
{
    boolean CheckPallindrome(int iNo)
    {
        int iDigit = 0;
        int iRev = 0;
        int iTemp = iNo;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRev = (iRev * 10) + iDigit;
            iNo = iNo / 10;
        }

        if(iRev == iTemp)
        {
            return true;
        }

        else
        {
            return false;
        }
    }
}

class Assignment5
{
    public static void main(String a[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        boolean bRet = nobj.CheckPallindrome(iValue);
        
        if(bRet == true)
        {
            System.out.println("Number is Pallindrome number.");
        }

        else
        {
            System.out.println("Number is not Pallindrome number.");
        }
    }
}