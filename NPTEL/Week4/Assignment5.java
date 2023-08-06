package Week4;

public class Assignment5 implements First,Second {
	public static void main(String[] args) {
		Assignment5 as=new Assignment5();
		as.Display();
	}

	@Override
	public void Display() {
		System.out.println("Circle : "+First.str);
		System.out.println("Circle : "+Second.str);
		
	}
}
interface First{
	String str="This is Shape1";
	public void Display();
}
interface Second{
	String str="This is Shape2";
	public void Display();
}
