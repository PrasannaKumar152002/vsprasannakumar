package lab4;

public class StringHandling {
	public void Hand() {
		String str=new String("Hello");
		String st="World";
		System.out.println("Length of the String "+str+" : "+str.length());
		System.out.println("Concatination of two String \""+str+"\" and \""+st+"\" : "+str.concat(st));
		System.out.println("Substring of \"SingAgain\" : "+"SingAgain".substring(4));
		String s="GangMember";
		System.out.println("Check whether the substring Member is in the string "+s+"or not");
		if(s.contains("Member"))
		{
			System.out.println("Member is a substring of "+s);
		}
		else {
			System.out.println("Member is not a substring of"+s);
		}
		System.out.println("When we replace gang in the string "+s+" to band then the string becomes : "+s.replace("Gang", "Band"));
		System.out.println("compare using equals method");
		if(str.equals("Hello"))
		{
			System.out.println("The string \""+str+"\" and \"Hello\" are equal");
		}
		else {
			System.out.println("The string \""+str+"\" and \"Hello\" are not equal");
		}
		System.out.println("compare using compareto method");
		if(str.compareTo("Hello")==0)
		{
			System.out.println("The string \""+str+"\" and \"Hello\" are equal");
		}
		else {
			System.out.println("The string \""+str+"\" and \"Hello\" are not equal");
		}
	}
}
