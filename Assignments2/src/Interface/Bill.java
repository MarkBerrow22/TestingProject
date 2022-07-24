/**
 * 
 */
package Interface;

/**
 * @author MarkB
 *
 */
public interface Bill {

	String Bill(int units, double calcBill);
	String Print(double amount);
	String PowerBill(int units, double calcBill);
	String WaterBill(int units, double calcBill);
	}

abstract class Electricity implements Bill {

	@Override
	public String Bill(int units, double calcBill) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public abstract String Print(double amount);

	@Override
	public String PowerBill(int units, double calcBill) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String WaterBill(int units, double calcBill) {
		// TODO Auto-generated method stub
		return null;
	}
}