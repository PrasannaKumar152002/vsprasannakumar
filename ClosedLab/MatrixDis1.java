import java.util.Arrays;
import java.util.Scanner;

public class MatrixDis1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Rows :");
        int r=sc.nextInt();
        System.out.print("column :");
        int c=sc.nextInt();
        int [][]arr=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(Math.abs(arr[i][j])<10)
                {
                    System.out.print(arr[i][j]+"   ");
                }
                else {
                    System.out.print(arr[i][j] + "  ");
                }
            }
            System.out.println();
        }

    }
}
