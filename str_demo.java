import java.util.Scanner;
class String_sample
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the charector");
        String name = sc.nextLine();
        System.out.println("The length of string is "+name.length());
        if(name.compareTo("light")==0)
            System.out.println("Death note");
        else if(name.compareTo("tony")  == 0)
            System.out.println("IRON MAN");
        else if(name.compareTo("harry") == 0)
            System.out.println("HARRY POTTER");
        else
            System.out.println("Donot know the charector");
        }
    }
