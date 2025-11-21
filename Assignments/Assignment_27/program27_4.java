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
				if(j % 2 == 0)
				{
					System.out.print("#\t");
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

class program27_4
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
//    *       #       *
//    *       #       *
//    *       #       *
//    *       #       *
//
//    Input2:  1 5
//    Output:
//    *       #       *       #       *
//
//    Input3:  3 1
//    Output:
//    *
//
//    Input4:  2 4
//    Output:
//    *       #       *       #
//    *       #       *       #
//
//    Input5:  5 2
//    Output:
//    *       #
//    *       #
//    *       #
//    *       #
//    *       #
//
/////////////////////////////////////////////////////////////////////////////////////////////////
