package thiskeyword;

public class Thiskeywordtoinvokecurrentclassmethod {

	
	void display()
	{
			System.out.println("hello");
	}
	
	void show()
	{
		this.display();
		//here if we don't use this keyword still compiler automatically put this key word and give same result
	}
	public static void main(String[] args) {
		Thiskeywordtoinvokecurrentclassmethod thismethod = new Thiskeywordtoinvokecurrentclassmethod();
		thismethod.show();
	}

}
