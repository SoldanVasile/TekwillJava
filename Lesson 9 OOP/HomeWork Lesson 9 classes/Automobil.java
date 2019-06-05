public class Automobil {

	//Atributele: Brndul/Modelul, numarul de locuri, tipul de tractiune 

		String brandName;
		String nomberOfPlaces;
		String tractionType;

	//Metode ce definesc actiuni: transporta pasagerii/incarcatura, este cu motorul pornit/oprit, trece peste obstacole 

		public void transportRegime() {
			System.out.println("Automobilul transporta pasageri");
		}		

		public void onEngine() {
			System.out.println("porneste Motorul");
		}

		public void connectOffRoadMode() {
			System.out.println("Conecteaza modul offroad pentru a depasi obstacole");
		}

}