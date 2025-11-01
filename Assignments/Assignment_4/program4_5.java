////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/calculatePower
//    Description:          Used to calculate power of a number
//    Input:                Integer, Integer
//    Output:               Integer
//    Author:               Aditya Harishchandra Chavan
//    Date:                 01/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	void calculatePower(int iBase, int iExp)
	{
		int iCnt = 0;
		int iPow = 1;

		if(iBase < 0)
		{
			iBase = -iBase;
		}

		if(iExp < 0)
		{
			iExp = -iExp;
		}

		for(iCnt = 1; iCnt <= iExp; iCnt++)
		{
			iPow = iPow * iBase;
		}

		System.out.println(iPow);
	}
}

class program4_5
{
	public static void main(String A[])
	{
		Logic obj = new Logic();
		obj.calculatePower(2, 5);
	}
}