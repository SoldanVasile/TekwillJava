public class MicroWaveOven {

	//Atributele: tipul (simplu cu microunde, cu grill, incorporabil), capacitate de incarcare (in litri), functia de autocuratire (da/nu)

		String type;
		byte loadCapacity;
		boolean selfCleaning;

	//Metode ce definesc actiuni: incalzeste mancare, coace la grill carne, dezgheata produsele congelate, se curata automat   

		public void defrostFood () {
			System.out.println("Macina boabele de cafea");
		}		

		public void heatFood () {
			System.out.println("Infierbanta mancarea");
		}

		public void cleaning () {
			System.out.println("Curata suprafata interioara");
		}

}