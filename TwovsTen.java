class TwovsTen
{
    public static void main(String[] args) {
            int x = Integer.parseInt(args[0]);
            if(x%10==0)
                System.out.println(0);
            else if(x%5==0)
                System.out.println(1);
            else
                System.out.println(-1);
        }
}