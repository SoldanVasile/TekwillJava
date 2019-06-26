import java.util.Scanner;

public class Catalog {

	Scanner scan = new Scanner(System.in);

	String[] studentArr; 

	//metoda pentru definirea lungimii si adaugarea elementelor sirului prin ciclul for loop

		public void addArrFor(){
			
			System.out.println("Introduceti lungimea sirului si apasati tasta Enter");
			int ls = scan.nextInt();
			studentArr = new String [ls];
			
			for (int i=0; i<studentArr.length; i++){

				System.out.println("Introduceti elementul nr. " + i + " al sirului si apasati tasta Enter");
				String element = scan.next();
				studentArr[i] = new String(element);
				
			}
		}

	//metoda pentru definirea lungimii si adaugarea elementelor sirului prin ciclul while
		public void addArrWhile(){
			
			System.out.println("Introduceti lungimea sirului si apasati tasta Enter");
			int ls = scan.nextInt();
			studentArr = new String [ls];
			int i = 0;
			while (i<studentArr.length){

				System.out.println("Introduceti elementul nr. " + i + " al sirului si apasati tasta Enter");
				String element = scan.next();
				studentArr[i] = new String(element);
				i++;
			}
		}

	//metoda pentru definirea lungimii si adaugarea elementelor sirului prin ciclul do while
		public void addArrDoWhile(){
			
			System.out.println("Introduceti lungimea sirului si apasati tasta Enter");
			int ls = scan.nextInt();
			studentArr = new String [ls];
			int i = 0;
			do {

				System.out.println("Introduceti elementul nr. " + i + " al sirului si apasati tasta Enter");
				String element = scan.next();
				studentArr[i] = new String(element);
				i++;
			} while (i<studentArr.length);
		}		
	
	//metoda pentru afisarea elementelor sirului
		public void printArr() {
		
			for (String el: studentArr) {	

				System.out.print( el + " " );

			}
	    }

	//apelarea la metodele de mai sus pentru verificare
	public static void main(String[] args) {

	Catalog newArr = new Catalog();

	System.out.println(" ");

	System.out.println("Apelarea la metoda de umplere a sirului prin ciclul for loop");
	newArr.addArrFor();
	newArr.printArr();


	System.out.println(" ");
	System.out.println("Apelarea la metoda de umplere a sirului prin ciclul wile");
	newArr.addArrWhile();
	newArr.printArr();

	System.out.println(" ");
	System.out.println("Apelarea la metoda de umplere a sirului prin ciclul do wile");
	newArr.addArrDoWhile();
	newArr.printArr();

	}

}