////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/checkDivisible
//    Description:          Used to check if a given number is divisible by 5 and 11
//    Input:                Integer
//    Output:               String
//    Author:               Aditya Harishchandra Chavan
//    Date:                 30/10/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	void checkDivisible(int iNo)
	{
		if(iNo % 5 == 0 && iNo % 11 == 0)
		{
			System.out.println("Divisible by 5 and 11");
		}
		else
		{
			System.out.println("Not divisible by 5 and 11");
		}
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Entry point method for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class program4_3
{
	public static void main(String A[])
	{
		Logic obj = new Logic();
		obj.checkDivisible(110);
	}
}