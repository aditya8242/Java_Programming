import java.util.Scanner;

class Pattern
{
	void Display(int iNo)
	{
		int iCnt = 0;

		for(iCnt = 1; iCnt <= iNo; iCnt++)
		{
			System.out.print("#\t" + iCnt + "\t*\t");
		}

		System.out.println();
	}
}

class program26_4
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
//    Input1: 5        Output: #       1       *       #       2       *       #       3       *       #       4       *       #       5       *
//
//    Input2: 1        Output: #       1       *
//
//    Input3: -1       Output:
//
//    Input4: 0        Output:
//
//    Input5: 10       Output: #       1       *       #       2       *       #       3       *       #       4       *       #       5       *       #       6       *       #       7       *       #       8       *       #       9       *       #       10      *
//
//    Input6: 3        Output: #       1       *       #       2       *       #       3       *
//
/////////////////////////////////////////////////////////////////////////////////////////////////
