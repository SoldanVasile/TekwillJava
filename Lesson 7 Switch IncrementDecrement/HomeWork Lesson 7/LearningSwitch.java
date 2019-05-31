public class LearningSwitch {

	public static void main(String [] args) {

//sarcina 1.1

	char literaAlfabetLatin = 'I';

		//vocalele alfabetului latin: A, E, I, O, U

		switch(literaAlfabetLatin) {
	
			case 'A' :
			case 'E' :
			case 'I' :
			case 'O' :
			case 'U' :

				System.out.println("Litera " + literaAlfabetLatin + " este o vocala");

		break;

		default:
				System.out.println("Litera " + literaAlfabetLatin + " este o consoana");

		} 

//sarcina 1.2

	byte nota = 10;

		switch(nota) {

		case 6:
		case 7:
			System.out.println("Satisfacator");
		break;

		case 8:
		case 9:
			System.out.println("Bine");
		break;

		case 10:
			System.out.println("Formidabil");
		break;
		
		default:
			System.out.println("Insuficient");
				
		}

	}




}