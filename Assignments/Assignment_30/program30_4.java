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
				if(j == iCol || i == iRow || i == 1 || j == 1)
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.print("@\t");
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

class program30_4
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
//    Input1: 3 5        Output:
//                        *   *   *   *   *
//                        *   @   @   @   *
//                        *   *   *   *   *
//
//    Input2: 4 4        Output:
//                        *   *   *   *
//                        *   @   @   *
//                        *   @   @   *
//                        *   *   *   *
//
//    Input3: 2 6        Output:
//                        *   *   *   *   *   *
//                        *   *   *   *   *   *
//
//    Input4: 5 3        Output:
//                        *   *   *
//                        *   @   *
//                        *   @   *
//                        *   @   *
//                        *   *   *
//
//    Input5: 6 6        Output:
//                        *   *   *   *   *   *
//                        *   @   @   @   @   *
//                        *   @   @   @   @   *
//                        *   @   @   @   @   *
//                        *   @   @   @   @   *
//                        *   *   *   *   *   *
//
/////////////////////////////////////////////////////////////////////////////////////////////////
