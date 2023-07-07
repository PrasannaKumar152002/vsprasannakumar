
import java.util.Scanner;
public class OddorEven {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ODDorEVEN");
		System.out.print("Enter a number : ");
		try {
			double n=sc.nextDouble();
	         if(n%2==0)
	         {
	        	 System.out.println("The given number is an even number");
	         }
	         else {
	        	 System.out.println("The given number is an odd number");
	         }
		}
		catch(Exception e)
		{
			System.out.println("The input you have entered is not an number");
		}
	}
}
