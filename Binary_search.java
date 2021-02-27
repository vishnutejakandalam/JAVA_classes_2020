import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Binary
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList ar = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
            ar.add(sc.nextInt());
        Collections.sort(ar);
        System.out.println("Enter key to search ");
        int key = sc.nextInt();
        int low = 0;
        int high = n-1;
        int flag = 0;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if((Integer) ar.get(mid) == key)
                {
                    flag = 1;
                    break;
                }
            if((Integer) ar.get(mid) <key)
            {
                low = mid+1;
            }
            else if((Integer) ar.get(mid)>key)
            {
                high = mid-1;
            }
        }
    if(flag == 1)
        System.out.println("Element found");
    else
        System.out.println("Not found");
    }
}