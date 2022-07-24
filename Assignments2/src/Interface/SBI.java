package Interface;

public interface SBI extends Bank {

	@Override
	default String createccount(int accountnumber, double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default String creditamount(int accountnumber, double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default String debitamount(int accountnumber, double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default String transferamount(int fromaccnum, int toaccnum, double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default String ministatement(int accountnumber, double amount) {
		// TODO Auto-generated method stub
		return null;
	}





}
