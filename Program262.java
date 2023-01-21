import java.util.*;

class MarvellousX
{
    public int  DigitCount(String s)
    {
        int iCnt = 0;

        for(int i = 0; i < s.length(); i++)
        {
            if((s.charAt(i) >= '0') && (s.charAt(i) <= '9'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}

class Program262
{
    public static void main(String Ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter String : ");
        String str = sobj.nextLine();

        MarvellousX mobj = new MarvellousX();
        int iRet = mobj.DigitCount(str);
        System.out.println("Number of Digits are : "+iRet);
    }
}