////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Class/Method Name:    Logic/displayGrade
//    Description:          Used to display grade according to given marks
//    Input:                Integer
//    Output:               String
//    Author:               Aditya Harishchandra Chavan
//    Date:                 30/10/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
	void displayGrade(int iNo)
	{
		if(iNo >= 60 && iNo <= 100)
		{
			System.out.println("A");
		}
		else if(iNo >= 45 && iNo <= 59)
		{
			System.out.println("B");
		}
		else if(iNo >= 33 && iNo <= 44)
		{
			System.out.println("C");
		}
		else if(iNo >= 0 && iNo <= 32)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Invalid marks");
		}
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    Entry point method for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////////

class program4_2
{
	public static void main(String A[])
	{
		Logic obj = new Logic();
		obj.displayGrade(30);
	}
}