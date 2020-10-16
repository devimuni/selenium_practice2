package stringPrograms;

import org.testng.annotations.Test;

public class Stringpalindromeornot 

{
	
	@Test (description = "using string concatination")
	public void method1()
	{
		
		String word = "ABCBa";
		String org_word = word;
		String rev = "";
		
		for(int i=word.length()-1;i>=0;i--)
		{
			rev= rev+ word.charAt(i);
		}
		
		System.out.println(rev);
		
		
		if(org_word.equals(rev))
		{
			
			System.out.println("String is palindrome");
		}
		
		else
		{
			System.out.println("String is not a palindrome");
			
		}
				
	}
	
	
	
	
	
	
	
}
