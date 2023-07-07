import java.util.Scanner;
public class Swap {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Swapping of two numbers");
		System.out.print("Enter a number : ");
		try {
			double n1=sc.nextDouble();
			double n2=sc.nextDouble();
			System.out.println("--Before swap--");
			System.out.println("First number = " + n1);
			System.out.println("Second number = " + n2);
			double temporary = n1;
			n1 = n2;
			n2 = temporary;
			System.out.println("--After swap--");
			System.out.println("First number = " + n1);
			System.out.println("Second number = " + n2);
		}
		catch(Exception e)
		{
			System.out.println("The input you have entered is not an number");
		}
	}
}