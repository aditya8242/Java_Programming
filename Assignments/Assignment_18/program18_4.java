////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/sumEvenOddDigits
//    Description:          Used to display sum of even and odd digits of a number seperately
//    Input:                Integer
//    Output:               Integer
//    Author:               Aditya Harishchandra Chavan
//    Date:                 29/10/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class program18_4
{
	void sumEvenOddDigits(int iNo)
	{
		int iDigit = 0, iEven = 0, iOdd = 0;

		if(iNo < 0)
		{
			iNo = -iNo;
		}

		while(iNo != 0)
		{
			iDigit = iNo % 10;
			
			if(iDigit % 2 == 0)
			{
				iEven = iEven + iDigit;
			}
			else
			{
				iOdd = iOdd + iDigit;
			}

			iNo = iNo / 10;
		}

		System.out.println("Sum of even digits: " + iEven);
		System.out.println("Sum of odd digits: " + iOdd);
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Entry point method for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class program3_4
{
	public static void main(String A[])
	{
		Logic obj = new Logic();
		obj.sumEvenOddDigits(123456);
	}
}