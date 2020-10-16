package numberprograms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Numberyearisaleapyearornot {


	/*public static void main(String[]args) 

	{
		Scanner input  = new Scanner(System.in);
		System.out.println("enter the year");

		int year = input.nextInt();
		boolean leap  = false;
		if(year %4 ==0)
		{
			if(year%100==0)
			{
				if(year%400 == 0)
				{

					leap =true;

				}
				else
				{

					leap = false;
				}

			}
			else
			{

				leap = true;

			}
		}
		else
		{
			leap =false;	
		}

		if(leap==true)
		{

			System.out.println(year   + "    year is a leap year");
		}
		else
		{
			System.out.println(year   + "   year is not a leap year");
			
		}
	}*/


	@Test
	public void leapyear()
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter an year");
		int year = input.nextInt();
		if((year%400==0)|| ((year%4==0) && (year%100!=0)))
		{
			System.out.println("Year is leap year");
			
		}
		else
		{
			
			System.out.println("Year is not a leap year");
		}
		
	}
	
	
	
	
	


}








