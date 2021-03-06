class Child 
{
    String name;
    float height;
    int age;
    void eat(String food)
    {
        System.out.println("Child eats "+food);
    }
    void play()
    {
        System.out.println("Child is playing");
    }
}

class Student extends Child {
    int std;
    int marks;
    String school_name;
    int rollno;
    void study()
    {
        System.out.println("Student studies");
    }
}

class Main 
{
    public static void main(String[] args) {
        Student obj = new Student();
        obj.std = 10;
        obj.marks = 100;
        obj.rollno = 20;
        System.out.println(obj.rollno);
        Student xyz = obj;
        System.out.println(xyz.rollno);
        obj.rollno = 30;
        System.out.println("After changing obj rollno "+xyz.rollno);
    }
}