// Write a java program which accepts 2 strings from user and check whether first N contents of two strings are equal or not.
// Note : If third parameter is greater than the size of second string then concat whole string after first string.
// Input : "Marvellous Infosystems".
//         "Marvellous Infosystems".
//          10.
// Output : TRUE.

import java.util.*;

class StringDemo
{
    public boolean StrNCmpX(String src, String dest, int iValue)
    {
        boolean bflag = true;

        for(int iCnt = 0; iCnt < iValue; iCnt++)
        {
            if(src.charAt(iCnt) != dest.charAt(iCnt))
            {
                bflag = false;
                break;
            }
        }
        return bflag;
    }
}

class Assignment35_3
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First string : ");
        String str1 = sobj.nextLine();

        System.out.println("Enter Second String : ");
        String str2 = sobj.nextLine();

        System.out.println("Enter the number : ");
        int iNo = sobj.nextInt();

        StringDemo obj = new StringDemo();

        boolean bRet = obj.StrNCmpX(str1, str2, iNo);

        if(bRet == true)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
    }
}