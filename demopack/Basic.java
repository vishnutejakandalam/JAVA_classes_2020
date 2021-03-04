package demopack;
class Basic {
    private int coins;
    void update_coins()
    {
        coins = coins + 1;
        display();
    }
    void display()
    {
        System.out.println("THe value is "+coins);
    }
}
class Extended extends Basic{
    void show()
    {
        // System.out.println("THe value is "+coins);
    }
}
class Basic_main
{
    public static void main(String[] args) {
        Basic obj = new Basic();
        obj.update_coins();
        obj.display();
        // obj1.coins = 310;
    }
}
