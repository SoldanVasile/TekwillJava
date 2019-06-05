public class Telephone {

	//Atributele: tipul (fix, radio), dispozitiv culegere numar (disc, butoane, tuch), raza de actiune 

		String phoneType;
		String devicePicking;
		short actionRadius;

	//Metode ce definesc actiuni: Suna/Apelaza/sta in asteptare, este conectat/deconectat, arata ora/ data 

		public void activityStatus() {
			System.out.println("Telefonul este in asteptare");
		}		

		public void onOffStatus() {
			System.out.println("Telefonul este deconectat");
		}

		public void showTime() {
			System.out.println("Telefonul arata ora");
		}

}