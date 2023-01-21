import java.util.*;

class Numbers
{
    public int CountOddDigits(int iNo)
    {
        int iEvenCnt = 0;
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
            if((iDigit % 2) != 0)
            {
                iEvenCnt++;
            }
            iNo = iNo / 10;
        }
        return iEvenCnt;
    }
}

class Assignment3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter the number : ");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        int iRet = nobj.CountOddDigits(iNo);

        System.out.println("Number of Odd Digits are : "+iRet);
    }
}