package NPTEL;

import java.util.Scanner;

public class Assignment5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3 Numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a > b && a > c) {
			System.out.println(a + " is a Greater Number");
		} else if (b > a && b > c) {
			System.out.println(b + " is a Greater Number");
		} else if (c > a && c > b) {
			System.out.println(c + " is a Greater Number");
		} else {
			System.out.println("All the Numbers are equal");
		}
	}
}
