import java.util.ArrayList;

class Student  {
    String name;
    int age;
    void study()
    {
        System.out.println("Student studies");
    }
}

class Cstudent extends Student{
    String college_name;
    String branch;
    int semister;
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
        ArrayList stdlist = new ArrayList<Student>();
        Student std = new Sstudent();
        Cstudent cstd = new Cstudent();
        std.study();   // school student
        std = cstd;
        std.study();    // college student
    }
}