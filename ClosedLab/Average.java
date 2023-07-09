import java.util.Scanner;

public class Average {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(avg(arr));
    }
    static int avg(int []arr)
    {
        int sum=0;
        for(int n:arr)
        {
            sum+=n;
        }
        return sum/ arr.length;
    }
}
