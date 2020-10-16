package stringPrograms;

import org.testng.annotations.Test;

public class Stringfindnumberofsquares {
	//method1
	//@Test
	public void findsqurebrackets()
	{
		String s1= "[{] {})(] {}{]][[[]]]][[";

		int l1=s1.length();
		int l2=s1.replace("[", "").length();
		int leftsq = l1-l2;
		System.out.println("number of [ are    "+   leftsq);
		int count =0;

		int l3=s1.replace("]", "").length();
		int rightsq= l1-l3;
		System.out.println("number of ] are    "+   rightsq);

		if(leftsq==rightsq)
		{

			count++;
			System.out.println("String has pair squares");
			System.out.println("number of pairsquares are  "+ count);


		}
		else
		{
			System.out.println("String has no pair squares");

		}



	}
	//find all type brackets has pair or not
	@Test
	public void method2()
	{
		String s2= "{{{[[[]]]}}}";
		s2= s2.replaceAll("\\[\\]","").replaceAll("\\(\\)","").replaceAll("\\{\\}","");
		System.out.println(s2);
		System.out.println(s2.length());
		if (s2.length()==0)

		{
			System.out.println("String has all matching pair of brackets");

		}
		else
		{
			
			System.out.println("String has no matching pair of brackets");
		}
		
	}


}
