package Week2;

public class Assignment4 {
	public static void main(String[] args) {
		Construct ct=new Construct("Done");
	}
}
class Construct{
	public Construct()
	{
		System.out.println("Default constructor called.....");
	}
	public Construct(String str)
	{
		this();
		System.out.println("String parameter constructor called.....");
	}
}