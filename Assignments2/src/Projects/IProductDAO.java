package Projects;

import java.util.List;





public interface IProductDAO {

	Product addProduct(Product product);
	List<Product>findallProducts();

	int addProducts(List<Product>proList);
	Product findProductById(int id);

	
	

}
