import java.util.Scanner;

public class Add2num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter number n: ");
        int n = scan.nextInt();
        int[] array = new int[n];
        System.out.println("Enter "+n+" numbers:");
        for(int i=0;i<array.length;i++)
        {
            System.out.println("Enter "+(i+1)+"th number");
            array[i] = scan.nextInt();
        }
        System.out.println("The numbers are ");
        for(int i=0;i<array.length;i++)
            System.out.println(array[i]);
        // int a = scan.nextInt();
        // System.out.println("Enter second number");
        // int b = scan.nextInt();
        // System.out.println("The sum of two numbers is "+(a+b));
    }
}
