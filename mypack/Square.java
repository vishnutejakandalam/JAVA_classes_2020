package mypack;

public class Square extends Shape
{
    int length;
    public Square(int s, String n,int l)
    {
        super(s,n);
        this.length = l;
    }
    public void area()
    {
        System.out.println("The area of square is "+(length*length));
    }
    public void perimeter()
    {
        System.out.println("The perimeter of the square is "+(4*length));
    }
    void rotate(){
        System.out.println("Square doesn't change on rotating.");
    }
}
