package Projects;
import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {		
		
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("Enter first number");
		
		double num1 = Scanner.nextDouble();
		System.out.println("Enter the second number");
		
		double num2 = Scanner.nextDouble();
		double result = 0;
		System.out.println("Enter the result :"+result);
		
		char operator = Scanner.next().charAt(0);
		
		Scanner.close();
		
		switch(operator) {
		case '+': 
		result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" +result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println(num1 + "-" + num2 + "=" +result);
			break;
		case '*':
		result = num1 * num2;	
		System.out.println(num1 + "*" + num2 + "=" +result);
			break;
		case '/':
		result = num1 / num2;	
		System.out.println(num1+ "/" + num2 + "=" +result);
			break;
			default:
		System.out.println("The number you enter is invalid");
		
			break;
			
		}

	}
	
	}


