import java.util.Scanner;
import java.util.ArrayList;

public class User_manage {
    ArrayList users;
    User_manage()
    {
        users = new ArrayList<User>();
    }
    boolean validate()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username to login");
        String user = sc.nextLine();
        System.out.println("Enter password to login");
        String password = sc.nextLine();    
        if(users.isEmpty())
            return false;
        for(int i=0;i<users.size();i++)
        {
            User c_user = (User) users.get(i);
            if(user.compareTo(c_user.getUser_name())==0 && password.compareTo(c_user.getPassword())==0)
                return true;
        }
        return false;
    }
    void create_user()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("Enter username");
        String uname = sc.next();
        System.out.println("Enter Bio");
        String bio = sc.next();
        System.out.println("Enter DOB");
        String dob = sc.next();
        System.out.println("Enter email");
        String email = sc.next();
        System.out.println("Enter password");
        String password = sc.next();
        System.out.println("Enter password again!");
        while(password.compareTo(sc.next()) != 0)     
        {
            System.out.println("they don't match, enter again");
        }
        User u = new User(name, uname, dob, bio, password, email);
        users.add(u);
    }
}
