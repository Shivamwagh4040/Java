import java.util.*;

class Numbers
{
    public int Reverse(int iNo)
    {
        int iDigit = 0;
        int iRev = 0;

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
        return iRev;
    }
}

class Assignment4
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        int iRet = nobj.Reverse(iNo);

        System.out.println("Digits in Reverse are : "+iRet);
    }
}