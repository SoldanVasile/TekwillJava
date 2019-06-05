		public class TvDevice {

	//Atributele: tipul ecranului (tub, LCD, plasma, LED), modalitatea de control (manual, telecomanda, smart), diagonala ecran

		String displayType;
		String controlMethod;
		short displaySize;

	//Metode ce definesc actiuni: Este conectat/deconectat, proiecteaza imagini de pe alte dispozitive, porneste alarma 

		public void status() {
			System.out.println("TV este conectat");
		}		

		public void smartConection() {
			System.out.println("TV proiecteaza imagini de pe laptop");
		}

		public void alarmOn() {
			System.out.println("TV a pornit alarma");
		}

}