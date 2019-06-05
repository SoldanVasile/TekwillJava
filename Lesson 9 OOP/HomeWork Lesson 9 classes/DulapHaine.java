public class DulapHaine {

//Atributele: capacitate de stocare (numar de haine dupa categorii: Camasi, rochii, pantaloni, lengerie de corp), tip (incorporat, modular, extern), numarul de usi/sertare, dimesunile

		short storageCapacity;
		String typeOfInstalation;
		byte doors;

	//Metode ce definesc actiuni: depozirteaza imbracamintea, are posibilitatea de iluminare/ventilare, ofera posibilitatea de aerisire a cartilor  

		public void storage() {
			System.out.println("Dulapul depoziteaza X camasi");
		}		

		public void light() {
			System.out.println("Lumina este pornita");
		}

		public void ventilation() {
			System.out.println("Ventilarea este pornita");
		}

}