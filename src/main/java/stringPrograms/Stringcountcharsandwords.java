package stringPrograms;

import org.testng.annotations.Test;

public class Stringcountcharsandwords {


	public static void main(String[] args)
	{

		String s1 = "Welecome to selenium java practice";

		int len1= s1.length();

		int len2 =s1.replace("e", "").length();

		int count = len1-len2;
		System.out.println("numbers of e's:   "+ count);

	}

	//@Test
	public void countwords()
	{

		String s2 = "Welecome to selenium java practice";

		int count =1;

		for (int i=0;i<=s2.length()-1;i++) 
		{

			if((s2.charAt(i)==' ') && (s2.charAt(i+1)!= ' '))
			{

				count++;
			}

		}

		System.out.println("number of words "+ count);

	}
}
