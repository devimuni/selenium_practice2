package xpath;

import java.util.ArrayList;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Arraylistsortwithcomparator {


	@Test
	public void comparearraylist()
	{
		ArrayList<String> list = new ArrayList<String>();

		list.add("11 November 2018");
		list.add("3 November 2018");
		list.add("29 October 2018");
		list.add("26 October 2018");
		list.add("26 September 2018");
		list.add("24 August 2018");
		list.add("21 June 2018");
		list.add("21 June 2018");
		list.add("9 June 2018");

		boolean sortedOrNot = sortedOrNot(list);
		Assert.assertEquals(true, sortedOrNot);
	}

	public boolean sortedOrNot(ArrayList<String> listValues1) {
		System.out.println("number of values "+ listValues1.size());
		for(int i=0; i<listValues1.size()-1;i++) 
		{

			System.out.println(listValues1.get(i));
			System.out.println(listValues1.get(i+1));
			int temp = listValues1.get(i).compareTo(listValues1.get(i+1));
			System.out.println(temp);
			if(temp<1) 
			{

				return false;
			} 

		}

		return true;

	}

}
