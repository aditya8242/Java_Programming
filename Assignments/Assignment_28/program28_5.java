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
		int i = 0, j = 0, iCount = 0;

		for(i = 1, iCount = 1; i <= iRow; i++)
		{
			for(j = 1; j <= iCol; j++, iCount++)
			{
				System.out.print(iCount + "\t");	
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

class program28_5
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
//    1       2       3
//    4       5       6
//    7       8       9
//    10      11      12
//
//    Input2:  1 5
//    Output:
//    1       2       3       4       5
//
//    Input3:  3 1
//    Output:
//    1
//    2
//    3
//
//    Input4:  2 4
//    Output:
//    1       2       3       4
//    5       6       7       8
//
//    Input5:  5 2
//    Output:
//    1       2
//    3       4
//    5       6
//    7       8
//    9       10
//
/////////////////////////////////////////////////////////////////////////////////////////////////
