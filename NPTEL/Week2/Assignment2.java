package Week2;

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Students st=new Students();
		Schools sh=new Schools();
		System.out.println("------------------------------------");
		sh.call();
		st.call();
		System.out.println("------------------------------------");
	}
}
class Students{
	public void call()
	{
		System.out.println("Student class method called");
	}
}
class Schools{
	public void call()
	{
		System.out.println("School class method called");
	}
}
