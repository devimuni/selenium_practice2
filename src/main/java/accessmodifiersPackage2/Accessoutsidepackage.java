package accessmodifiersPackage2;

import accessmodifiers.Accessmodifiers;

public class Accessoutsidepackage extends Accessmodifiers {
	
	
	public static void main(String[] args)
	{
		//outside pack without inheritance using parent class object
		// we can access only public variables and methods
		//we cannot access protect,default and private
		
		Accessmodifiers access4= new Accessmodifiers();
		access4.publicprint();
		
		//outside pack with inheritance using parent class object
		//we can access only public variables and methods
		//we cannot access protect,default and private
		
		access4.publicprint();
		
		
		//outside pack with inheritance using child class object
		//we can access only public,protect variables and methods
		//we cannot access default and private methods.
		Accessoutsidepackage access5 = new Accessoutsidepackage();
		access5.publicprint();
		access5.protectedprint();
		
		
	}
	
	
	
	
	

}
