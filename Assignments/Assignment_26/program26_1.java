import java.util.Scanner;

class Pattern
{
	void Display(int iNo)
	{
		int iCnt = 0, iChar = 0;

		for(iCnt = 1, iChar = 65; iCnt <= iNo; iCnt++, iChar++)
		{
			System.out.printf("%c\t", iChar);
		}

		System.out.println();
	}
}

class program26_1
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
//    Input1: 5        Output: A       B       C       D       E
//    Input2: 1        Output: A
//    Input3: -1       Output:
//    Input4: 0        Output: 
//    Input5: 26       Output: A       B       C       D       E       F       G       H       I
// 						       J       K       L       M       N	   O	   P       Q       R
// 						       S	   T       U       V       W       X       Y       Z
//
//    Input6: 27	   Output: A       B       C       D       E       F       G       H       I
// 							   J       K       L       M       N	   O	   P       Q       R
// 							   S       T       U       V       W       X       Y       Z       [
//
/////////////////////////////////////////////////////////////////////////////////////////////////