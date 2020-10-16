package reflectiontoaccessprivatemethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import org.testng.annotations.Test;

public class accessprivatemethod extends privatemethod{
	
	
	public void output() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		
			
		privatemethod obj= new privatemethod();
		
		Class class3 = obj.getClass();
		
		Method method3 = class3.getDeclaredMethod("display");
		method3.setAccessible(true);
		method3.invoke(obj);
		/*Scanner input1 = new Scanner(System.in);
		System.out.println("input a");
		int a=input1.nextInt();
		System.out.println("input b");
		Scanner input2 = new Scanner(System.in);
		int b=input2.nextInt();
		*/
	}

}
