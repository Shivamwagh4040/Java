// Accept string from user and check whether the string is pallindrome or not without considering its case.
// Input : "1abccBA1".
// Output : "TRUE".

import java.util.*;

class StringDemo
{
    public boolean StrPallindrome(String src)
    {
        boolean Flag = true;
        String str = src.toUpperCase();
        int iStart = 0;
        int iEnd = str.length()-1;

        while(iStart < iEnd)
        {
            if(str.charAt(iStart) != str.charAt(iEnd))
            {
                Flag = false;
                break;
            }
            iStart++;
            iEnd--;
        }
        return Flag;
    }
}

class Assignment35_5
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        StringDemo obj = new StringDemo();

        boolean bRet = obj.StrPallindrome(str);

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