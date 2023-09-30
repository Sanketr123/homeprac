//import java.io.*;
import java.util.Scanner;

public class pracrice {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter first num");
		int a = obj.nextInt();
		
		System.out.println("Enter  operator");
		
		char operator = obj.next().charAt(0);
		
		System.out.println("Enter second num");
		int b= obj.nextInt();
		
		int z;

		
		switch(operator) {
		
		case '+':
			z=a+b;
			System.out.println("Result: " + z);
			break;	
		case '-':
			z=a-b; 
			System.out.println("Result: " + z);
			break;	
		case '*':
			z=a*b;
			System.out.println("Result: " + z);
			break;	
		case '/':
			if (b!= 0) {
				
				z=a/b;
				System.out.println("Result: " + z);
			}
			else {
				System.out.println("Invalid number");
			}
			
			break;	
			
		default:
			System.out.println("invalid operator");
		
		}
		
		obj.close();

	}

}
