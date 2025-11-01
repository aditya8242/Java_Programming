////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/checkPalindrome
//    Description:          Used to check whether a given number is palindrome or not
//    Input:                Integer
//    Output:               Integer
//    Author:               Aditya Harishchandra Chavan
//    Date:                 29/10/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	void checkPalindrome(int iNo)
	{
		int iDigit = 0, iOriginal = 0, iRev = 0;
		iOriginal = iNo;

		while(iNo != 0)
		{
			iDigit = iNo % 10;
			iRev = iRev * 10 + iDigit;
			iNo = iNo / 10;
		}

		if(iOriginal == iRev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Entry point method for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class program2_2
{
	public static void main(String A[])
	{
		Logic obj = new Logic();
		obj.checkPalindrome(123);
	}
}