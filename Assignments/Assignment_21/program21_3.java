class Logic
{
	void displayFactors(int iNo)
	{
		int iCnt = 0;

		if(iNo < 0)
		{
			iNo = -iNo;
		}

		for(iCnt = 1; iCnt <= iNo; iCnt++)
		{
			if(iNo % iCnt == 0)
			{
				System.out.print(iCnt + " ");
			}
		}

		System.out.println();
	}
}

class program21_3
{
	public static void main(String A[])
	{
		Logic obj = new Logic();
		obj.displayFactors(-12);
	}
}