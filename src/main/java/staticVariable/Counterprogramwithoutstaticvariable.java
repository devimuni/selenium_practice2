package staticVariable;

public class Counterprogramwithoutstaticvariable {

	int count =0;
	Counterprogramwithoutstaticvariable()
	{
		count++;
		System.out.println(count);
		
	}
	
	public static void main(String[] args) {
		
		
		Counterprogramwithoutstaticvariable counter1 = new Counterprogramwithoutstaticvariable();
		Counterprogramwithoutstaticvariable counter2 = new Counterprogramwithoutstaticvariable();
		Counterprogramwithoutstaticvariable counter3 = new Counterprogramwithoutstaticvariable();
		
	}

}
