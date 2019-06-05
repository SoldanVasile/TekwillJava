public class Biblioteca {

//Atributele: capacitate de stocare (numar de carti), tip material (metal, lemn, PVC), numarul de polite, dimensiunile

		short storageCapacity;
		String material;
		byte shelves;

	//Metode ce definesc actiuni: pastreaza carti, suporta greutati, este deschisa, ofera posibilitatea de aerisire a cartilor  

		public void storage() {
			System.out.println("Biblioteca pastreaza X carti");
		}		

		public void accesOpenClosed() {
			System.out.println("Accesul este permis");
		}

		public void airFlow() {
			System.out.println("Aereseste cartile");
		}

}