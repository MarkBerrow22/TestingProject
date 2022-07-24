package Interface;

public abstract class Restaurant {

	abstract String Restuarant();
	abstract String menu(); 
	abstract String Totalprice();
	int num=6;
	String McDonalds;
	String name=McDonalds,KFC;
	}
	
	abstract class Menu extends Restaurant{
		public void Menu() {
			System.out.println("Menu");
			
		}
	}
	 
	class KFC extends Restaurant {
		public void KFC() {
			System.out.println("KFC");
		}

		@Override
		String Restuarant() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		String menu() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		String Totalprice() {
			// TODO Auto-generated method stub
			return null;
		}
	}
	class McDonalds extends Restaurant {
		public void McDonalds() {
			System.out.println("McDonalds");
		}

		@Override
		String Restuarant() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		String menu() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		String Totalprice() {
			// TODO Auto-generated method stub
			return null;
		}
	}
	
	class Totalprice extends Restaurant {
		public void totalPrice() {
			System.out.println("Totalprice");
		}

		String Restuarant() {
			// TODO Auto-generated method stub
			return null;
		}

		String menu() {
			// TODO Auto-generated method stub
			return null;
		}

		String Totalprice() {
			// TODO Auto-generated method stub
			return null;
		}
	
	
	public static void main(String[] args) {
			
Restaurant r = null;
r.	Restuarant();
r.	menu(); 
r.	Totalprice();
	}
	
	
	
	}
	