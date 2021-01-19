class Factorial
{
    public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);
        int a = n;
        int facto = 1;
        int factd = 1;
        // for(int i = n; i>=1;i--)
        // {
        //     facto = facto*i;
        // }
        // initialisation
        // test condition
        System.out.println("While loop..");
        while(n==1)
        {
            System.out.println("n is "+n);
            facto=facto*n;
            // updation 
            n--;   //1
        }
        System.out.println("Do while loop.....");
        do{
            System.out.println("n is "+a);
            factd = factd*a;
            a--;
        }while(a==1);


        
        System.out.println("the Factorial is "+facto+" "+factd);
    }
}