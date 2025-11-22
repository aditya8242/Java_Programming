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

		if(iRow != iCol)
		{
			System.out.print("Invalid input!\n");
			System.out.print("Row and column number should be same.\n");
			return;
		}
		
		for(i = 1; i <= iRow; i++)
		{
			for(j = 1; j <= iCol; j++)
			{
				if(i == j || i > j)
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.print("#\t");
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

class program30_1
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
//    Input1: 4 4        Output:
//                       *   #   #   #
//                       *   *   #   #
//                       *   *   *   #
//                       *   *   *   *
//
//    Input2: 3 5        Output:
//                       Invalid input!
//                       Row and column number should be same.
//
//    Input3: 5 5        Output:
//                       *   #   #   #   #
//                       *   *   #   #   #
//                       *   *   *   #   #
//                       *   *   *   *   #
//                       *   *   *   *   *
//
//    Input4: 2 2        Output:
//                       *   #
//                       *   *
//
//    Input5: 6 4        Output:
//                       Invalid input!
//                       Row and column number should be same.
//
/////////////////////////////////////////////////////////////////////////////////////////////////
