////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/checkPerfect
//    Description:          To check if a given number is perfect or not
//    Input:                Integer
//    Output:               String
//    Author:               Aditya Harishchandra Chavan
//    Date:                 1/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	void checkPerfect(int iNo)
	{
		int iFactSum = 0, iCnt = 0, iBound = 0;

		for(iCnt = 1, iBound = (iNo / 2); iCnt <= iBound; iCnt++)
		{
			if(iNo % iCnt == 0)
			{
				iFactSum = iFactSum + iCnt;
			}
		}

		if(iNo == iFactSum)
		{
			System.out.println("Perfect number");
		}
		else
		{
			System.out.println("Not a perfect number");
		}
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Entry point method for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class program20_3
{
	public static void main(String A[])
	{
		Logic obj = new Logic();
		obj.checkPerfect(20);
	}
}