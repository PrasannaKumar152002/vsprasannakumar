package lab4;

public class ExceptionHandling {
	public void test(int e)
	{
		try {
			if(e==0)
			{
			int a=1/0;
			}
			else {
			int[] a1=new int[1];
			a1[0]=2;
			a1[2]=3;
			}
		}
		catch(ArithmeticException e1)
		{
			System.out.println("No number can be divisible by zero");
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Array size exceeds");
		}
	}
}
