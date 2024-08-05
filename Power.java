package assignment7;
import java.util.Scanner;
public class Power {
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("Enter the base value(a): ");
	 double a=sc.nextDouble();
	 
	 System.out.println("Enter the exponent value(b): ");
	 double b=sc.nextDouble();
	 
	 double result = Math.pow(a,b);
	 System.out.println(a + " raised to the power of " + b + " is:" + result );
	  
	 
	 
	 
 }
}
