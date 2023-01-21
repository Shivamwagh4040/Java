// Write the java program which accept number of rows and number of columns 
// from user and display below pattern.

// INPUT : iRow = 4
//         iCol = 3

// OUTPUT : 1   2   3            
//          1   2   3          
//          1   2   3
//          1   2   3         

import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        for(int i = 0; i < iRow; i++)
        {
            for(int j = 1; j <= iCol; j++)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}

class Assignment37_2
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the number of Columns : ");
        int iNo2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iNo1,iNo2);
    }
}