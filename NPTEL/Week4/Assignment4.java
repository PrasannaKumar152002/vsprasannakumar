package Week4;

public class Assignment4 implements Inter1,Inter2 {
	public static void main(String[] args) {
		Assignment4 as=new Assignment4();
		as.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		Inter2.super.display();
		Inter1.super.display();
	}
}
interface Inter1{
	default void display()
	{
		System.out.println("Interface-1 Called.........");
	}
}
interface Inter2{
	default void display()
	{
		System.out.println("Interface-2 Called.........");
	}
}