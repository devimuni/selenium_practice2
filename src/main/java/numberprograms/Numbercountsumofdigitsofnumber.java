package numberprograms;

public class Numbercountsumofdigitsofnumber {
	
	
	public static void main(String [] arg)
	
	{
		int num = 12345;
		int sum =0;
		
		while(num>0)
		{
			
			sum = sum+num%10;
			num = num/10;
			
		}
		
		System.out.println("sum of the digits of a number is "+sum);
		
		
		
		
		
	}
	
	
	
	

}
