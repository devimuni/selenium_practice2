package arrayprograms;

import java.util.HashSet;

import org.testng.annotations.Test;

public class Arrayfindingduplicateelement 
{
	
	public static void main(String[] arg)
	{
		
		String a[] = {"java","ruby","python","ruby","java"};
		
		boolean value =false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					
					System.out.println("found duplicate element "+ a[i]);
					value= true;
				}
				
			}
			
		}
		
		if(value==false)
		{
			System.out.println("no duplicate elements");
		}
		
	}
	
	@Test(description="usinghashset")
	public void method2()
	{
		String a[] = {"java","ruby","python","ruby","java"};
		HashSet <String> hs = new HashSet<String>();
		
		boolean result = false;
		
		for(String value:a)
		{
			
			if((hs.add(value))==false)
			{
				
				System.out.println("found duplicate value  " + value);
				result = true;
				
			}
		}
		
		if(result == false)
		{
			
			System.out.println("no duplicate elements");
		}
		
		
		
	}
	
	
	
	

}
