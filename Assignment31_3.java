// Write a java program which accept string from user and check whether it contains vowels in it or not.
// Input : "Marvellous".
// Output : TRUE.

import java.util.*;

class MarvellousX
{
    public boolean ChkVowel(String str)
    {
        boolean flag = false;

        for(int i = 0; i < str.length(); i++)
        {
            if((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i') || (str.charAt(i) == 'o') || (str.charAt(i) == 'u'))
            {
                flag = true;
                break;
            }
        }
        return flag;
    }
}

class Assignment31_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter the string : ");
        String str = sobj.nextLine();

        MarvellousX obj = new MarvellousX();
        boolean bRet = obj.ChkVowel(str);

        if(bRet == true)
        {
            System.out.println("String Contains vowel.\n");
        }
        else
        {
            System.out.println("There is no vowels in this String.\n");
        }
    }
}

