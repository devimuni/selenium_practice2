package staticVariable;

public class Counterwithstaticvariable {
	
	static int count =0;
	Counterwithstaticvariable()
	{
		count++;
		System.out.println(count);
		
	}
	
	public static void main(String[] args) {
		
		Counterwithstaticvariable count1 = new Counterwithstaticvariable();
		Counterwithstaticvariable count2 = new Counterwithstaticvariable();
		Counterwithstaticvariable count3 = new Counterwithstaticvariable();
	}

}
