package assignment1;
import java.util.Scanner;

public class Arithmetic1 {	   
public static void main(String[] args) {
			int a,b;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter value of a is:"); 
			a = sc.nextInt();
			System.out.println("Enter value of b is:");	
	        b = sc.nextInt();	        
	        int sum= a+b;
	        System.out.println("Addition of Two Numbers is:" +sum);
	        int sub= a-b;
	        System.out.println("subtraction of Two Numbers is:" +sub);
	        int mul= a*b;
	        System.out.println("Multiplication of Two Numbers is:" +mul);
	        int div= a/b;
	        System.out.println("Division of Two Numbers is:" +div);
	        int modulo= a%b;
	        System.out.println("Module of Two Numbers is:" +modulo);
}

}