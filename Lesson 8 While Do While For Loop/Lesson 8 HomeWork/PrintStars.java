public class PrintStars {

	public static void main(String [] args) {

//imprimare stelute in cinci randuri, de la una pana la cinci pe fiecare rand

		stea: 
		for (int i=0; i<5; i++) {

			for(int k=0; k<5; k++) {

				if (k>i) {

					System.out.println();
					continue stea;

				}

				System.out.print ("*");
			}


		}

		System.out.println();

	}


}