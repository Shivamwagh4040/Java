import java.util.*;

class Numbers
{
    public int CountDigit(int iNo)
    {
        int iCnt = 0;

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
            iNo = iNo / 10;
            iCnt++;
        }
        return iCnt;
    }
}

class Assignment8
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        int iRet = nobj.CountDigit(iNo);
        System.out.println("Number of Digits are : "+iRet);
    }
}

