import java.util.*;

class MarvellousX
{
    public int  SmallCount(String s)
    {
        int iCnt = 0;

        for(int i = 0; i < s.length(); i++)
        {
            if((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}

class Program260
{
    public static void main(String Ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter String : ");
        String str = sobj.nextLine();

        MarvellousX mobj = new MarvellousX();
        int iRet = mobj.SmallCount(str);
        System.out.println("Number of small case letters are : "+iRet);
    }
}