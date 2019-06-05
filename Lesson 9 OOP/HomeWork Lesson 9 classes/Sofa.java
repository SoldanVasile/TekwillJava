public class Sofa {

	//Atributele: tipul (dreapta, de colt), materialul de acoperire (textil. piele ecologica, poliuretan, piele naturala), optiunea de extindere (da/nu)
		String sophaType;
		String coversFeatures;
		boolean extension;

	//Metode ce definesc actiuni: relaxeaza si sustine corpul uman, este extinsa/stansa, se adapteaza ergonomic 

		public void realx() {
			System.out.println("Sofa relaxeaza corpul uman");
		}		

		public void extention() {
			System.out.println("Sofa este extinsa");
		}

		public void ergoMode() {
			System.out.println("Sofa este in mod ergonomci");
		}

}