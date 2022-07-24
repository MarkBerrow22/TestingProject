package Interface;
import java.util.Random;
import java.util.random.*;

public interface Bank {

	public static final double rateofinterest=12.99;
	abstract String createccount(int accountnumber, double amount); 
	abstract String creditamount(int accountnumber, double amount);
	abstract String debitamount(int accountnumber, double amount);
	abstract String transferamount(int fromaccnum,int toaccnum,double amount);
	abstract String ministatement(int accountnumber,double amount);
	}








	class CapitalOneBank implements Bank{
		public CapitalOneBank() {
			System.out.println("CapitalOne Bank");
		}
		
		@Override
		public String createccount(int accountnumber, double amount) {
			Random random=new Random();
			int accNum=random.nextInt(1000);
			System.out.println("CapitalOne Bank");
			return null;
		}

		@Override
		public String creditamount(int accountnumber, double amount) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String debitamount(int accountnumber, double amount) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String transferamount(int fromaccnum, int toaccnum, double amount) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String ministatement(int accountnumber, double amount) {
			// TODO Auto-generated method stub
			return null;
		}
	


	
	


	
	}
	










