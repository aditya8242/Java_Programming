import java.util.Scanner;

class Pattern
{
	void Display(int iNo)
	{
		int iCnt = 0;

		for(iCnt = 1; iCnt <= iNo; iCnt++)
		{
			System.out.print((iCnt * 2) + "\t");
		}

		System.out.println();
	}
}

class program26_5
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
//    Input1: 5        Output: 2   4   6   8   10
//
//    Input2: 1        Output: 2
//
//    Input3: -1       Output:
//
//    Input4: 0        Output:
//
//    Input5: 10       Output: 2   4   6   8   10   12   14   16   18   20
//
//    Input6: 3        Output: 2   4   6
//
/////////////////////////////////////////////////////////////////////////////////////////////////
