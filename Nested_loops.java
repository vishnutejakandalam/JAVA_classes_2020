class Nested
{
    public static void main(String args[])
    {
        int n  = Integer.parseInt(args[0]);  // n= 5
        // int interval= Integer.parseInt((args[1]))

        for(int i=1;i<=n;i++)   // i = 6, 
        {
            for(int j = 1;j<=n;j++)   // j = 5
            {       
                // if(j == 13)
                //     continue;
                System.out.print(" "+j);  
                if(i==j)
                    break;
            }        
            System.out.println();
        }
   }
}
