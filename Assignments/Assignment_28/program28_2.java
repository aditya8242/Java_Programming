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
		int i = 0, j = 0, iUpper = 0, iLower = 0;

		for(i = 1; i <= iRow; i++)
		{
			for(j = 1, iUpper = 65, iLower = 97; j <= iCol; j++, iUpper++, iLower++)
			{
				if(i % 2 == 0)
				{
					System.out.printf("%c", iLower);
				}
				else
				{
					System.out.printf("%c", iUpper);
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

class program28_2
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
//    ABC
//    abc
//    ABC
//    abc
//
//    Input2:  1 5
//    Output:
//    ABCDE
//
//    Input3:  3 1
//    Output:
//    A
//    a
//    A
//
//    Input4:  2 4
//    Output:
//    ABCD
//    abcd
//
//    Input5:  5 2
//    Output:
//    AB
//    ab
//    AB
//    ab
//    AB
//
/////////////////////////////////////////////////////////////////////////////////////////////////
