package Instabook;

import java.util.Scanner;

public class Instabook
{
    static boolean validate()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username to login");
        String user = sc.nextLine();
        System.out.println("Enter password to login");
        String password = sc.nextLine();    
        if(user.compareTo("asdf")==0 && password.compareTo(";lkj")==0)
            return true;
        else
            return false;
    }
    static void main_page()
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("1.Login\n2.Create Account\n3. Exit");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    if(validate())
                    {
                        System.out.println("1.Search\n2.Edit Profile\n3.Logout");
                        int ch1 = sc.nextInt();
                        switch(ch1)
                        {
                            case 1:
                                //xyz
                                System.out.println("Hello ");
                                break;
                            case 2:
                                //abc
                                System.out.println("Hello ");
                                break;
                            case 3:
                                main_page();
                        }
                    }
                    else
                        System.out.println("Bad Login");
                    break;
                case 2:
                    String nmae = sc.next();
                    String password = sc.next();
                    main_page();
                    break;
                    // save to object 
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");    
        }
        }
}
    public static void main(String[] args) {
        main_page();
      }
}
