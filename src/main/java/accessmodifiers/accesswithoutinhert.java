package accessmodifiers;

public class accesswithoutinhert {

	public static void main(String[] args) {
		
		//without inheritance using parent class object we can access public,protected,default
		Accessmodifiers access3= new Accessmodifiers();
		access3.publicprint();
		access3.protectedprint();
		access3.defaultprint();
		
	}
		

}
