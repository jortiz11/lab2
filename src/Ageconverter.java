//convert age in months to years and months
import java.util.Scanner;
public class Ageconverter {public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);
 
    int totalmonths,
        years,
        months;
      
   
    System.out.print("Enter age in months : ");
    totalmonths = keyboard.nextInt();
    
    years = totalmonths/12;
    months = totalmonths % 12;
    
    
    System.out.println("Your age in years and months is " +years+  " years and " +months+ " months" );
    
    keyboard.close();
 }

}
