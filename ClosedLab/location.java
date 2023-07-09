import java.util.Arrays;
import java.util.Scanner;

public class location {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the element to be searched : ");
        int s=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==s)
            {
                System.out.println("The element is in the "+i+" index");
            }
        }
    }
}
