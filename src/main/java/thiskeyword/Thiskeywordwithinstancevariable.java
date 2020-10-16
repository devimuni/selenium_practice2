package thiskeyword;

public class Thiskeywordwithinstancevariable {

	
	//this key word refers to current class instance variable.
	//if we don't use this keyword with instance variable then we will get the result 0
	

		int i;
		void setvalue(int i)
		{
			this.i=i;

		}
		void show ()
		{
			System.out.println("i value is : " + i);

		}
		public static void main(String[] args) {

			Thiskeywordwithinstancevariable thisclass = new Thiskeywordwithinstancevariable();
			thisclass.setvalue(10);
			thisclass.show();
		}


}
