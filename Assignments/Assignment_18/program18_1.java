////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/checkPrime
//    Description:          Used to check whether a number is prime or not
//    Input:                Integer
//    Output:               String
//    Author:               Aditya Harishchandra Chavan
//    Date:                 29/10/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	void checkPrime(int iNo)
	{
		int iCnt = 0;
		int iFrequency = 0;
		int iBound = 0;

		for(iBound = (iNo / 2), iCnt = 2; iCnt <= iBound; iCnt++)
		{
			if(iNo % iCnt == 0)
			{
				iFrequency++;
				break;
			}
		}

		if(iFrequency == 0) // no factors
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a prime number");
		}
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Entry point method for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class program18_1
{
	public static void main(String A[])
	{
		Logic obj = new Logic();
		obj.checkPrime(17);
	}
}