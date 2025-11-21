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
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}
}

class program27_2
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
//    1       2       3
//    1       2       3
//    1       2       3
//
//    Input2:  1 5
//    Output:
//    1       2       3       4       5
//
//    Input3:  3 1
//    Output:
//    1
//    1
//    1
//
//    Input4:  2 4
//    Output:
//    1       2       3       4
//    1       2       3       4
//
//    Input5:  5 2
//    Output:
//    1       2
//    1       2
//    1       2
//    1       2
//    1       2
//
/////////////////////////////////////////////////////////////////////////////////////////////////
