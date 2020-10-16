package numberprograms;

public class Numberofdigitsinanumber 

{
	
	public static void main(String[] args)
	{
		
		int num =123458;
		int count =0;
		
		while(num>0)
		{
			num= num/10;
			count++;

		}
		
		System.out.println(count);
		
	
	}
	
	
	

}
