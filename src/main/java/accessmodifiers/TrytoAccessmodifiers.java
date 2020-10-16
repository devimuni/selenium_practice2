package accessmodifiers;

public class TrytoAccessmodifiers extends  Accessmodifiers {

	public static void main(String[] args) {
		
		//with inheritance and using child class object
		//within the package this child class can access only public,protected,default
		//it cannot access private.
		TrytoAccessmodifiers access2 = new TrytoAccessmodifiers();
		access2.publicprint();
		access2.protectedprint();
		access2.defaultprint();
		
		
		
	}

}
