////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/checkSign
//    Description:          Used to check whether a given number is positive, negative or zero
//    Input:                Integer
//    Output:               String
//    Author:               Aditya Harishchandra Chavan
//    Date:                 29/10/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	void checkSign(int iNo)
	{
		if(iNo < 0)
		{
			System.out.println("Negative");
		}
		else if(iNo == 0)
		{
			System.out.println("Zero");
		}
		else
		{
			System.out.println("Positive");
		}
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Entry point method for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class program18_5
{
	public static void main(String A[])
	{
		Logic obj = new Logic();
		obj.checkSign(0);
	}
}