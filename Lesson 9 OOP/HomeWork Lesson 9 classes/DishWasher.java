public class DishWasher {

	//Atributele: tipul (incorporata, exterioara, verticala, orizontala), capacitate de incarcare (numar de piese), uscare rapida cu aer fierbinte (da/nu)

		String positionType;
		short capacity;
		boolean dryHotAirMode;

	//Metode ce definesc actiuni: spala vesela, clateste, pompeaza apa, usuca vesela spalata cu aer cald 

		public void actionStat() {
			System.out.println("Spala vesela");
		}		

		public void rinseMode() {
			System.out.println("Clateste vesela");
		}

		public void dryHotAir () {
			System.out.println("Usuca vesela cu aer cald");
		}

}