public class WashingMachine {

	//Atributele: tipul (automata, semiautomata, cu setare manuala), scurgere rufe (numar de rotatii pe minut), uscare rufe cu aer (da/nu)

		String washMachType;
		short drainRot;
		boolean dryMode;

	//Metode ce definesc actiuni: spala rufele, scurge rufele, cantareste rufele, pompeaza apa, usuca rufele 

		public void actionStat() {
			System.out.println("Spala rufele");
		}		

		public void weighsMode() {
			System.out.println("Cantareste rufele");
		}

		public void drainsMode() {
			System.out.println("Scurge rufele la un numar n de rotatii pe minut");
		}

}