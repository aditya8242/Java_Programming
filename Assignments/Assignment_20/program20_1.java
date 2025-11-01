class Logic
{
	void sumEvenNumbers(int iNo)
	{
		int iSum = 0, iCnt = 0;

		if(iNo < 0)
		{
			iNo = -iNo;
		}

		for(iCnt = 2; iCnt <= 10; iCnt++)
		{
			if(iCnt % 2 == 0)
			{
				iSum = iSum + iCnt;
			}
		}

		System.out.println(iSum);
	}
}

class program20_1
{
	public static void main(String A[])
	{
		Logic obj = new Logic();
		obj.sumEvenNumbers(10);
	}
}