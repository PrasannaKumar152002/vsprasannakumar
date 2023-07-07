import java.util.*;
public class TypeCasting {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("TypeCasting from Integer to float");
		System.out.print("Enter an Integer : ");
		try {
			int n=sc.nextInt();
			float f=n;
			System.out.println("The float value is "+f);
		}
		catch(Exception e)
		{
			System.out.println("Enter a valid Integer");
		}
	}
}
