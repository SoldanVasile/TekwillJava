public class Printer {

	//Atributele: tipul corp (clasic, MFU), optiuni de copiere/scanare, capacitatea de foi

		String printType;
		short capacityOfPaper;
		boolean scanMode;

	//Metode ce definesc actiuni: imprima, scaneaza, afiseaza contor de foi imprimate 

		public void print() {
			System.out.println("Printerul imprima");
		}		

		public void scan() {
			System.out.println("Printerul scaneaza");
		}

		public void showCounter() {
			System.out.println("Afiseasa contorul");
		}

}