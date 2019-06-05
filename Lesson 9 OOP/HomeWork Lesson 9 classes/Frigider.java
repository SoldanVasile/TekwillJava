public class Frigider {

	//Atributele: tipul corp (clasic, bi-cameral), afisare regim termic pe display, are funtia de inghetare rapida (da/nu)

		String bodyType;
		byte tempShow;
		boolean turboFrostMode;

	//Metode ce definesc actiuni: raceste produsele, dezinfecteaza suprafetele, afiseaza temperatura 

		public void cooling() {
			System.out.println("Frigiderul raceste");
		}		

		public void showTemp() {
			System.out.println("Afiseaza tempratura");
		}

		public void clean() {
			System.out.println("Curata prin dezinfectare suprafetele");
		}

}