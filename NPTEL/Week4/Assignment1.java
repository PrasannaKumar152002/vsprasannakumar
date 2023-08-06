package Week4;

import java.util.Scanner;
import static java.lang.System.*;
import java.util.LinkedList;

public class Assignment1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String courseName = scanner.nextLine();
		out.println("Course: " + courseName);
		LinkedList<String> cars = new LinkedList<>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		out.println(cars);
	}
}
