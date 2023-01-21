import java.util.*;

class Numbers
{
    public int MaxDigit(int iNo)
    {
        int iDigit = 0;
        int iMax = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit > iMax)
            {
                iMax = iDigit;
            }
            iNo = iNo / 10;
        }
        return iMax;
    }
}

class Assignment6
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        int iRet = nobj.MaxDigit(iNo);
        System.out.println("Maximum Digit is : "+iRet);
    }
}