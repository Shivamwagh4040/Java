import java.util.*;

class Numbers
{
    public int DisplayTable(int iNo)
    {
        int iCnt = 0;
        int iMult = 0;

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            iMult = iCnt * iNo;
        }
        return iMult;
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

        int iRet = nobj.DisplayTable(iNo);
        System.out.println("Table of number" +iNo, "is : "+iRet);
    }
}

