package staticMethods;

abstract class CallingStaticmethodinaclass {

	static int i=20;
	static void display(int i)
	{	
		System.out.println("called static method directly without object");
		System.out.println(i);
	}
	
	static void display()
	{	
		System.out.println("called static method directly without object");
		System.out.println(i);
	}
	
	void display3()
	{
		
		System.out.println(i);
	}
	
	
	
	public static void main(String[] args){
		
		int i=30;
		display();
		
		
	}

}
