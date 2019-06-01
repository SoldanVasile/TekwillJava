public class First40MultiplyOf8 {

	public static void main(String[] args) {

System.out.println("Primii 40 multipli ai cifrei 8 prin metoda while");

		int num = 0;		

		while (num++ <40) {

			System.out.println(num + " " + num*8);


		}			


System.out.println("Primii 40 multipli ai cifrei 8 prin metoda do while");

		num = 0;
		
		do {
			num ++;
			System.out.println(num + " " + num*8);

		} while (num <40);

System.out.println("Primii 40 multipli ai cifrei 8 prin metoda for");

		for (num=1; num<=40; num++) {

			System.out.println(num + " " + num*8);
		
		}
			

	}

}