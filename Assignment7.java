import java.util.*;

class Numbers
{
    public int MinDigit(int iNo)
    {
        int iDigit = 0;
        int iMin = 9;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit < iMin)
            {
                iMin = iDigit;
            }
            if(iMin == 0)
            {
                break;
            }
            iNo = iNo / 10;
        }
        return iMin;
    }
}

class Assignment7
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        int iRet = nobj.MinDigit(iNo);
        System.out.println("Minimum Digit is : "+iRet);
    }
}

