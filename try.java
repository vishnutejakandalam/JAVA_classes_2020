//https://www.youtube.com/results?search_query=vir+das+freedom+of+spee  ch

import java.util.Scanner;
class Try_it
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try
        {
        //    int[] array = new int[10];
        //    System.out.println(array[15]);
            System.out.println("THe division is "+(a/b));
            //Arthemetic Exception
        }
        catch(Exception e)
        {
            System.out.println("arthemetic exception");
        }
    }
}