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
				if(i % 2 == 0)
				{
					System.out.printf("%d\t", -j);
				}
				else
				{
					System.out.printf(" %d\t", j);
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

class program29_4
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
//    Input1: 3 4        Output:
//                        1    2    3    4
//                       -1   -2   -3   -4
//                        1    2    3    4
//
//    Input2: 5 3        Output:
//                        1    2    3
//                       -1   -2   -3
//                        1    2    3
//                       -1   -2   -3
//                        1    2    3
//
//    Input3: 2 6        Output:
//                        1    2    3    4    5    6
//                       -1   -2   -3   -4   -5   -6
//
//    Input4: 4 5        Output:
//                        1    2    3    4    5
//                       -1   -2   -3   -4   -5
//                        1    2    3    4    5
//                       -1   -2   -3   -4   -5
//
//    Input5: 1 7        Output:
//                        1    2    3    4    5    6    7
//
/////////////////////////////////////////////////////////////////////////////////////////////////
