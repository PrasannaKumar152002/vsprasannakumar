package Week5;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the numbers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Operation.calculate(a, b);
	}
}
class Operation{
	public static void calculate(int a,int b)
	{
		try {
			System.out.println("Quotient : "+a/b);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception caught: Division by zero.");
		}
	}
}