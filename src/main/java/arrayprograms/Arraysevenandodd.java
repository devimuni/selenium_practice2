package arrayprograms;

public class Arraysevenandodd {

	public  static void main(String[] args)
	{

		int a[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Even numbers");

		for(int i :a)
			//for(int i=0;i<=a.length-1;i++)

		{
			if(i%2==0)
				//if(a[i]%2==0)
			{
				//System.out.println(a[i]);
				System.out.println(i);

			}

		}
		
		System.out.println("odd numbers");

		for(int i2:a)
			//for(int i=0;i<=a.length-1;i++)

		{   if(i2%2!=0) 
			//if(a[i]%2!=0)
		{
			//System.out.println(a[i]);
			System.out.println(i2);


		}

		}
	}

}
