package arraybubblesort;

import org.testng.annotations.Test;

public class CallingArraymethodfunction {
	
	@Test
	public void bubblesort()
	{
		
		Arraytomethodaspaarameter arraymethod = new Arraytomethodaspaarameter();
		
		//get array from returnarray method
		int [] a= arraymethod.returnIntarray();
		String[] b = arraymethod.returnStringarray();
		char[] c= arraymethod.returnCharArray();
		
		//parse the above array as parameter and get the array by using arraymethod
		arraymethod.SortIntarray(a);
		arraymethod.SortStringarray(b);
		arraymethod.Sortchararray(c);
		

	}

}
