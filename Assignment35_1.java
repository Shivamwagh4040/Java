// Write a java program which accepts 2 strings from user and concat N characters of second string after first string. Value of N should be accepted from user.
// Note : if third parameter is greater than the size of second string then concat whole string first string.
// Input : "Marvellous Infosystems".
//         "Logic Building".
//          5.
// Output : "Marvellous Infosystems Logic".

import java.util.*;

class StringDemo
{
    public String StrConcat(String src, String dest, int iValue)
    {
        if(iValue > dest.length())
        {
            iValue = dest.length();
        }
        StringBuffer sAns = new StringBuffer();

        for(int iCnt = 0; iCnt < iValue; iCnt++)
        {
            sAns.append(dest.charAt(iCnt));
        }
        String sRet = sAns.toString();
        return sRet;
    }
}

class Assignment35_1
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first String : ");
        String str1 = sobj.nextLine();

        System.out.println("Enter the second String : ");
        String str2 = sobj.nextLine();

        System.out.println("Enter the number to concat : ");
        int iNo = sobj.nextInt();

        StringDemo obj = new StringDemo();

        String sRet = obj.StrConcat(str1,str2,iNo);

        System.out.println("After the concatination the string will be : ");
        System.out.println(str1+ " " +sRet);
    }
}