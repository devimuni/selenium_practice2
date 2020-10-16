package stringMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Stringmethods 
{

	@Test
	public void stringexamples() throws MalformedURLException
	{

		String s1= "Welcome To Selelnium !@#$%^&*()_+{}:>?<;'[]-=' 0123456789";

		//1 replaceAll() remove special chars 
		System.out.println("remover special chars and numbers: " + s1.replaceAll("[^a-zA-Z ]",""));
		System.out.println("remover special chars: " + s1.replaceAll("[^a-zA-Z0-9 ]",""));
		
		//2 replace a char
		System.out.println("replace e with E    "+s1.replace("e","E"));
		



		//3 trim() - remove white spaces from both the ends of the string
		String s2= "   welcome  to selenium   ";
		System.out.println("remover space before and after the string: " + s2.trim());
		
		//4 remove white spaces with in the string
		System.out.println("remover white spaces in the string: " + s2.replaceAll("\\s",""));
		
		//5 String toUpperCase
		System.out.println("string to upper case: " +s2.toUpperCase());
		
		//6 String to lower case
		
		System.out.println("string to lower case : " +s2.toLowerCase());
		
		//7 print substring by index
		System.out.println("substring from 0 index : " +s2.substring(0));//start with 0 and goes to end
		
		System.out.println("substring from 0 to index 10  : " +s2.substring(0,10));
		System.out.println("substring from 4 to index 10 : " +s2.substring(4,10));
		


		//equals two strings equal or not

		String s3 = "Gello";
		String s4 = "Hello";
		System.out.println("strings equal or not    "  + s3.equals(s4) );
		
		

		//equalsIgnoreCase() two strings equal or not

		String s5 = "welcome to selenium";
		String s6 = "Welcome To Selenium";
		System.out.println("strings equal or not     "+ s5.equalsIgnoreCase(s6) );
		
		//String concat
		System.out.println("strings concat    "  + s3.concat(s4) );
		
		
		
		//charAt 
		String s7 = "welcome to selenium";
		System.out.println("strings char at3     "+ s7.charAt(3) );
		
		//length
		String s8 = "welcome to selenium";
		System.out.println("strings length     "+ s8.length() );
		
		
		//contains
		String s9 = "welcome to selenium";
		System.out.println("strings welcome to selenium contains to     "+ s9.contains("to") );
		
		
		//string split
		
		
		//string String valueOf(int value)
		
		//string intern
		
		
		
	}








}
