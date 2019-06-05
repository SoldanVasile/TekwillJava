public class Laptop {

	//atribute: brand, diagonala monitor, tip procesor
	String brandName;
	String procesorType;
	Double displaySize;

	//metode ce definescc aciunile: status (porinit/oprit), action (calculeaza, proceseaza), emite sunete (canta muzica)

		public void status() {
			System.out.println("Laptopul este pornit");
		}

		public void action() {
			System.out.println("Laptopul calculeaza");
		}

		public void sound() {
			System.out.println("Laptopul emite un cantec");		
		}

//partea de mai jos este pentru verificare corectitudine

	public static void main(String [] args) {

		Laptop lp = new Laptop();

		lp.brandName = "HP";
		lp.procesorType = "IntelPentiun i7";
		lp.displaySize = 15.6;

			System.out.println(lp.brandName + " " + lp.procesorType + " " + lp.displaySize);

		lp.status();
		lp.action();
		lp.sound();
	}

}