package Projects;
import java.util.Scanner;

public class Bank {

	int amount = 0;
	int getBalance;
	String name;
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		  Bank b = new Bank();
		  	System.out.println("Beginning amount");
	        System.out.println("amount = " +b.getBalance());

	        BankA ba = new BankA();

	        System.out.println("amount = " +ba.getBalance());	        

	        BankB bb = new BankB();

	        System.out.println("amount = " +bb.getBalance());  

	        BankC bc = new BankC();

	        System.out.println("amount = " +bc.getBalance());
	        System.out.println("This is your total amount");
	    }

	    int getBalance(){

	    return 0;

	    }

	}



	class BankA extends Bank{

	    int getBalance(){

	    int deposit = 1000;

	    amount = amount + deposit; 

	    return amount;

	    }

	}



	class BankB extends Bank{

	    int getBalance(){

	    int deposit = 1500;

	    amount = amount + deposit; 

	    return amount;

	    }

	}



	class BankC extends Bank{    

	    int getBalance(){

	    int deposit = 2000;

	    amount = amount + deposit; 

	    return amount;
}
	
	}
