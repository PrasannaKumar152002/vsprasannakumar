package Week3;

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		Operation op=new Operation();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(op.add(a,b));
		System.out.println(Operation.multiply(a, b));
	}
}
class Operation{
	public int add(int a,int b)
	{
		return a+b;
	}
	@Deprecated
	public static int multiply(int a,int b)
	{
		return a*b;
	}
}