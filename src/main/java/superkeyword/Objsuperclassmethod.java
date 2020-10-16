package superkeyword;

public class Objsuperclassmethod extends Superkeywordmethodexample{
	void display()
	{
		
		System.out.println("I am in current class display method");
		
	}
	void show()
	{
		System.out.println("I am in current class show method");
		this.display();//we can directly call with display() without using this keyword
		super.display();
		
	}
	public static void main(String[] args) {

		Objsuperclassmethod obj = new Objsuperclassmethod();
		obj.show();
	}

}
