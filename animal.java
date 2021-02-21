import java.util.Scanner;
class Animal
{
    String name;
    int legs;
    Animal(String n)
    {
        name = n;
    }
    void type()
    {
        System.out.println("Enter the type of Animal");
    }
}
class herbivorus extends Animal
{
    String subtype;
    herbivorus(String n,String subtype)
    {
        super(n);
        this.subtype = subtype;
    }
    void grass()
    {
        System.out.println("Some of grass eating animals are "+subtype);
    }
}


class Animal_main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        herbivorus h =new herbivorus("first animal",name);
        h.grass();
    }
}