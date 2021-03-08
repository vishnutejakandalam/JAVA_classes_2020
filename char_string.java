import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ar = new char[s.length()];
        for(int i=0;i<ar.length;i++)
            ar[i] = s.charAt(i);
        for (char c:ar) 
             System.out.print((char)(97-(int)c+122));
     }
}
