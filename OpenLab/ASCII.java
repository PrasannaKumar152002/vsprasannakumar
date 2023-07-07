import java.util.*;
public class ASCII {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ASCII value of a character");
		try {
			System.out.print("Enter a character : ");
			String str=sc.next();
			if(str.length()>1)
			{
				throw new NumberFormatException();
			}
			char ch=str.charAt(0);
			System.out.printf("The ASCII value of %c is %d", ch,(int)ch);
		}
		catch(Exception e)
		{
			System.out.println("Enter a valid character");
		}
	}
}
