import mypack.Scanit;

public class Scan_demo {
    public static void main(String[] args) {
        Scanit sc = new Scanit();
        int a = sc.scanInt("Enter a number to scan from scanint");
        System.out.println("The value scanned is "+a);
        float c = sc.scanFloat("enter a floating value");
        System.out.println("the scanned float is "+c);
    }
}
