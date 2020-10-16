package thiskeyword;

public class Thiskeywordtoinvokeclassconstructor {

	
	
	Thiskeywordtoinvokeclassconstructor()
	{
		
		System.out.println("constructor without arguments");
		
	}
	
	Thiskeywordtoinvokeclassconstructor(int a)
	{
		// this keyword will call first constructor also so main method will print both the lines. 
		this();
		System.out.println("constructor with arguments");
	}
	
	
	public static void main(String[] args) {
		
		
		Thiskeywordtoinvokeclassconstructor thisconstructor = new Thiskeywordtoinvokeclassconstructor(10);
		
		
		

	}

}
