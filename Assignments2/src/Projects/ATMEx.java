package Projects;
import java.util.Scanner;
//Assignment 15: Design a an application called ATM PIN Validator which will read the account holder name 
//and pin no if pin no is incorrect while trying in 3 
//timesPinMisMatchException object  will throw an exception called 
//Sorry..Your Account Has been Locked
public class ATMEx {

	class accountholderException extends RuntimeException{
	public accountholderException() {
		System.out.println("This is the customer account holder..");
	}
	}
	class pinnumException extends RuntimeException {
	public pinnumException () {
		System.out.println("This is your pin number");
	}
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter your pin number");
		Scanner scanner = new Scanner(System.in);
		checkPin(scanner.nextInt());
		scanner.close();
		System.out.println("If you mess up your pin your acc will be locked");

	}

	private static void checkPin(int nextInt) {
		// TODO Auto-generated method stub
	}
		
	int number = 3;
	if(number>5) {
	System.out.println("Enter your pin in the machine");
	throw new accountholderException(); 
	}else if(number<3){
		System.out.println("You have three attempts or else your acc will be locked!");
	throw new pinnumException();
	}else {
	System.out.println("Your acc has been LOCKED!!");
	
	}
	}
}



	