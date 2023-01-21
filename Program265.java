import java.util.*;

class MarvellousX
{
    public int  CapCount(String s)
    {
        int iCnt = 0;
        char Arr[] = s.toCharArray();

        for(int i = 0; i < Arr.length(); i++)
        {
            if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}

class Program265
{
    public static void main(String Ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter String : ");
        String str = sobj.nextLine();

        MarvellousX mobj = new MarvellousX();
        int iRet = mobj.CapCount(str);
        System.out.println("Number of capital case letters are : "+iRet);
    }
}