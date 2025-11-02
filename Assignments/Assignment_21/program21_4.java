class Logic
{
	void countFactors(int iNo)
	{
		int iCnt = 0, iFact = 0;

		if(iNo < 0)
		{
			iNo = -iNo;
		}

		for(iCnt = 1; iCnt <= iNo; iCnt++)
		{
			if(iNo % iCnt == 0)
			{
				iFact++;
			}
		}

		System.out.println(iFact);
	}
}

class program21_4
{
	public static void main(String A[])
	{
		Logic obj = new Logic();
		obj.countFactors(17);
	}
}