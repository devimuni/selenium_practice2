package stringPrograms;

import org.testng.annotations.Test;

public class Stringreplacejunkandspecialchars {
	
	//Method1: replace special chars using replaceAll
	@Test(priority=1)
	public void replace1()
	{
		
		String s1 = "!@#testing$%^selenium&*()java";
		
		s1=s1.replaceAll("[^a-zA-Z0-9]","");
		
		System.out.println(s1);
	
	}
	
	//Method2: replace special chars using ASCII chars and temp string
		@Test(priority=2)
		public void replace2()
		{
			
			String s1 = "!@#testing$%selenium&*()java";
			String s2= "";
			
			for(int i=0;i<=s1.length()-1;i++)
			{
				
				if(s1.charAt(i)>64 && s1.charAt(i)<=122)
				{
					
					s2=s2+s1.charAt(i);
					
				}
				
				
			}
			
			
			
			System.out.println(s2);
		
		}
	
	
		
	@Test(description = "remove spaces",priority=3)
	public void removespace()
	{
		
		String s3 = "Tesing   Selenium Java  Program";
		
		s3=s3.replaceAll("\\s", "");
		System.out.println(s3);
		
		
	}
	
	
}
