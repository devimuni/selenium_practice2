package stringPrograms;

import org.testng.annotations.Test;

public class Stringswappingwithouttempstring {
	
	@Test
	public void Swapstring()
	{
			
	String s1= "Welcome";
	String s2 = "Java";
	
	System.out.println("Before Swap:      " + s1 + "  " + s2);
	s1=s1+s2;
	s2=s1.substring(0,s1.length()-s2.length());
	s1=s1.substring(s2.length());
	
	System.out.println("After Swap:     " + s1 + "  " + s2);
	
	}
	
	
	
	

}
