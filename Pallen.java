import java.util.Scanner;
class Palen
{
    static int palendrome(int n)
    {
        int temp  = n;
        int rev = 0;
        while(temp > 0)   //12
        {
            int last = temp % 10;  
            rev = (rev *10) + last;
            temp = temp / 10;
        }       
        //checks weither a number is palendrome or not
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int number = palendrome(n);
        if(number == n)
            System.out.println("it is pallendrome");
        else
            System.out.println("It is not pallen");   
        
        System.out.println("Enter another number ");
        int a = sc.nextInt();
        System.out.println(palendrome(a));
    }
}