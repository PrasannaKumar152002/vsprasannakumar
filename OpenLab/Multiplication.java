
import java.util.Scanner;
public class Multiplication {
	static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Multiplication of two numbers");
        try{
        	System.out.print("Enter two numbers : ");
             sum();
        }
        catch(NumberFormatException e)
        {
            System.out.println("Enter a valid number ");
            sum();
        }
    }
    static void sum()
    {
    	double n1=sc.nextDouble();
        double n2=sc.nextDouble();
        System.out.printf("The Product is %.2f",n1*n2);
    }
}
