import java.util.*;
public class Main{
    public void addition(int[][] a,int[][] b)
    {
        int i,j;
        for(i=0;i<3;i++)
        {
            System.out.print("[ ");
            for(j=0;j<3;j++)
            {
                System.out.print((a[i][j]+b[i][j])+" ");
            }
            System.out.println("]");
        }

    }
    public void subtraction(int[][] a,int[][] b)
    {
       int i,j;
        for(i=0;i<3;i++)
        {
            System.out.print("[ ");
            for(j=0;j<3;j++)
            {
                System.out.print((a[i][j]-b[i][j])+" ");
            }
            System.out.println("]");
        }

    }
    public void multiplication(int[][] a,int[][] b)
    {
        int i,j;
        int sum=0;
        for(i=0;i<3;i++)
        {
            System.out.print("[ ");
            for(j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                   sum+=(a[i][k]*b[k][j]);
                }
                System.out.print(sum+" ");
                sum=0;
            }
            System.out.println("]");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Main ob = new Main();
        int i, j,ch;
        int [][] a = new int[3][3];
        int [][] b = new int[3][3];
        System.out.println("Enter the values of a");
        for (i = 0; i < 3; i++) {
            System.out.print("[ ");
            for (j = 0; j < 3; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the values of b");
        for (i = 0; i < 3; i++) {
            System.out.print("[ ");
            for (j = 0; j < 3; j++) {
                b[i][j]=sc.nextInt();
            }
        }
        while(true) {
            System.out.println("|--------MENU--------|");
            System.out.println("| 1.Addition         |");
            System.out.println("| 2.Subtraction      |");
            System.out.println("| 3.Multiplication   |");
            System.out.println("| 4.Exit             |");
            System.out.println("|--------------------|");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    ob.addition(a, b);
                    break;
                case 2:
                    ob.subtraction(a, b);
                    break;
                case 3:
                    ob.multiplication(a, b);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Wrong choice glupy");
                    break;
            }
        }
    }
}