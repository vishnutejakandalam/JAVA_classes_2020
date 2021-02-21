package mypack;

class Shape
{
    int sides;
    String name;
    Shape(String n)
    {
        name = n;
        sides = 0;
    }
    void getSides()
    {
        System.out.println("It has "+sides+" sides");
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



