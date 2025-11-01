////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/findLargestDigit
//    Description:          Used to find the largest digit in a number
//    Input:                Integer
//    Output:               Integer
//    Author:               Aditya Harishchandra Chavan
//    Date:                 1/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	void findLargestDigit(int iNo)
	{
		int iDigit = 0, iCurrent = 0;

		iCurrent = iNo % 10;

		while(iNo != 0)
		{
			iDigit = iNo % 10;
			if(iDigit > iCurrent)
			{
				iCurrent = iDigit;
			}
			iNo = iNo / 10;
		}

		System.out.println(iCurrent);
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Entry point method for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class program20_4
{
	public static void main(String A[])
	{
		Logic obj = new Logic();
		obj.findLargestDigit(12345);
	}
}