
import java.util.Scanner;
public class Largeofthree {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Largest of Three Numbers");
		System.out.print("Enter three numbers : ");
		try {
			double n1=sc.nextDouble();
			double n2=sc.nextDouble();
			double n3=sc.nextDouble();
			if( n1 >= n2 && n1 >= n3)
			{
				System.out.println(n1 + " is the largest number.");
			}
			else if (n2 >= n1 && n2 >= n3)
			{
				System.out.println(n2 + " is the largest number.");
			}
			else
			{
				System.out.println(n3 + " is the largest number.");
			}
		}
		catch(Exception e)
		{
			System.out.println("The input you have entered is not an number");
		}
	}
}
