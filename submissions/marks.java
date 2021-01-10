  class Marks
 {
     public static void main(String args[]) {
         int number = Integer.parseInt(args[0]);
         System.out.println("you given marks is "+number);
        // if(number%2 ==0)
         //System.out.println(number+" is a even num");    
         //else
         //System.out.println(number+" is a odd num"); 
         if (number > 100)
         System.out.println("we calculating the marks 0 to 100 you given num is more then 100 its an error");
         else if(number >= 90)
         System.out.println("o grade");
         else if(number >= 70)
         System.out.println("A grade");
         else if (number >= 50)
         System.out.println("B grade");
         else if(number >= 25)
         System.out.println("C grade");
         else if (number >= 0)
         System.out.println(" failed  better luck next tym");
         else
         System.out.println("we calculating the marks 0 to 100 you given num is less then 0 its an error");
     }
 }      