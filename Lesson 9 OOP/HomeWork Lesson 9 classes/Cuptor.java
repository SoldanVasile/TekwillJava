public class Cuptor {

	//Atributele: tipul (electric, gaz), capacitatea in litrir, timer (da/nu)

		String ovenType;
		byte ovenCapacity;
		boolean timerOption;

	//Metode ce definesc actiuni: Este conectat/deconectat, coace bucatele, masoara timpul prin temportizator 

		public void onOffStatus() {
			System.out.println("Cuptorul este pornit...");
		}		

		public void bake() {
			System.out.println("Cuptorul coace paine...");
		}

		public void measTime() {
			System.out.println("Cuprorul masoara timpul prin timer");
		}

}