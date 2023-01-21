// Accept sing from user and reverse the contents of that string by toggling the case.
// Input : "aCBdef".
// Outout : "FEDcbA".

import java.util.*;

class StringDemo
{
    public String StrRevTogX(String src)
    {
        StringBuffer str2 = new StringBuffer();

        for(int iCnt = src.length()-1; iCnt >= 0; iCnt++)
        {
            if((src.charAt(iCnt) >= 'A') && (src.charAt(iCnt) <= 'Z'))
            {
                str2.append(src.substring(iCnt, iCnt+1).toLowerCase());
            }
            else
            {
                str2.append(src.substring(iCnt, iCnt+1).toUpperCase());
            }
        }
        String str3 = str2.toString();
        return str3;
    }
}

class Assignment35_4
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String src = sobj.nextLine();

        StringDemo obj = new StringDemo();

        String sRet = obj.StrRevTogX(str);
        System.out.println(sRet);
    }
}