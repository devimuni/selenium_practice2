package inheritence;

public class ClassB extends ClassA{

	public void display()
	{
		
		System.out.println("class B method");
		ClassA obj = new ClassA();
		obj.display();
		
	}
	
	
	
}
