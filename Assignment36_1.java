// Write the java program which accept number of rows and number of columns 
// from user and display below pattern.

// INPUT : iRow = 4
//         iCol = 4

// OUTPUT : A   B   C   D   
//          A   B   C   D 
//          A   B   C   D 
//          A   B   C   D 

import java.util.*;

class Pattern
{
    public void Display(int iRow ,int iCol)
    {
        int i = 0,j = 0;
        char ch = '\0';
        for(i = 0;i < iRow;i++)
        {
            ch = 'A';
            for(j = 0;j < iCol;j++)
            {
                System.out.print(ch+"\t");
                ch++;
            }
            System.out.println();
        }
    }
}

class Assignment36_1
{
    public static void main(String arg[])
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