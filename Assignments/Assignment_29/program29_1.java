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
		int i = 0, j = 0, iNo = 0;

		for(i = 1, iNo = 1; i <= iRow; i++)
		{
			for(j = 1; j <= iCol; j++)
			{
				System.out.printf("%d\t", iNo);
				iNo++;

				if(iNo == 10)
				{
					iNo = 1;
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

class program29_1
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
//                       1  2  3  4
//                       5  6  7  8
//                       9  1  2  3
//
//    Input2: 5 5        Output:
//                       1  2  3  4  5
//                       6  7  8  9  1
//                       2  3  4  5  6
//                       7  8  9  1  2
//                       3  4  5  6  7
//
//    Input3: 2 7        Output:
//                       1  2  3  4  5  6  7
//                       8  9  1  2  3  4  5
//
//    Input4: 4 3        Output:
//                       1  2  3
//                       4  5  6
//                       7  8  9
//                       1  2  3
//
//    Input5: 1 9        Output:
//                       1  2  3  4  5  6  7  8  9
//
/////////////////////////////////////////////////////////////////////////////////////////////////
