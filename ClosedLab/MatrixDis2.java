import java.util.Scanner;

public class MatrixDis2 {
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
        int i=0,j=0;
        for(int t=0;t<r+c;t++)
        {
            for(int k=0;k<=t;k++) {
                if (Math.abs(arr[i][j]) < 10) {
                    System.out.print(arr[i][j] + "   ");
                } else {
                    System.out.print(arr[i][j] + "  ");
                }
                j++;
                if(j==c)
                {
                    i++;
                    j=0;
                }
                if(i==r)
                {
                    System.exit(0);
                }
            }
            System.out.println();
        }

    }
}
