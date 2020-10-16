package arraymethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;
import org.testng.annotations.Test;



public class Arraymethods1 {


	@Test(priority=1)	
	public void ArraysMethod()
	{

		int[] Array1 = { 6, 2, 5, 4, 3};

		//print array converting it into string using "Arrays.toString(type)" method
		System.out.println("print array as string  " + Arrays.toString(Array1));


		//Arrays.sort

		System.out.println("Before Sort  " + Arrays.toString(Array1));
		Arrays.sort(Array1);
		System.out.println("After Sort  " + Arrays.toString(Array1));

		//Arrays.parllelSort

		int[] Array2 = { 6, 2, 5, 4, 3}; 
		System.out.println("Before Sort  " + Arrays.toString(Array2));
		Arrays.parallelSort(Array2);
		System.out.println("After Sort  " + Arrays.toString(Array2));

		//Arrays.sort and Arrays.parallelSort only from index a to index b

		int[] Array3 = { 10, 4, 6, 2, 1, 9, 7, 8, 3, 5 };


		System.out.println("Before Sort  " + Arrays.toString(Array3));
		Arrays.sort(Array3,0,9);
		System.out.println("After Sort  " + Arrays.toString(Array3));

		//Arrays.parallelSort only from index a to index b

		int[] Array4 = { 10, 4, 6, 2, 1, 9, 7, 8, 3, 5 };

		System.out.println("Before Sort  " + Arrays.toString(Array4));
		Arrays.sort(Array4,0,7);
		System.out.println("After Sort  " + Arrays.toString(Array4));


		//Convert Array to list

		String[] stringArray = { "a", "b", "c", "d", "e" };
		List<String> List = new ArrayList<String>(Arrays.asList(stringArray));
		System.out.println("Convert Array to list    :" + List);

		//Convert Array to Arraylist


		ArrayList<String> AList = new ArrayList<String>(Arrays.asList(stringArray));
		System.out.println("Convert Array to array list    :" + AList);


		//Convert Array to Set

		Set<String> set = new HashSet<String>(Arrays.asList(stringArray));
		System.out.println("Convert Array to set    :" +set);

		//Convert Array to hashset
		HashSet<String> Hset = new HashSet<String>(Arrays.asList(stringArray));
		System.out.println("Convert Array to hash set    :" +Hset);
		
		
		
		//covert arraylist to array
		
		String[] stringArray2 = { "a", "b", "c", "d", "e" };
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray2));
		String[] stringArr = new String[arrayList.size()];
		arrayList.toArray(stringArr);
		for (String s : stringArr)
		System.out.println(s);
		

	}



	@Test(priority=2)
	public void ArrayUtilsmethods()
	{



		int[] intArray = { 1, 2, 3, 4, 5 };
		int[] intArray2 = { 6, 7, 8, 9, 10 };



		//concatenate two arrays
		int[] combinedIntArray = ArrayUtils.addAll(intArray, intArray2);
		System.out.println("comboned array  " +Arrays.toString(combinedIntArray));


		//Reverse an array

		ArrayUtils.reverse(intArray);
		System.out.println("Reverse an array   " + Arrays.toString(intArray));


		//remove an element from array 
		int[] removed = ArrayUtils.removeElement(intArray, 3);//create a new array
		System.out.println("remove an element from array   "  + Arrays.toString(removed));

	}
	//Declare an array
	String[] aArray = new String[5];
	String[] bArray = {"a","b","c", "d", "e"};
	String[] cArray = new String[]{"a","b","c","d","e"};

	//Declare array inline
	//method(new String[]{"a", "b", "c", "d", "e"});


}
