import java.util.*;

class Numbers
{
    public int SumDigits(int iNo)
    {
        int iDigit = 0;
        int iSum = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10;
            iSum = iSum + iDigit;
        }
        return iSum;
    }
}

class Assignment1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please Enter the number : ");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        int iRet = nobj.SumDigits(iNo); 

        System.out.println("Sum of all Digits is : "+iRet);
    }
}