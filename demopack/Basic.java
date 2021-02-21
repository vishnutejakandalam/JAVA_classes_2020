class Basic {
    private int coins;
    void update_coins()
    {
        coins = coins + 1;
        System.out.println("Coins updated to "+coins);
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
        obj.coins = 20;
        obj.update_coins();
        obj.display();
        Extended obj1 = new Extended();
        // obj1.coins = 310;
        obj1.show();
    }
}
