package staticVariable;

public class WithStaticvariable {

	int emp_no;
	String emp_name;
	static String emp_company = "Tri";
	
	
	WithStaticvariable(int emp_no,String emp_name)
	{
		
		this.emp_no=emp_no;
		this.emp_name = emp_name;
	
	}
	
	void display()
	{
		
		System.out.println(emp_no + "," + emp_name + "," + emp_company);
		
	}
	
	
	public static void main(String[] args) {
		
		WithStaticvariable obj1= new WithStaticvariable(100,"aaa");
		WithStaticvariable obj2= new WithStaticvariable(101,"bbb");
		WithStaticvariable obj3= new WithStaticvariable(102,"ccc");
		
		obj1.display();
		obj2.display();
		obj3.display();
		
	}

}
