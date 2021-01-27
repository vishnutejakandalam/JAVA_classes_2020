import javax.swing.plaf.synth.SynthMenuBarUI;
import java.math.*;
public class arrays_example {
    public static void main(String[] args) {
        int[] ar = {90,2,3,26,-5};
        System.out.println((int)Math.pow(65, 0.5));
         System.out.println(ar[4]); // toa access an element in the array
         System.out.println(ar.length); // to get size of an array
         ar[2] = 24;
         System.out.println(ar[2]);
        for(int i=0;i<ar.length;i++)
            System.out.println("An element at position "+i+"in array is "+ar[i]);
        }
}
