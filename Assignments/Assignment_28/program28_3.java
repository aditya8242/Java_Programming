////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Required packages
//
////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

class Pattern
{
	void Display(int iRow, int iCol)
	{
		int i = 0, j = 0, iUpper = 0;

		for(i = 1, iUpper = 65; i <= iRow; i++, iUpper++)
		{
			for(j = 1; j <= iCol; j++)
			{
				System.out.printf("%c\t", iUpper);
			}
			System.out.println();
		}
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Entry point method for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class program28_3
{
	public static void main(String A[])
	{
		int iValue1 = 0, iValue2 = 0;
		Scanner sobj = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		iValue1 = sobj.nextInt();

		System.out.print("Enter number of columns: ");
		iValue2 = sobj.nextInt();

		Pattern pobj = new Pattern();
		pobj.Display(iValue1, iValue2);
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Testcases successfully handled by the application
//
//    Input1:  4 3
//    Output:
//    A       A       A
//    B       B       B
//    C       C       C
//    D       D       D
//
//    Input2:  1 5
//    Output:
//    A       A       A       A       A
//
//    Input3:  3 1
//    Output:
//    A
//    B
//    C
//
//    Input4:  2 4
//    Output:
//    A       A       A       A
//    B       B       B       B
//
//    Input5:  5 2
//    Output:
//    A       A
//    B       B
//    C       C
//    D       D
//    E       E
//
/////////////////////////////////////////////////////////////////////////////////////////////////
