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
		char ch = '\0';

		for(i = 1, ch = 'a'; i <= iRow; i++)
		{
			for(j = 1; j <= iCol; j++, ch++)
			{
				if(i % 2 == 0)
				{
					System.out.printf("%d\t", j);
				}
				else
				{
					System.out.printf("%c\t", ch);
				}
			}
			ch = 'a';
			System.out.println();
		}
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Entry point method for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class program29_3
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
//                       a   b   c   d
//                       1   2   3   4
//                       a   b   c   d
//
//    Input2: 5 3        Output:
//                       a   b   c
//                       1   2   3
//                       a   b   c
//                       1   2   3
//                       a   b   c
//
//    Input3: 2 6        Output:
//                       a   b   c   d   e   f
//                       1   2   3   4   5   6
//
//    Input4: 4 5        Output:
//                       a   b   c   d   e
//                       1   2   3   4   5
//                       a   b   c   d   e
//                       1   2   3   4   5
//
//    Input5: 1 7        Output:
//                       a   b   c   d   e   f   g
//
/////////////////////////////////////////////////////////////////////////////////////////////////
