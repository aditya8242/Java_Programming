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
		int i = 0, j = 0;

		for(i = 1; i <= iRow; i++)
		{
			for(j = 1; j <= iCol; j++)
			{
				if(i == 1 || j == 1 || i == iRow || j == iCol)
				{
					System.out.print(j + "\t");
				}
				else
				{
					System.out.print("*\t");
				}
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

class program30_5
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
//    Input1:  4 4        Output:
//                         1 2 3 4
//                         1 * * 4
//                         1 * * 4
//                         1 2 3 4
//
//    Input2:  3 5        Output:
//                         1 2 3 4 5
//                         1 * * * 5
//                         1 2 3 4 5
//
//    Input3:  5 3        Output:
//                         1 2 3
//                         1 * 3
//                         1 * 3
//                         1 * 3
//                         1 2 3
//
//    Input4:  1 6        Output:
//                         1 2 3 4 5 6
//
//    Input5:  6 1        Output:
//                         1
//                         1
//                         1
//                         1
//                         1
//                         1
//
/////////////////////////////////////////////////////////////////////////////////////////////////