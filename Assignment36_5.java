// Write the java program which accept number of rows and number of columns 
// from user and display below pattern.

// INPUT : iRow = 3
//         iCol = 4

// OUTPUT : 1   2   3   4         
//          5   6   7   8       
//          9   10   11   12      

import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0, iNo = 1;
        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                System.out.print(iNo+"\t");
                iNo++;
            }
            System.out.println();
        }
    }
}

class Assignment36_5
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