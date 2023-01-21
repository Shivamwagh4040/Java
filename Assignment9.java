import java.util.*;

class Numbers
{
    public int SumDigit(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;
        int iDigit = 0;

        if(iNo == 0)
        {
            return 1;
        }
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        while(iNo > 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
            iCnt++;
        }
        return iSum;
    }
}

class Assignment9
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        int iRet = nobj.SumDigit(iNo);
        System.out.println("Summation of Digits are : "+iRet);
    }
}

