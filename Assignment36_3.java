// Write the java program which accept number of rows and number of columns 
// from user and display below pattern.

// INPUT : iRow = 3
//         iCol = 5

// OUTPUT : A   A   A   A   A   A   
//          B   B   B   B   B   B 
//          C   C   C   C   C   C 

import java.util.*;

class Pattern
{
    public void Display(int iRow ,int iCol)
    {
        int i = 0,j = 0;
        for(i = iRow;i >= 0;i--)
        {
            for(j = 0;j < iCol;j++)
            {
                System.out.print(iRow+"\t");    
            }
            System.out.println();
        }
    }
}
class Assignment36_3
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the number of columns :");
        int iNo2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iNo1,iNo2);
    }
}