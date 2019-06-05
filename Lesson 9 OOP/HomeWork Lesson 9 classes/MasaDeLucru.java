public class MasaDeLucru {

	//Atributele: forma (dreprtunghiulara, patrata, rotunda, ovala, in colt), prezenta sertare (da/nu), culoarea 

		String forma;
		String sertare;
		String color;

	//Metode ce definesc actiuni: Este moibila (pe roti sau se roteste), sustine greutati mari/mici, depoziteaza rechizite de birou

		public void mobility() {
			System.out.println("Masa este fixa");
		}		

		public void support() {
			System.out.println("Masa sustine greutati mari");
		}

		public void depo() {
			System.out.println("Masa are loc de depozitare rechizite de birou");
		}

}