package NPTEL;

import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius : ");
		int r = sc.nextInt();
		if (r <= 0) {
			System.out.println("Please enter non-zero positive number");
		} else {
			System.out.println(
					"Perimeter of a Circle of Radius " + r + " is : " + String.format("%.2f", 2 * Math.PI * r));
			System.out.println("Area of a Circle of Radius " + r + " is : " + String.format("%.2f", Math.PI * r * r));
		}
	}
}
