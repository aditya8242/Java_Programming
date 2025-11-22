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
		
		for(i = 1; i <= iRow; i++, iCol++)
		{
			for(j = i; j <= iCol; j++)
			{
				System.out.print(j + "\t");
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

class program29_5
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
//                       1    2    3    4
//                       2    3    4    5
//                       3    4    5    6
//
//    Input2: 4 3        Output:
//                       1    2    3
//                       2    3    4
//                       3    4    5
//                       4    5    6
//
//    Input3: 2 5        Output:
//                       1    2    3    4    5
//                       2    3    4    5    6
//
//    Input4: 5 2        Output:
//                       1    2
//                       2    3
//                       3    4
//                       4    5
//                       5    6
//
//    Input5: 1 7        Output:
//                       1    2    3    4    5    6    7
//
/////////////////////////////////////////////////////////////////////////////////////////////////
