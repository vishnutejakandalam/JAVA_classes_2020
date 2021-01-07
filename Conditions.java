class Conditions
{
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);      // assignment operator.
        System.out.println("the given marks are "+number);
        if(number%2 == 0)      //relational operator..
            System.out.println(number+" is even number");
        else
            System.out.println(number+" is odd number");
        // 100-70 = 'a'
        // 40-70 = 'b'
        // 25-40 = 'c'
        //  <25 = 'f'
        if (number > 70)
                System.out.println("A grade");
         else if(number >40)
            System.out.println("B grade");
        else if (number > 25)
            System.out.println("C grade");
        else
            System.out.println("Very Sorry, You Fail. Life doesn't stop here.");   
        System.out.println("Program terminated with error code 000");
        }
}