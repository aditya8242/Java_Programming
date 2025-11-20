import java.util.Scanner;

class Pattern
{
	void Display(int iNo)
	{
		int iCnt = 0;

		for(iCnt = iNo; iCnt >= 1; iCnt--)
		{
			System.out.print(iCnt + "\t#\t");
		}

		System.out.println();
	}
}

class program26_2
{
	public static void main(String A[])
	{
		int iValue = 0;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number of elements: ");
		iValue = sobj.nextInt();

		Pattern pobj = new Pattern();
		pobj.Display(iValue);
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Testcases successfully handled by the application
//
//    Input1: 5        Output: 5       #       4       #       3       #       2       #       1       #
//
//    Input2: 1        Output: 1       #
//
//    Input3: -1       Output:
//
//    Input4: 0        Output:
//
//    Input5: 10       Output: 10      #       9       #       8       #       7       #       6       #       5       #       4       #       3       #       2       #       1       #
//
//    Input6: 2        Output: 2       #       1       #
//
/////////////////////////////////////////////////////////////////////////////////////////////////
