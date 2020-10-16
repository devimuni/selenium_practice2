package staticVariable;



//emp company name is same but if don't declare it as static then  we need create object
//and every time we need parse value so it will occupy more memory
public class WithoutStaticvariable {
	
	
	int emp_no;
	String emp_name;
	String emp_company;
	
	 WithoutStaticvariable(int emp_no,String emp_name, String emp_company)
	{
		
		this.emp_no =emp_no;
		this.emp_name=emp_name;
		this.emp_company = emp_company;
		
		
		
	}
	
	void display()
	{
		
		System.out.println(emp_no+","+emp_name+","+emp_company);
		
		
	}
	
	public static void main(String[] args) {
		
		WithoutStaticvariable emp_obj1 = new WithoutStaticvariable(100,"aaa","tri");
		WithoutStaticvariable emp_obj2 = new WithoutStaticvariable(101,"bbb","tri");
		WithoutStaticvariable emp_obj3 = new WithoutStaticvariable(102,"ccc","tri");
		
		emp_obj1.display();
		emp_obj2.display();
		emp_obj3.display();
	}

}
