////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/calculateSum
//    Description:          Used to calculate sum of first N natural number
//    Input:                Integer
//    Output:               Integer
//    Author:               Aditya Harishchandra Chavan
//    Date:                 28/10/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	void calculateSum(int iNo)
	{
		int iCnt = 0, iSum = 0;

		for(iCnt = 1; iCnt <= 10; iCnt++)
		{
			iSum = iSum + iCnt;
		}

		System.out.println(iSum);
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Entry point method for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class program16_1
{
	public static void main(String A[])
	{
		Logic lObj = new Logic();
		lObj.calculateSum(10);
	}
}

// testcase lihit nahiye karan mostly programs soppe aahe
// next assignment pasun lihil
// input values pan hard coded aahet