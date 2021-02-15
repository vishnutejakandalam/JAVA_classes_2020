 import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class Array_list{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of numbers");
        int n = sc.nextInt();
        ArrayList ar = new ArrayList<Integer>(n);
        for(int i = 0;i<n;i++)
            ar.add(sc.nextInt());
        System.out.println("The array you entered is ");
        for(int i =0;i<ar.size();i++)
            System.out.println(ar.get(i));        
        Collections.sort(ar);
        System.out.println("The array you sorted is ");
        for(int i =0;i<ar.size();i++)
            System.out.println(ar.get(i));        
    }
}