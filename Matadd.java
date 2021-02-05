import java.util.Scanner;

public class Matadd
{

    public static void main(String[] args) {
        int n; // size of square matrix
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimension  ");
        n = sc.nextInt();
        int[][] array = {
            {1,2,3},{4,5,6},{7,8,9}
        } 
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] C = new int[n][n];
        System.out.println("ENter first matrix: ");
        for(int i = 0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter "+i+"th in "+j+"th element:");
                A[i][j] = sc.nextInt();            
            }
        }
        System.out.println("ENter Second matrix: ");
        for(int i = 0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter "+i+"th in "+j+"th element:");
                B[i][j] = sc.nextInt();            
            }
        }
        System.out.println("ENter first matrix: ");
        for(int i = 0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                C[i][j] = A[i][j]+B[i][j];
            }
        }

        System.out.println("the matrix is:");
        for(int i = 0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(" "+C[i][j]);        
            }
        }
         
        

    }
}
