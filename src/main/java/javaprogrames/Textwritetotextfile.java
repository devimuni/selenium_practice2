package javaprogrames;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.testng.annotations.Test;

public class Textwritetotextfile {

	public static void main(String[] args) throws IOException 
	{
		
		FileWriter fw = new FileWriter("D:\\Selenium\\write.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		
		bw.write("write to the file");
		bw.newLine();
		bw.write("seleinum practice");
		bw.newLine();
		bw.close();
	}
	
	@Test (description= "file and printwriter")
	public void method2() throws FileNotFoundException
	{
		
		File file = new File("D:\\Selenium\\write.txt");
		PrintWriter pw = new PrintWriter(file);
		
		pw.println("Selenium webdriver");
		pw.println("selenium with java");
		pw.close();
				
	}

}
