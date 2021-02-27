public class Main {
    public static void main(String[] args) {
        Student ravi = new Student("Ravi",101);
        Student ramesh = new Student("Ramesh",102);
        ravi.wakeup();
        ravi.play();
        ramesh.wakeup();
        ramesh.play();
        System.out.println("Roll number of "+ravi.name+" is "+ravi.rollno);
        System.out.println("Roll number of "+ramesh.name+" is "+ramesh.rollno);
    }
}
