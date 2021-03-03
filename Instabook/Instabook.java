import java.util.Scanner;

public class Instabook
{
    static void start()
    {
        while(true)
    {   
         System.out.println("1.Login\n2.Create Account\n3.Exit");
        int input = sc.nextInt();
        if(input == 1)
            boolean flag = validate(user,password);
        if(input == 2)
            create_account();
        if(input == 3)
            System.exit(0);
    } 
   }
    static void login()
    {

    }
    static boolean validate()
    {
        System.out.println("Enter username to login");
        String user = sc.nextLine();
        System.out.println("Enter password to login");
        String password = sc.nextLine();    
        if(user.compareTo("asdf")==0 && password.compareTo(";lkj")==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true)
    {    
     
    }
    if(login)
    {
        prompt = "1. Search\n2.Edit Profile\n3.Logout";
        System.out.println("Enter options");
        int opt = sc.nextInt();
        if(opt == 1)
            System.out.println("init search option");
        else if(opt == 2)
            System.out.println("init Edit array option");
        else if(opt == 3)
            prompt = "1.Login\n2.Create Account\n3.Exit";
        else
            System.out.println("Wrong choice");
    }
    }
    else
        System.out.println("Login failed.");
}
}