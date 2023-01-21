// Write a java program which accept string from user and display it in reverse order.
// Input : "MarvellouS".
// Output : "SuollevraM".

import java.util.*;

class MarvellousX
{
    public void Reverse(String str)
    {
        for(int i = str.length() - 1; i >= 0; i--)
        {
            System.out.println(str.charAt(i));
        }
        System.out.println();
    }
}

class Assignment31_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter the string : ");
        String str = sobj.nextLine();

        MarvellousX obj = new MarvellousX();
        obj.Reverse(str);
    }
}

