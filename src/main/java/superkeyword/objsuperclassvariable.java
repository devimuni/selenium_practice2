package superkeyword;
public class objsuperclassvariable extends Superandkeywordvariableexample
{
	
		int a= 20;
		public void display(int a)
		{
			//it will print local variable of the method
			System.out.println(a);
			
			//it will print instance variable of the current class
			System.out.println(this.a);
			
			//it will print instance variable of the parent class
			System.out.println(super.a);
			
		}
		
	public static void main(String[] args) {
		objsuperclassvariable obj = new objsuperclassvariable();
		obj.display(30);
	}
}
