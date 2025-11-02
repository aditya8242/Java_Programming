class Logic
{
	void countEvenOddRange(int iNo)
	{
		int iEven = 0, iOdd = 0, iCnt = 0;

		for(iCnt = 1; iCnt < iNo; iCnt++)
		{
			if(iCnt % 2 == 0)
			{
				iEven++;
			}
			else
			{
				iOdd++;
			}
		}

		System.out.println("Even: " + iEven);
		System.out.println("Odd: " + iOdd);
	}
}

class program21_2
{
	public static void main(String A[])
	{
		Logic obj = new Logic();
		obj.countEvenOddRange(50);
	}
}