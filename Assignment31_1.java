// Write a java program which accept string from user and count number of capital characters.
// Input : "Marvellous Multi OS".
// Output : 4

import java.util.*;

class MarvellousX
{
    public int CapitalCount(String s)
    {
        int iCnt = 0;

        for(int i = 0; i < s.length(); i++)
        {
            if((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}

class Assignment31_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter the string : ");
        String str = sobj.nextLine();

        MarvellousX obj = new MarvellousX();
        int iRet = obj.CapitalCount(str);

        System.out.println("Number of Large case letters are : "+iRet);
    }
}

