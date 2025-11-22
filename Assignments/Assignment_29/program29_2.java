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
				if(i % 2 == 0)
				{
					System.out.printf("%d\t", iNo);
					iNo = iNo + 2;
				}
				else
				{
					System.out.printf("%d\t", j*2);
				}
			}
			iNo = 1;

			System.out.println();
		}
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Entry point method for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class program29_2
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
//                       2   4   6   8
//                       1   3   5   7
//                       2   4   6   8
//
//    Input2: 4 5        Output:
//                       2   4   6   8   10
//                       1   3   5   7   9
//                       2   4   6   8   10
//                       1   3   5   7   9
//
//    Input3: 2 6        Output:
//                       2   4   6   8   10   12
//                       1   3   5   7   9    11
//
//    Input4: 5 3        Output:
//                       2   4   6
//                       1   3   5
//                       2   4   6
//                       1   3   5
//                       2   4   6
//
//    Input5: 1 7        Output:
//                       2   4   6   8   10   12   14
//
/////////////////////////////////////////////////////////////////////////////////////////////////
