class Logic
{
	void printReverse(int iNo)
	{
		int iCnt = 0;

		for(iCnt = iNo; iCnt >= 1; iCnt--)
		{
			System.out.print(iCnt + " ");
		}

		System.out.println();
	}
}

class program20_2
{
	public static void main(String A[])
	{
		Logic obj = new Logic();
		obj.printReverse(10);
	}
}