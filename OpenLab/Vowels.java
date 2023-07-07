import java.util.*;
public class Vowels {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Vowels or Not");
		try {
			System.out.print("Enter a character : ");
			String str=sc.next();
			if(str.length()>1 || (str.charAt(0)-'0'>=0&&str.charAt(0)-'0'<=9))
			{
				throw new NumberFormatException();
			}
			char ch=str.charAt(0);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )  {System.out.println(ch + " is vowel");}
			else {System.out.println(ch + " is consonant");}
		}
		catch(Exception e)
		{
			System.out.println("Enter a valid character");
		}
		
	}
}
