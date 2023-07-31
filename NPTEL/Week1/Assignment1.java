package NPTEL;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the total number of subject : ");
		int n = sc.nextInt();
		int sum = 0, max = 0;
		for (int i = 0; i < n; i++) {
			int b = sc.nextInt();
			sum += b;
			if (max < b) {
				max = b;
			}
		}
		System.out.println("Highest Mark : " + max);
		System.out.println("Average Mark : " + (float) sum / n);
	}
}
