import java.util.*;

class Number
{
	public long CalculateFactorial(int iNo)
	{
		int i = 0;
		long iFact = 1;

		if(iNo < 0)
		{
			iNo = -iNo;
		}

		for(i = iNo; i >= 2; i--)
		{
			iFact = iFact * i;
		}

		return iFact;
	}
} // end of Number class

class program88
{
	public static void main(String A[])
	{
		int iValue = 0;
		long iRet = 0; // important

		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number: ");
		iValue = sobj.nextInt();

		Number nobj = new Number();
		iRet = nobj.CalculateFactorial(iValue);

		System.out.println("Factorial is " + iRet);

		// important
		sobj = null;
		nobj = null;

		System.gc();
	}
}