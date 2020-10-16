package arrayprograms;

public class Arrayfindingmissingnumber 
{

	public static void main(String[] arg) 

	{
		int a[] = {1,2,3,5,6};

		int sum1= 0;
		
		for(int i=0;i<=a.length-1;i++)
		{

			sum1 =sum1+a[i];
		}
		
		int sum2=0;
		
		for(int i=1;i<=6;i++)
		{
			sum2= sum2+i;
			
		}
		
		int missing =sum2-sum1;
		System.out.println("missing number is  "+ missing);
	}



}
