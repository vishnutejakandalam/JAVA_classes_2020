class Student extends Child {
    int rollno;           //properties or variables
    int marks;
    static int std = 6;
    Student(String name, int rollno) //constructor
    {
        this.name = name;
        this.rollno = rollno;
    }
    void wakeup()       //methods
    {
        System.out.println(name+" woke up");
    }
    void play()            //methods
    {
        System.out.println(name+" is playing");
    }
    static 
    {
        System.out.println("This is a direct static block");
    }
}
