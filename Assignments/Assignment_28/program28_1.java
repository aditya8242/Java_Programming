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
		int i = 0, j = 0, iAlphabet = 0;

		for(i = 1; i <= iRow; i++)
		{
			for(j = 1, iAlphabet = 65; j <= iCol; j++, iAlphabet++)
			{
				System.out.printf("%c\t", iAlphabet);
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

class program28_1
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
//    A       B       C
//    A       B       C
//    A       B       C
//    A       B       C
//
//    Input2:  1 5
//    Output:
//    A       B       C       D       E
//
//    Input3:  3 1
//    Output:
//    A
//    A
//    A
//
//    Input4:  2 4
//    Output:
//    A       B       C       D
//    A       B       C       D
//
//    Input5:  5 2
//    Output:
//    A       B
//    A       B
//    A       B
//    A       B
//    A       B
//
/////////////////////////////////////////////////////////////////////////////////////////////////
