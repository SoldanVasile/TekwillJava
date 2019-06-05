public class Clock {

	//Atributele: tipul (analogic, electronic, mecanic), functii adaugatoare (termometru, hidrometru, barometru), alarma

		String clockType;
		String additionalOption;
		boolean alarmOnOff;

	//Metode ce definesc actiuni: masoara timpul, afiseaza timpul/ temeperatura/presiunea atmosferica/umiditarea aerului, suna alarma

		public void showTime() {
			System.out.println("Ceasul arata ora ... ");
		}		

		public void alarmOn() {
			System.out.println("Suna alarma / desteptatorul");
		}

		public void showTemperature() {
			System.out.println("Ceasul afiseaza temperaura aerului ... ");
		}

}