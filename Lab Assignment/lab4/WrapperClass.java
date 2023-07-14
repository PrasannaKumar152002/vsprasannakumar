package lab4;

public class WrapperClass {
	int i=10;
	float f=2.56f;
	short s=45;
	byte b=12;
	char c=34;
	long l=53576;
	String str="Hello";
	
	//Wrapper Object
	Integer n1=new Integer(345);
	Float f2=new Float(55.65);
	Short sh=new Short((short) 6);
	Byte b2=new Byte((byte) 21);
	Character ct=new Character('G');
	Long lt=new Long(87645);
	String str1=new String("Done");
	
	//AutoBoxing
	Integer n=i;
	Float F=f;
	Short S=s;
	Byte b1=b;
	Character ch=c;
	Long lg= l;
	
	
	public void m1() {
		//UnBoxing
		i=n;
		f=F;
		s=S;
		b=b1;
		c=ch;
		l=lg;
		System.out.println("AutoBoxing");
		System.out.println("Integer   : "+n);
		System.out.println("Float 	  : "+F);
		System.out.println("Short 	  : "+S);
		System.out.println("Byte 	  : "+b1);
		System.out.println("Character : "+ch);
		System.out.println("Long 	  : "+lg);
		System.out.println();
		System.out.println("UnBoxing");
		System.out.println("int       : "+i);
		System.out.println("float 	  : "+f);
		System.out.println("short 	  : "+s);
		System.out.println("byte 	  : "+b);
		System.out.println("char 	  : "+c);
		System.out.println("long 	  : "+l);

	}

}
