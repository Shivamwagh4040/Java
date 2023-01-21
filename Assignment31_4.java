// Write a java program which accept string from user and return difference between frequency of small characters and frequency of capital characters.
// Input : "MarvellouS".
// Output : 6   (8-2).

import java.util.*;

class MarvellousX
{
    public int CountDiff(String str)
    {
        int iSmallCnt = 0;
        int iCapCnt = 0;

        for(int i = 0; i < str.length(); i++)
        {
            if((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z'))
            {
                iSmallCnt++;
            }
            if((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z'))
            {
                iCapCnt++;
            }
        }
        return iSmallCnt - iCapCnt;
    }
}

class Assignment31_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter the string : ");
        String str = sobj.nextLine();

        MarvellousX obj = new MarvellousX();
        int iRet = obj.CountDiff(str);
        
        System.out.println("The difference between frequency of small and capital letters from string  : "+iRet);
    }
}

