public class LearningWhile {

	public static void main(String [] args) {


System.out.println("Sarcina 2 afisarea primelor 100 de numere");
	
	int num = 0, highLimit = 100;

		while (num++ < highLimit) {

			System.out.println(num);
					
		}


System.out.println("Sarcina 2.1 afisarea numerelor pare de la 1 la 50");

	 	num = 0; 
		highLimit = 50;

		while (++num < highLimit && ++num % 2 ==0) {
			
			System.out.println(num);
			
		}

System.out.println("Sarcina 2.2 afisarea numerelor impare de la 51 la 100");

		num = 49;
		highLimit = 100;

		while (++num < highLimit && ++num % 2 !=0 ) {

			System.out.println(num);
			 
		}	


	}



}