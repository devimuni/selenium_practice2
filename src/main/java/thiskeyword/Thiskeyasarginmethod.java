package thiskeyword;

public class Thiskeyasarginmethod {

	void display(Thiskeyasarginmethod thismethod)
	{
		System.out.println("hello");
	}

	void show()
	{
		display(this);
	}
	public static void main(String[] args) {
		Thiskeyasarginmethod thismethod = new Thiskeyasarginmethod();
		thismethod.show();
	}

}
