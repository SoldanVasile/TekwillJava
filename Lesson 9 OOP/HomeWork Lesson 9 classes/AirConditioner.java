public class AirConditioner {

	//Atributele: tipul (clasic, inverter), afisare regim termic pe display, are funtia de filtrare aer (da/nu), umezeste si dezinfecteaza aerul

		String type;
		byte tempShow;
		boolean airFiltrMode;

	//Metode ce definesc actiuni: raceste aerul, dezinfecteaza si umezeste aerul din incapere, afiseaza temperatura 

		public void coolingAir() {
			System.out.println("Raceste");
		}		

		public void showTemp() {
			System.out.println("Afiseaza tempratura");
		}

		public void cleanAir() {
			System.out.println("Curata prin dezinfectare aerul din incapere");
		}

}