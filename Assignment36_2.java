// Write the java program which accept number of rows and number of columns 
// from user and display below pattern.

// INPUT : iRow = 4
//         iCol = 4

// OUTPUT : A   B   C   D   
//          a   b   c   d 
//          A   B   C   D 
//          a   b   c   d 

import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch1 = '\0';
        char ch2 = '\0';
        for(i = 0; i < iRow; i++)
        {
            ch1 = 'A';
            ch2 = 'a';
            for(j = 0; j < iCol; j++)
            {
                if(i % 2 == 0)
                {
                    System.out.print(ch1+"\t");
                    ch1++;
                }
                else
                {
                    System.out.print(ch2+"\t");
                    ch2++;
                }
            }
            System.out.println();
        }
    }
}

class Assignment36_2
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the number of columns : ");
        int iNo2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iNo1,iNo2);
    }
}