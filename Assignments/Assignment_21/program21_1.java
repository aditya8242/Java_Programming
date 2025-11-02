class Logic
{
	void productOfDigits(int iNo)
	{
		int iDigit = 0, iMult = 1;

		// mention nahi kelay ki zero include/exclude karaychay
		while(iNo != 0)
		{
			iDigit = iNo % 10;
			iMult = iMult * iDigit;
			iNo = iNo / 10;
		}

		System.out.println(iMult);
	}
}

class program21_1
{
	public static void main(String A[])
	{
		Logic obj = new Logic();
		obj.productOfDigits(234);
	}
}