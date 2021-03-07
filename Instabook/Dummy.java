static boolean validate()  
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username to login");
        String user = sc.nextLine();
        System.out.println("Enter password to login");
        String password = sc.nextLine();    
        for(int i=0;i<users.size();i++)
        {
            if(user.compareTo(users[i].getUsername())==0 && password.compareTo(users[i].getPassword())==0)
                return true;
            else
                return false;
        }
    }
	}
}