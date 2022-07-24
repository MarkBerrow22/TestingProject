package Projects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;







public class ProductDAO {

	public static void main(String[] args) {

		public class ProductDAO implements IProductDAO{
		List<Product> proList=new ArrayList<>();  //Interface ref variable can hold all its implmentation classes' objects
		
			@Override
			public Product addProduct(Product product) {
			Connection connection= DBUtil1.getDBConnection();
			try {
			//step3: create PreparedStatement object which is used to send SQL queries to the database
			PreparedStatement preparedStatement = connection.prepareStatement("Insert into product(pro_quantity,pro_name,pro_price)value(?,?,?,?)");
			Product product1;
			preparedStatement.setInt(1, product1.getQuantity());//setting the data into PreparedStatement
			preparedStatement.setString(2, product1.getName());
			preparedStatement.setDouble(3, product1.getPrice());
			//step4:execute the query
			preparedStatement.executeUpdate();
			
			//step5: close the connection
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return product;
				return null;
			}

			@Override
			public List<Product> findallProducts() {
				Connection connection = DBUtil1.getDBConnection();
				List<Product> proList=new LinkedList<>();  //Interface ref variable can hold all its implmentation classes' objects
				try {
					//step3: create Statement object which is used to send SQL queries to the database
					Statement statement= connection.createStatement();
					
					//step4: execute the query
					//select query--executeQuery()
					//non--select --executeUpdate()
					ResultSet resultSet = statement.executeQuery("select emp_id,emp_name, salary, dept_id from employee");
					while (resultSet.next()) {
					Product product=new Product(resultSet.getInt("pro_quantity"), resultSet.getString("pro_name"), resultSet.getDouble("pro_price");
						proList.add(product);
					}
					
					//step5: close the connection
					connection.close();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return proList;
			
			}

			@Override
			public int addProducts(List<Product> proList) {
				int noOfRecUpdated=0;
				try {
					Connection connection=DBUtil1.getDBConnection();
					//step3: create PreparedStatement object which is used to send SQL queries to the database
					PreparedStatement preparedStatement = connection.prepareStatement("Insert into product(pro_quantity,pro_name,price,)value(?,?,?,?)");
					for(Product product : proList) {
						preparedStatement.setInt(1, product.getQuantity());//setting the data into PreparedStatement
						preparedStatement.setString(2, product.getName());
						preparedStatement.setDouble(3, product.getPrice());
						
						
					}
					
					//step4:execute the query
					 noOfRecUpdated += preparedStatement.executeUpdate();//A+=B ==> A=A+B
					
					//step5: close the connection
					connection.close();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		return noOfRecUpdated;
			}

			@Override
			public Product findProductById(int id) {
			Connection connection= DBUtil1.getDBConnection();
			Product product=null;
				return null;
				try {
					//step3: create Statement object which is used to send SQL queries to the database
					Statement statement= connection.createStatement();
					//step4: execute the query
					//select query--executeQuery()
					//non--select --executeUpdate()
					ResultSet resultSet = statement.executeQuery("select pro_quantity,pro_name, price, from price where pro_quantity='"+id+"'");
					if (resultSet.next()) {
						product=new Product(resultSet.getInt("pro_quantity"), resultSet.getString("pro_name"), resultSet.getFloat("price"), id);
					}else {
						System.out.println("Record was not found in the system");
					}
					
					//step5: close the connection
					connection.close();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	return product;
	
				
			

			
}

		}
	}
}
				
	


