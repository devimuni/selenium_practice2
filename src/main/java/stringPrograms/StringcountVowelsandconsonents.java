package stringPrograms;

import java.util.Scanner;

public class StringcountVowelsandconsonents {

	public static void main(String[] args) {


		Scanner input= new Scanner(System.in);
		System.out.println("enter the string");
		String s = input.nextLine();
		int vcount = 0;
		int ccount = 0;
		
		s=s.toLowerCase();
		for ( int i = 0;i<s.length(); i++)
		{

			if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i) == 'i' || s.charAt(i)=='o'||s.charAt(i)=='u' )
			{

				vcount++;

			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{

				ccount++;
			}


		}
		System.out.println("Number of Vowels  "+ vcount);
		System.out.println("Number of consonents  "+ ccount);


	}

}
