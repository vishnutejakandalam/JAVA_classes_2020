class Base
{
    Base()
    {
        System.out.println("Base class constructor");
    }
}

class Derived extends Base
{

}

class Con_demo
 {
    public static void main(String[] args) {
        // Base b = new Base();
        Derived d = new Derived();
    }
}
