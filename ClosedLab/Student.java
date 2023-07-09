import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    public static void main(String[] args)
    {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of Students :");
        int r=sc.nextInt();
        System.out.print("Enter the number of Subjects :");
        int c=sc.nextInt();
        int [][]arr=new int[r][c];
        List<Integer> total=new ArrayList<>();
        for(int i=0;i<r;i++)
        {
            System.out.println("Enter student "+(i+1)+" mark");
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
                sum+=arr[i][j];
            }
            total.add(sum);
            sum=0;
        }
        int j=1;
        for (int i:total) {
            System.out.println("Total mark of student"+j+" is "+i);
            j++;
        }

    }
}
