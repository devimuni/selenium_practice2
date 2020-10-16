package stringPrograms;

import org.testng.annotations.Test;

public class Stringreverseeachwordinastring {

	/*public static void main(String[] args) 
	{
		String s1= "Welcome to Java";
		String[] word = s1.split(" ");
		String reversestring= "";
		
		for(String w:word)
		{
			String reverserword="";

			for(int i=w.length()-1;i>=0;i--) 
			{
			reverserword = reverserword + w.charAt(i);
			}
			reversestring = reversestring + reverserword + "  " ;
		}

		System.out.println(reversestring);
	}*/
		
	@Test(description = "using string builder")
	public void method2()
	{
	
		String s2= "welcome to selenium";
		String[] word = s2.split("\\s");
		String reversestring = "";
		
		for (String w:word)
		{
		
		StringBuilder sb = new StringBuilder(w);
		 sb.reverse();
		
		 String reverseword = sb.toString();
		 reversestring = reversestring + reverseword+ " ";
		
		}
		
		System.out.println(reversestring);
		
	}

}	