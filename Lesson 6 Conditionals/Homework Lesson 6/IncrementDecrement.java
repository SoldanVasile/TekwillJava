public class IncrementDecrement {

	public static void main(String [] args) {

	int a = 43; 

	// varianta 1 a = 1, b = -2, c = 20, d = 10; 
	// varianta 2 a = 1, b = 6, c = 2, d = 43. 

	System.out.println("Raspunsul crect este: " + ((a++) +  (a)  + (a--)  + (a--)  + (--a)  + (a++)  - (--a)  + (a++)  - (a--)  + (a)  - (--a)  + (a++)  + (++a))); 
	
	}

}