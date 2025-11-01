////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/printDigits
//    Description:          Used to print digits of number separately
//    Input:                Integer
//    Output:               Integer
//    Author:               Aditya Harishchandra Chavan
//    Date:                 30/10/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class program19_4
{
	void printDigits(int iNo)
	{
		// original approach to print digits as is as number 1234 -> 1 2 3 4
		// and not as 1234 -> 4 3 2 1
		// problem comes when there's zero in the number

		/*
		int iDigit = 0, iRev = 0;

		while(iNo != 0)
		{
			iDigit = iNo % 10;
			iRev = iRev * 10 + iDigit;
			iNo = iNo / 10;
		}

		iDigit = 0;
		while(iRev != 0)
		{
			iDigit = iRev % 10;
			System.out.print(iDigit + " ");
			iRev = iRev / 10;
		}

		System.out.println();
		*/


		// another approach, not my idea, took it from the internet
		// but have understood it
		int iDiv = 1;

		// find the largest power of 10
		while(iNo / iDiv >= 10)
		{
			iDiv = iDiv * 10;
		}

		while(iDiv != 0)
		{
			System.out.print(iNo / iDiv + " ");
			iNo = iNo % iDiv;
			iDiv = iDiv / 10;
		}

		System.out.println();
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Entry point method for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class program4_4
{
	public static void main(String A[])
	{
		Logic obj = new Logic();
		obj.printDigits(1234);
	}
}