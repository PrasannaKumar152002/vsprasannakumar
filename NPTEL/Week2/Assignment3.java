package Week2;

import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		Students2 st=new Students2();
		//Schools sh=new Schools();
		st.done();
	}
}
class Students2{
	public void call(Students2 st)
	{
		System.out.println("Student class method called");
	}
	public void done()
	{
		call(this);
	}
}