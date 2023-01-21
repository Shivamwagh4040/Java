// Write the java program which accept number of rows and number of columns 
// from user and display below pattern.

// INPUT : iRow = 3
//         iCol = 5

// OUTPUT : 5   4   3   2   1
//          5   4   3   2   1
//          5   4   3   2   1         

import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        for(int i = 0; i < iRow; i++)
        {
            for(int j = iCol; j > 0; j--)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}

class Assignment37_3
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the number of columns : ");
        int iNo2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iNo1, iNo2);
    }
}