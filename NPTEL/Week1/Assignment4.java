package NPTEL;

import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		if (Armstrong(n, 0) == n) {
			System.out.println("The given number is a Armstrong Number");
		} else {
			System.out.println("The given number is a Armstrong Number");
		}
	}

	static int Armstrong(int n, int sum) {
		if (n == 0) {
			return sum;
		}
		sum += Math.pow(n % 10, 3);
		return Armstrong(n / 10, sum);
	}
}
