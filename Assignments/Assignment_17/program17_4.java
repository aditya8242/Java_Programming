////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/findMin
//    Description:          Used to find minimum number between three given numbers
//    Input:                Integer, Integer, Integer
//    Output:               Integer
//    Author:               Aditya Harishchandra Chavan
//    Date:                 29/10/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	void findMin(int iNo1, int iNo2, int iNo3)
	{
		if(iNo1 < iNo2 && iNo1 < iNo3)
		{
			System.out.println(iNo1);
		}
		else if(iNo2 < iNo1 && iNo2 < iNo3)
		{
			System.out.println(iNo2);
		}
		else
		{
			System.out.println(iNo3);
		}
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Entry point method for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class program17_4
{
	public static void main(String A[])
	{
		Logic obj = new Logic();
		obj.findMin(3, 7, 21);
	}
}