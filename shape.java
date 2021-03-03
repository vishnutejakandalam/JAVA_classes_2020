import java.util.Scanner;

class Shape_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        Square s1 = new Square(4,"first square",length);
        s1.area();
        s1.perimeter();
        s1.flip();
        s1.rotate();
        Circle c1 = new Circle("first circle",5);
        c1.area();
        c1.perimeter();
    }
}


class Shape
{
    int sides;
    String name;
    Shape()
    {
        System.out.println("Default constructor");
    }
    Shape(String n)
    {
        name = n;
        sides = 0;
    }
    Shape(int sides,String name)    //parameterised constructor
    {
        this.sides = sides;
        this.name = name;
    }
    void rotate()
    {
        System.out.println("Rotating the shape "+name+" 90 degrees");
    }
    void flip()
    {
        System.out.println("Flipping the shape "+name);
    }
}

// class cube extends Square
// {
//     int breadth, width;

// }

class Square extends Shape
{
    int length;
    Square(int s, String n,int l)
    {
        super(s,n);
        this.length = l;
    }
    void area()
    {
        System.out.println("The area of square is "+(length*length));
    }
    void perimeter()
    {
        System.out.println("The perimeter of the square is "+(4*length));
    }
    void rotate(){
        System.out.println("Square doesn't change on rotating.");
    }
}

class Circle extends Shape{
    int radius;
    Circle(String n,int radius)
    {
        super(n);
        this.radius = radius;
    }
    void area()
    {
        System.out.println("The area of circle is "+(3.14*radius*radius));
    }
    void perimeter()
    {
        System.out.println("The circumference of the circle is "+(2*3.14*radius));
    }
    void rotate(){
        System.out.println("Circle doesn't change on rotating.");
    }

}



