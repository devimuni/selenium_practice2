package javavariables;

public class Typesofvariablesinjava {

	
	
	
	static String staticVariable;
	long instanceVariable;

	public static void methodName(int methodParameter) 
	{
		int methodLocalVariable=30;
		
		System.out.println(methodLocalVariable);
		
		System.out.println(staticVariable);
		

		if (true) {
			int blockVariable = 4;
		}

	}





	public static void main(String[] args) {
		
		methodName(10);
		Typesofvariablesinjava obj = new Typesofvariablesinjava();
		System.out.println(obj.instanceVariable);
		
		
	}

}
