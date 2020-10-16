package numberprograms;

import org.testng.annotations.Test;

public class Numberpalindromeornot 

{	
	@Test
	public void method1()
	{

		int num = 12320;
		int revnum = 0;
		int orgnum = num;

		while(num>0)
		{
			revnum =revnum*10 + num%10;
			num = num/10;

		}

		System.out.println(revnum);
		if(orgnum==revnum)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");	
			
		}

	}


}
