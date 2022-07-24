package Interface;
import java.util.Scanner;
//Assignment 13.a:  Create an abstract class named Shape that contains two integers and an
//empty method named printArea(). Provide three classes named Rectangle, Triangle, and Circle 
//such that each one of the classes extends the class Shape. 
//Each one of the classes contains only the method printArea() that prints the area of the given shape.
public abstract class Shape {
abstract void printArea1();
abstract void totalArea();{
}
class Rectangle extends Shape {

@Override
void printArea1() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of the rectangle");
	double length=sc.nextDouble();
	System.out.println("Enter the width of the rectangle in centimeters");
	double width=sc.nextDouble();
	System.out.println("Total area of rectangle is:"+(length*width)+"cm");		
	}

	@Override
	void totalArea() {
		// TODO Auto-generated method stub
		
	}
	
	
	

	}

	void printArea() {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length of the rectangle");
double length=sc.nextDouble();
System.out.println("Enter the width of the rectangle in centimeters");
double width=sc.nextDouble();
System.out.println("Total area of rectangle is:"+(length*width)+"cm");
	}

	
	class Triangle extends Shape{
	
	
	@Override
	void printArea1() {//area of Triangle = 1/2*height*base
Scanner sc = new Scanner(System.in);
System.out.println("Enter height of triangle in centimeters:");
double height = sc.nextDouble();
System.out.println("Enter length of triangle base in centimeters:");
double base = sc.nextDouble();
System.out.println("Total area of triangle is:"+(height*base/2)+"cm");	
		
		
	}

	@Override
	void totalArea() {
		// TODO Auto-generated method stub
		
	}

}

 class Circle extends Shape{
	@Override
	void printArea1() {//area of circle = Math.PI*radius*radius
	 {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter radius of circle in centimeters:");
	double radius = sc.nextDouble();
	System.out.println("Total area of triangle is:"+(Math.PI*radius*radius)+"cm");
	sc.close();

		
	}

	
		
	}
	
	class MaxShape{
	
public static void main(String[] args) {
	
	Rectangle rc = new Rectangle();
	Triangle tr = new Triangle();
	Circle cr = new Circle();
	rc.printArea1();
	tr.printArea1();
	cr.printArea1();
	
}
	}

	@Override
	void totalArea() {
		// TODO Auto-generated method stub
		
	}
	}
}


	


