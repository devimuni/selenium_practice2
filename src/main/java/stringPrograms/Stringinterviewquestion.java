package stringPrograms;

public class Stringinterviewquestion {
	
	
public static void main(String[] args) {
		
		String s1= "abc";
		String s2 ="xyz";
		
		
		for(int i =0;i<=s1.length()-1;i++)
		{
			System.out.print(s1.charAt(i));
			
			for(int j=0;j<=s2.length()-1;j++)
			{
				
				if(i==j)
				
				System.out.print(s2.charAt(j));
			}
			
		}
		
		
		/* String s1 = "nares%^&$h";
		 System.out.println(s1.replaceAll("[^a-zA-Z0-9]",""));*/
		
		
		 
		/* [
			{
				color: "red",
				value: "#f00"
			},
			{
				color: "green",
				value: "#0f0"
			},
			{
				color: "blue",
				value: "#00f"
			},
			{
				color: "cyan",
				value: "#0ff"
			},
			{
				color: "magenta",
				value: "#f0f"
			},
			{
				color: "yellow",
				value: "#ff0"
			},
			{
				color: "black",
				value: "#000"
			}
		]*/
		 
}
	
	
	

}
