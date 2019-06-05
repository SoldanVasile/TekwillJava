public class Chemineu {

	//Atributele: format (dreprtunghiular, patrat, in colt), tip combustibil (lemne, carbune, gaz, energie electrica), puterea termica
		String format;
		String source;
		short power;

	//Metode ce definesc actiuni: Incalzeste, lumineaza, scoate sunete 

		public void heat() {
			System.out.println("Chemineul incalzeste");
		}		

		public void light() {
			System.out.println("Chemineul lumineaza");
		}

		public void sound() {
			System.out.println("Chemineul scoate sunete ");
		}

}