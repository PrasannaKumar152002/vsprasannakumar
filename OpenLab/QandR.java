
import java.util.Scanner;
public class QandR {
	static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Dividing of two numbers");
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
        System.out.printf("The Quotient is %.2f and the remainder is %d",n1/n2,(int)(n1%n2));
    }
}
