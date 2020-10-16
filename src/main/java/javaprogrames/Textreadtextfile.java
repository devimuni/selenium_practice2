package javaprogrames;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Textreadtextfile {

	/*public static void main(String[] args) throws FileNotFoundException {
		
		
		File file = new File("D:\\Selenium\\scrum.txt");
		Scanner sc  = new Scanner(file);
		
		while(sc.hasNextLine())
		{
			
			System.out.println(sc.nextLine());
			
		}
		sc.close();
		

	}*/
	
	//@Test (description = "use delimiter")
	public void method2() throws FileNotFoundException
	{
		
		File file2 = new File("D:\\\\Selenium\\\\scrum.txt");
		Scanner sc2 = new Scanner(file2);
		
		sc2.useDelimiter("\\z");
		System.out.println(sc2.next());
		sc2.close();
		
		
	}
	
	
	@Test(description = "file reader and buffer reader")
	public void method3() throws IOException
	{
		
		
		FileReader file3= new FileReader("D:\\\\Selenium\\\\scrum.txt");
		BufferedReader br = new BufferedReader(file3);
		
		String str;
		
		while((str=br.readLine())!=null)
		{
			
			System.out.println(str);
			
		}
		
		br.close();
		
	}

}
