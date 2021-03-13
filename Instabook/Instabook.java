import java.util.Scanner;

public class Instabook
{
   
    static void main_page(User_manage um)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("1.Login\n2.Create Account\n3. Exit");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    if(um.validate())
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
                                main_page(um);
                        }
                    }
                    else
                        System.out.println("Bad Login");
                    break;
                case 2:
                    um.create_user();
                    main_page(um);
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
        User_manage um = new User_manage();
        main_page(um);
      }
}
