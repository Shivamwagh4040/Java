// Write a java program which accepts 2 strings from user and check whether contents of two strings are equal or not.
// Input : "Marvellous Infosystems".
//         "Marvellous Infosystems".
// Output : TRUE.

import java.util.*;

class StringDemo
{
    public boolean strcontents(String src, String dest)
    {
        if(src.length() != dest.length())
        {
            return False;
        }
        boolean bFlag = True;
        for(int iCnt = 0; iCnt < src.length(); iCnt++)
        {
            if(src.charAt(iCnt) != dest.charAt(iCnt))
            {
                bFlag = False;
                break;
            }
        }
        return bFlag;
    }
}

class Assignment35_2
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first String : ");
        String str1 = sobj.nextLine();

        System.out.println("Enter the first String : ");
        String str2 = sobj.nextLine();

        StringDemo obj = new StringDemo();

        boolean bRet = obj.Strcontents(str1,str2);

        if(bRet == True)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}