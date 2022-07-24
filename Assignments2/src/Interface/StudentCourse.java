package Interface;
import java.util.Scanner;
//Assignment 17:  Design an Application called Student Course Management
//create interface called StudentCourse
//add an abstract method called addCourse
//add an abstract method called viewCourse
//add an abstract method called addFee() (Fee Range is 1000 to 3000)
//If the course fee is more than 1500 then students will get 10 percent Disc. otherwise no Disc.
//Note: Make sure that all methods should throws exception
//And this interface must be implemented by two COURSE classes.
public interface StudentCourse {

	public static final Class student = null; 
	void addCourse();
	void viewCourse();
	void addFee();//Fee Range is 1000 to 3000
	abstract void checkDiscount();
}


abstract class addCourseException extends RuntimeException {
public void addCourse() {
System.out.println("The course you are taking this semester is Algebra");
}
	}
abstract class viewCourseException extends RuntimeException {
public void viewCourse() {
System.out.println("The course will be taught in blackboard");	
	}
	
abstract class addFeeException extends RuntimeException {
public void addFee() {
System.out.println("The book store will have a 10% discount going on today");
	}
	

public static void main(String[] args)  {
		
		System.out.println("Enter your discount code");
		Scanner scanner = new Scanner(System.in);
		CheckDiscount(scanner.nextInt());
		scanner.close();
		System.out.println("Fee range is between 1000 to 3000");
		addCourse();
		viewCourse();
		addFee();
}

	protected static void CheckDiscount(int nextInt) {
		// TODO Auto-generated method stub
		
	}

	//initialize the variables for if statement
	int number = 1500;
	if(number>1500);
	System.out.println("If the course fee is greather than 1500 you'll receive 10% off");
	throw new addCourseException();	
	}else if(number<1500){
	System.out.println("If the course is less than 1500 you won't receive 10% off");
	throw new viewCourseException();
	}else {
	System.out.println("Otherwise there won't be no discount");
	throw new addFeeException();
	
	}
	
	}
}
}