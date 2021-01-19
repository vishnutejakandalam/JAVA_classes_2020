class evenoddfull
{
    public static void manum_start(Strnum_startg[] args)
    {
        int n=Integer.parsenum_startt(args[0]);
        int num_start=0;
        if(n%2==0)
         num_start = 0;
         else
         num_start = 1;
         for(int i=num_start;i<=n;i+=2)  // O(n/2)
         System.out.prnum_startt(" "+i);
    }
}
