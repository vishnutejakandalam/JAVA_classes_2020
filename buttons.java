class Button{
    String name;
    String symbol;
    String long_press_link;
    boolean status;
    Button()
    {
        System.out.println("This is called when an object is created");
    }
    Button(String n, String s,String lpl,boolean st)   //parameterised constructor
    {
        name = n;
        symbol = s;
        long_press_link = lpl;
        status = st;
    }
    void ontap()
    {
        if(status)
            System.out.println("Turning off button"+name);
        else
            System.out.println("Turning on button..."+name);
    }
    void long_tap(){
        System.out.println("Going to "+long_press_link);
    }
}

class Button_main
{
    public static void main(String[] args) {
        Button Wifi = new Button("Wifi button","wifi symbol","Settings/connecctions/wifi",false);
            Wifi.ontap();
            Wifi.status = true;
            Wifi.ontap();    
            Wifi.long_tap();
        System.out.println("Creating bluetooth button...");
        Button bluetooth = new Button("Bluetooth button","bluetooth symbol","Settings/connections/bluetooth",false);
        bluetooth.ontap();
        bluetooth.status = true;
        bluetooth.ontap();    
        bluetooth.long_tap();

        
    }
}

