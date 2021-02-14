import java.util.ArrayList;
import java.util.Collections;
class Array_sample {
    static void selection_sort(int[] ar)
    {
        ArrayList result = new ArrayList<Integer>();
        int index = 0;
        for(int m = 0;m<ar.length;m++)
        {
            int min = ar[0];
            for(int i=0;i<ar.length;i++)
            {
                if(ar[i]<=min)    
                {
                    min = ar[i];
                    index = i;
                }      
            }
            ar[index] = Integer.MAX_VALUE;
            result.add(min);
        }
        System.out.println(" ");
        for(int i=0;i<result.size();i++)
            System.out.print(" "+result.get(i));
    }
    public static void main(String[] args) {
        int[] ar = {5,3,7,4,9,6,1};        
        int length = ar.length;
        for(int i=0;i<length-1;i++)
        {
            for(int j=0;j<length-1;j++)
            {
                if(ar[j] > ar[j+1])
                {
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
        for(int i=0;i<length;i++)
            System.out.println(ar[i]);
    }
}
