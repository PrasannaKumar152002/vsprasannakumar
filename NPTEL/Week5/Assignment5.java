package Week5;

import java.util.Scanner;

public class Assignment5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int n = sc.nextInt();
		int n1 = sc.nextInt();
		if (n < 0 || n1 < 0) {
			System.out.println("-1");
		} else {
			System.out.println("The GCD of the given Number is " + GCD.calculate(n, n1));
		}
	}
}

class GCD {
	public static int calculate(int n, int n1) {
		if (n1 == 0) {
			return n;
		}
		return calculate(n1, n % n1);
	}
}