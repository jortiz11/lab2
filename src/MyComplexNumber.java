//sum and multiplication of complex numbers
import java.util.Scanner;

public class MyComplexNumber {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		 
	    int value1,
	        value2,
	        value3,
	        value4,
	        sum1,
	        sum2,
	        mul1,
	        mul2;
	       
	 
	    
	    System.out.print("Enter the real part of the first number : ");
	    value1 = keyboard.nextInt();
	    System.out.print("Enter the imaginary part of the first number : ");
	    value2 = keyboard.nextInt();
	    System.out.print("Enter the real part of the second number : ");
	    value3 = keyboard.nextInt();
	    System.out.print("Enter the imaginary part of the second number : ");
	    value4 = keyboard.nextInt();
	   
	    sum1 = value1 + value3;
	    sum2 = value2 + value4;
	    
	    mul1 =value1*value3-value2*value4;
	    mul2 =value1*value4+value2*value3;
	    
	    System.out.println("The sum is:" +sum1+"+"+sum2+"i");
	    System.out.println("The multiplication is:" +mul1+"+"+mul2+"i");
	    
	    keyboard.close(); 
		

	}

}
