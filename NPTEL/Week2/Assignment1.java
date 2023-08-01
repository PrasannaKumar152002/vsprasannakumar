package Week2;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student st=new Student();
		School sh=new School();
		sh.call();
		st.call();
	}
}
class Student{
	public void call()
	{
		System.out.println("Student class method called.....");
	}
}
class School{
	public void call()
	{
		System.out.println("School class method called.....");
	}
}
