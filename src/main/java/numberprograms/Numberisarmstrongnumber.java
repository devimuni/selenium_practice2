package numberprograms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Numberisarmstrongnumber {

	@Test
	public void armstrong()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		//int num=153;//153 is arm strong number
		int temp=num;
		int length=0;

		while(temp!=0)
		{
			temp =temp/10;
			length++;

		}

		int temp2=num;
		int rem=0;
		int arm=0;
		while(temp2!=0)
		{

			int mul=1;
			rem=temp2%10;
			for(int i=1;i<=length;i++)
			{
				mul=mul*rem;

			}
			arm=mul+arm;
			temp2=temp2/10;
		}

		if(arm==num)
		{

			System.out.println("number is armstrong number");
		}
		else
		{

			System.out.println("number is not an armstrong number");
		}


	}











}
