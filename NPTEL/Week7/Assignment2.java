package Week7;

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.nextLine();
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
					|| name.charAt(i) == 'q' || name.charAt(i) == 'A' || name.charAt(i) == 'E' || name.charAt(i) == 'I'
					|| name.charAt(i) == 'O' || name.charAt(i) == 'Q') {
				count++;
			}
		}
		System.out.println(count);
	}

}
