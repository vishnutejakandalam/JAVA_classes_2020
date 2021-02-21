package mypack; 
import java.util.Scanner;
public class Scanit
{
    Scanner sc;
    public Scanit()
    {
        sc = new Scanner(System.in);
    }
    public int scanInt(String msg)
    {
        System.out.println(msg);
        return sc.nextInt();
    }
    public float scanFloat(String msg)
    {
        System.out.println(msg);
        return sc.nextFloat();
    }
}