package NPTEL;

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		System.out.println(divisible(n, 0));

	}

	static int divisible(int n, int sum) {
		if (n == 0) {
			return sum;
		} else if (n % 2 == 0) {
			if (n % 3 == 0) {
				sum += n;
			}
		}
		return divisible(--n, sum);
	}
}
