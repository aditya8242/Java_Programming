// OOP design

import java.util.*;

class ArrayX
{
	private int Arr[];
	private int iSize;

	public ArrayX(int iNo)
	{
		System.out.println("Inside constructor");
		iSize = iNo;
		Arr = new int[iSize];
	}

	public void Accept()
	{
		int i = 0;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the elements of array:");

		for(i = 0; i < Arr.length; i++)
		{
			Arr[i] = sobj.nextInt();
		}
	}

	public void Display()
	{
		int i = 0;
		
		System.out.println("Elements of array are:");

		for(i = 0; i < Arr.length; i++)
		{
			System.out.println(Arr[i]);
		}
	}
}

class program106
{
	public static void main(String A[])
	{
		ArrayX aobj1 = new ArrayX(5);
		System.out.println(aobj1.iSize); // error

		// bad code (need of access specifier)
		aobj1.iSize = 11; // error
		aobj1.Arr = null; // error

		ArrayX aobj2 = new ArrayX(7);
		System.out.println(aobj2.iSize); // error

	}
}