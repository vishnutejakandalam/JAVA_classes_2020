class Static_demo {
    static int a;
    static void display()
    {
        System.out.println("This is a static block..");
    }
}

class Main
{
    public static void main(String[] args) {
        Static_demo.a = 20;
        System.out.println("the value is "+Static_demo.a);
        Static_demo.display();
    }
}

