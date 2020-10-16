package numberprograms;

public class NumberofEvenOdddigitsinanumber 
{

	public static void main(String[] args)
	{
		
		int num= 1234567;
		int rem= 0;
		int even_count= 0;
		int odd_count=0;
		
		while(num>0)
		{
			
			rem=num%10;
			num= num/10;
			if(rem%2==0)
			{
				System.out.println("even numbers are  " +  rem + " ");
				even_count++;
				
			}
			else
			{
				System.out.println("odd numbers are  "  + rem  +  " ");
				odd_count++;
			}
		}
		System.out.println("Even count is "+ even_count);
		System.out.println("Odd count is "+ odd_count);
		
		
		
	}
	
	
	
	
	
	
}
