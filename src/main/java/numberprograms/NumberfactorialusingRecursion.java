package numberprograms;

import java.util.Scanner;



public class NumberfactorialusingRecursion {

	
	static int fact =1;
	
	public static void main(String[] args) {
		
		
		Scanner input= new Scanner(System.in);
		System.out.println("enter number");
		int num= input.nextInt();
		factnum(num);
		System.out.println(fact);
		
	}
	
	static void factnum (int num)
	{
		
		if(num>0)
		{
			
			fact =fact*num;
			factnum(num-1);
			
		}
		
	}
	
	
	
	

}
