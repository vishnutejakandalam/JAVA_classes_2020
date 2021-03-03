class Sum
{
    int a,b,c,d;
    Sum(int a,int b)
    {
        this.a = a;
        this.b = b;
    }
    Sum(int a, int b,int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    Sum(int a,int b,int c,int d)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    int sum()
    {
        System.out.println("parameter sum");
        return a+b+c+d;
    }
}