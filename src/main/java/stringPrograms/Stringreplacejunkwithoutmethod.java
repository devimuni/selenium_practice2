package stringPrograms;

public class Stringreplacejunkwithoutmethod {

	public static void main(String[] args) {
		
		
		String s1 = "!@#testing$%selenium&*()java";
		String s2= "";
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			
			if(s1.charAt(i)>64 && s1.charAt(i)<=122)
			{
				
				s2=s2+s1.charAt(i);

			}

		}

		System.out.println(s2);
	
	}

}
