package Projects;

import java.util.ArrayList;
import java.util.List;
//Assignment 18:  (e-commerce application)  Seller: Add  Products (id,name and price) bean  into HashSet. 
//Customer: If any products ordered by customer, compare with the data stored and display the total price along with the details of product. 
//(Use  DAO, bean and client classes)
public class SellerDAO implements ISellerDAO {
List<Seller> selList=new ArrayList<>();//interface reference variable can hold all of its implentation classes of objects
	@Override
	public Seller addSeller(Seller seller) {// adding seller object to ArrayList object
		selList.add(seller);
		return seller;
	}

	@Override
	public Seller findSellerId(int id) {
		Seller sel=new Seller(id, null, id);
		for (Seller seller : selList) {//check the method
		if(seller.getId()==id)	 {
			sel=seller;
		}
		break;
		}
		return sel;
	}

	@Override
	public List<Seller> findAllSeller() {
		// TODO Auto-generated method stub
		return selList;
	}

}
