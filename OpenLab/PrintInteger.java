import java.util.*;
public class PrintInteger {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Printing an Integer");
		System.out.print("Enter a Integer : ");
		try {
			int n=sc.nextInt();
			System.out.println("The given Integer is "+n);
		}
		catch(Exception e)
		{
			System.out.println("The input you have entered is not an Integer");
		}
	}
}
