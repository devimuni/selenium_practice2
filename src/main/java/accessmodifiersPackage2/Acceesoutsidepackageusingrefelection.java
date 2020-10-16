package accessmodifiersPackage2;



import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import accessmodifiers.Accessmodifiers;

public class Acceesoutsidepackageusingrefelection extends Accessmodifiers {

	
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
	
		
		
		Accessmodifiers classaccess = new Accessmodifiers();
		
		Class cls = classaccess.getClass();
		
		
		//using reflection Method class we can access default and private methods outside package
		Method privatemethod = cls.getDeclaredMethod("privateprint");
		privatemethod.setAccessible(true);
		privatemethod.invoke(classaccess);
		
		
		
		Method defaultmethod = cls.getDeclaredMethod("defaultprint");
		defaultmethod.setAccessible(true);
		defaultmethod.invoke(classaccess);

		
		
		
	
	}
	
	
	
	
}
