package staticblocks;



public class staticblock {

	// all the static blocks will execute first then main method will execute
	//static block can initialize static members(variables)
	
	static int a;
	static {
		a=10;
		System.out.println("block1");
		System.out.println("a value is "+a);
			
	}
	
	public static void main(String[] args) {
		System.out.println("main method");

	}

	static {
		
		System.out.println("block2");
	}
	
	
}
