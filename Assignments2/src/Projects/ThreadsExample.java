package Projects;

import java.util.Random;

import Projects.ThreadOne.ThreadTwo;

//Assignment 19:  A multi-thread application that has three threads. 
//First thread generates a random integer every 1 second and if the value is even, 
//the second thread computes the square of the number and prints. 
//If the value is odd, the third thread will print the value of the cube of the number.

class ThreadOne extends Thread {
@Override
	public void run() {
System.out.println("Generate a random number");		}


class ThreadTwo implements Runnable {
	public int x;
	public ThreadTwo()
	{
	this.x=x;
	}

	@Override
	public void run() {
System.out.println("Second thread prints square numbers"+x*x);
	}

class ThreadThird implements Runnable {
	public int x;
	public ThreadThird (int x) { 	
	}
	@Override
	public void run() {
	this.x=x;

}
 {
System.out.println("Third thread generates cube number"+x*x*x);
 
	}
	
class first extends Thread {

		public void run() {
		
			int num = 0;
		Random r=new Random();
		try
		{
			for(int i=0; i<6; i++)
			{
		num=r.nextInt(200);
		System.out.println("First number to generate is" +num);
		Thread t2=new Thread (new  Thread());
		t2.start();
		Thread t3=new Thread (new Thread ());
		t3.start();
		Thread.sleep(2000);
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		}
}
public class ThreadsExample {


	public static void main(String[] args) {

ThreadOne t1=new ThreadOne();		

t1.start();
		System.out.println("Main Thread generated");
	
	

	}
}
public void start() {
	// TODO Auto-generated method stub
	
}
}

public void start() {
	// TODO Auto-generated method stub
	
}
}
}

	


	



