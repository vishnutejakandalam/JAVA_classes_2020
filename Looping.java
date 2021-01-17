
class Looping
{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);    //10
        // int sum = 0;
        do
        {
            System.out.println("Inside do while loop....");
        }while(n==19);
        int sum = (n*(n+1))/2;   //O(1)
        // while(i<=n) //condition..   
        // {O(n)
        //     sum+=i;   
        //     i++;    //updation..
        // }
        System.out.println("The sum is "+sum);
        // for(int i=1;i<=n;i+=2) 
        //     System.out.println("Repeat this n times..."+i);
    }
}