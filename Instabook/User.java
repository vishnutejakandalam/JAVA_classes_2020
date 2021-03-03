public class User {
    private String name;
    private String user_name;
    private String password;
    private String dob;
    private String bio;
    void editProfile(String key, String value)
    {
        if(key.compareTo("name") == 0)
            this.name = value;
        if(key.compareTo("dob") == 0)
            this.dob = value;
        if(key.compareTo("bio") == 0)
            this.bio = value;
        if(key.compareTo("user_name") == 0)
            this.user_name = value;
    }
    User(String name, String user_name,String dob, String bio,String password)
    {
        this.name = name;
        this.user_name = user_name;
        this.dob = dob;
        this.bio = bio;
        this.password = password;
    }
    String getName()
    {
        return name;
    }
    String getDob()
    {
        return dob;
    }
    String getUser_name()
    {
        return user_name;
    }
    String getBio()
    {
        return bio;
    }
    
}
