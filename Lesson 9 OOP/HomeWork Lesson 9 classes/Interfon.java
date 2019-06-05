public class Interfon {

	//Atributele: tipul (clasic, video), control deschidere usa la distanta (da/nu), regim autonom de functionare (ore)

		String type;
		short timeAutonom;
		boolean remoteControl;

	//Metode ce definesc actiuni: transmite sunet/imagine/semnal, afiseaza statut baterie, contorizeaza numarul de actionari 

		public void openDoor() {
			System.out.println("Deschide usa");
		}		

		public void showBatteryStat() {
			System.out.println("Afiseaza statutul bateriei");
		}

		public void showCounter() {
			System.out.println("Afiseaza numarul de actionari");
		}

}