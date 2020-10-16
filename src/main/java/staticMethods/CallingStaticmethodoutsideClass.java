package staticMethods;

public class CallingStaticmethodoutsideClass {

	public static void main(String[] args) {
		int i=40;
		//calling the method with class name without creating object
		CallingStaticmethodinaclass.display();
		System.out.println(CallingStaticmethodinaclass.i);
		CallingStaticmethodinaclass.display(i);
		System.out.println(CallingStaticmethodinaclass.i);
		
	
	}

}
