package arrayprograms;

public class Arraysumofelements {
	
	
	public static void main(String[] args)
	{
		int a[] = {5,1,9,2,8,3,7,4,6};
		
		int sum  = 0;
		/*method1
		for(int i=0; i<= a.length-1;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println("sum of all elements is  " + sum); */
				
		for(int num:a)
		{
			sum= sum+num;
		}
		
		System.out.println("method2 sum of elements is  "+ sum);
		
	}
	

}
