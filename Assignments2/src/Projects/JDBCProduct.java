package Projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class JDBCProduct {

	public static void main(String[] args) {
			//call dao		

		List<Product> proList=new ArrayList();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the number of Products to add:");
		int numEmployes=scanner.nextInt();
		
		for (int i=0; i < numProducts; i++) {
			System.out.println("Enter Product Quantity: ");
			int proquantity=scanner.nextInt();
			
			System.out.println("Enter Product Name: ");
			String proname=scanner.next();
			
			System.out.println("Enter Product Price ");
			double proprice=scanner.nextDouble();
			
			
			
		Product pro=new Product(int quantity, String name, double price);
		}
		scanner.close();
		
		IProductDAO proDAO= new ProductDAO();
		int addproducts=proDAO.addproducts(proList);//giving list products object to the DAO method	
		System.out.println("It has been Added successfully");
	
	
		//Search logic
				System.out.println("Enter Employee ID: ");
				Scanner scanner1=new Scanner(System.in);
				proDAO.findProductById(scanner1.nextInt());
				scanner1.close();
				Object product;
				if(product!=null) {
				System.out.println(product.getQuantity+"\t"+product.getName+"\t"+product.Price());	
				}else {
					System.out.println("Not Found");
				}
	
	
	}

}
