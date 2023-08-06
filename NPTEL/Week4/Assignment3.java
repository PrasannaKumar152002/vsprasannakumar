package Week4;

public class Assignment3 {
	public static void main(String[] args) {
		Size s=new Small();
		System.out.println("------------------------------------");
		s.print();
		System.out.println("------------------------------------");
	}
}
interface ExtraLarge{
	public static String str="This is Extra-Large";
	void display();
}
abstract class Size{
	abstract void print();
}
class Small extends Size{

	@Override
	void print() {
		System.out.println("This is Small");
		new Medium().print();
	}
	
}
class Medium extends Size{

	@Override
	void print() {
		System.out.println("This is Medium");
		new Large().print();
	}
	
}
class Large extends Size implements ExtraLarge{

	@Override
	void print() {
		System.out.println("This is Large");
		display();
	}

	@Override
	public void display() {
		System.out.println(str);
	}
}