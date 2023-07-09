import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n-1)%6==0)
        {
            System.out.println("The given number is a prime number");
        }
        else{
            System.out.println("The given number is not a prime number");
        }

    }
}
