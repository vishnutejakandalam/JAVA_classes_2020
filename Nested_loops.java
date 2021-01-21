class Nested
{
    public static void main(String args[])
    {
        int n  = Integer.parseInt(args[0]);
        // int interval= Integer.parseInt((args[1]))
        for(int j=1;j<=n;j++)
        {
            for(int i = 1;i<=n;i++)
            {       
                System.out.print("*");
            }        
            System.out.println();
        }
   }
}