package Week5;

import java.util.Scanner;

public class Assignment4 implements Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to be squared : ");
		int n=sc.nextInt();
		Assignment4 as=new Assignment4();
		System.out.println("The square of the given number is "+as.findsqrt(n));
	}

	@Override
	public int findsqrt(int a) {
		return a*a;
	}
}
interface Number{
	public int findsqrt(int a);
}