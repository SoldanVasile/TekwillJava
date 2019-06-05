public class CoffeeMachine {

	//Atributele: tipul (cu rasnita, cu capsule, pentru cafea macinata), presiune aburi (im Pascali), capucinator (da/nu)

		String coffeeMachType;
		byte steamPressure;
		boolean cappuccinoMaker;

	//Metode ce definesc actiuni: macina cafeaua, incalzeste apa pentru vapori, sufla aburii, dozeaza cafeaua, curata zatul de cafea  

		public void grindCoffee() {
			System.out.println("Macina boabele de cafea");
		}		

		public void heatWater() {
			System.out.println("Infierbanta apa");
		}

		public void blowSteam () {
			System.out.println("Sufla aburii cu presiunea X bari");
		}

}