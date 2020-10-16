package stringPrograms;

import org.testng.annotations.Test;

public class Stringreverseaword {
	
	//@Test(description ="using string concatenation")
	public void method1()
	{
		
		String word = "ABCDEF";
		String revword = "";
		
		for(int i=word.length()-1;i>=0; i--)
			
		{
			revword = revword + word.charAt(i);
		
		}
		
		System.out.println("Reverse of word ABCDEF is  "+revword);
	}
	
	//@Test(description = "using character array")
	
	public void method2()
	
	{
		String word = "ABCDEF";
		char[] ch = word.toCharArray();
		String revword = "";
		
		
		for(int i=ch.length-1;i>=0;i--)
		{
			
			revword = revword+ch[i];
			
		}
		
		System.out.println("Reverse a word ABCDEF " + revword);
		
	}
	
	@Test (description = "usingstring buffer")
	public void method3()
	
	{
		String word = "ABCDEF";
		StringBuffer sb = new StringBuffer(word);
		StringBuffer revword = sb.reverse();
		System.out.println("Reverse a word ABCDEF " + revword);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
