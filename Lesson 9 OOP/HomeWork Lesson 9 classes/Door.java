public class Door {

//Atributele: directia de deschidere (spre interior, spre exterior), tip material (metal, lemn, PVC), are sau nu izolare fonica (da/nu), umezeste si dezinfecteaza aerul

		String openDir;
		String typeOfMaterial;
		boolean soundProofing;

	//Metode ce definesc actiuni: inchis/deschis, incuiat/descuiat, protejeaza incapaerea  

		public void openClosedStatus() {
			System.out.println("Usa este deschisa");
		}		

		public void lockedUnlockedStatut() {
			System.out.println("Usa este descuiata");
		}

		public void protectTheRoom() {
			System.out.println("Protejeaza incaperea");
		}

}