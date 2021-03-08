import java.util.ArrayList;

interface Person
{
    final int LIFE = 100;
    void eat();
    void sleep();
    void think();
}

abstract class Student  {
    String name;
    int age;
    abstract void study();   //need to override this abstract method
}


class Cstudent extends Student implements Person{
    String college_name;
    String branch;
    int semister;
    public void eat()
    {
        System.out.println("eating ");
    }
    public void sleep()
    {
        System.out.println("sleeping ");
    }
    public void think()
    {
        System.out.println("thinking ");
    }
    void lab()
    {
        System.out.println("going to Lab");
    }
    void study()
    {
        System.out.println("going to colllege");
    }
}

class Sstudent extends Student{
    String school_name;
    int std;
    int marks;
    void play()
    {
        System.out.println("going to play");
    }
    void study()
    {
        System.out.println("Go to school");
    }
}

class Main 
{
    public static void main(String[] args) {
        // ArrayList stdlist = new ArrayList<Student>();
        Cstudent cs = new Cstudent();
        cs.eat();
        cs.sleep();
        cs.think();
    }
}