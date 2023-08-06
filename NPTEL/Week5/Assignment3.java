package Week5;

import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number(0 or 1)");
		int i = sc.nextInt();
		int j;
		try {
			switch (i) {
			case 0:
				int zero = 0;
				j = 92 / zero;
				break;
			case 1:
				int b[] = null;
				j = b[0];
				break;
			default:
				System.out.println("No exception");
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
