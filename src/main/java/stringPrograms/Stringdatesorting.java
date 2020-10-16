package stringPrograms;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.testng.annotations.Test;

public class Stringdatesorting {

	@Test
	public void datesort() throws ParseException
	{

		String s1 = "03 November 2018";
		String s2 = "29 October 2018";

		String[] s3 = s1.split("\\s", 3);
		String[] s4 = s2.split("\\s", 3);
		
		String s5 =Arrays.toString(s3);
		System.out.println(s5);
		String s6 = Arrays.toString(s4);
		System.out.println(s6);

		if (s5.compareTo(s6)<0)
		{	
			int temp = s5.compareTo(s6);
			System.out.println(temp);
			System.out.println("Strings are not in sorted order");
			

		}



		/*Date date1=new SimpleDateFormat("dd MM yyyy").parse(s1);  
	    System.out.println(s1+"\t"+date1);  */

		/*	
		if(s1.replaceAll(" ", "").compareTo(s2.replaceAll(" ", ""))>0) 
		{
			System.out.println("Strings are not in sorted order");

		}

		String s3 = "11";
		String s4 = "3";
		if (s3.compareTo(s4)>0)
		{
			System.out.println("Strings are not in sorted order");

		}*/


	}

}
