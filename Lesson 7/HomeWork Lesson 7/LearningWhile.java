public class LearningWhile {

	public static void main(String [] args) {

//sarcina 2 afisarea primelor 100 de numere
	
	int num = 1, highLimit = 100;

		while (num <= highLimit) {

			System.out.println(num);
			num++;
		
		}


//sarcina 2.1 afisarea numerelor pare de la 1 la 50

	int numPar = 1, highLimit50 = 50;

		while (numPar <= highLimit50) {
			if (numPar % 2 ==0) {
			System.out.println(numPar);
			numPar++;
			
			} else {
			
			numPar++;
			
			}		
			
		}

//sarcina 2.2 afisarea numerelor impare de la 51 la 100

	int numImPar = 50, highLimit100 = 100;

		while (numImPar <= highLimit100) {

			if (numImPar % 2 !=0) {
			System.out.println(numImPar);
			numImPar++;
			
			} else {
			
			numImPar++;
			
			}
		
		}	

	}



}