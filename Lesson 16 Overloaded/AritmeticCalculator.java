public class AritmeticCalculator {

		//metode de adunare a doua numere de tip int, double, float si long

		public int summ(int a, int b) {
			System.out.println(a + b);
			return a + b;
		}

		public double summ(double a, double b) {
			System.out.println(a + b);
			return a + b;
		}

		public float summ(float a, float b) {
			System.out.println(a + b);
			return a + b;
		}

		public long summ(long a, long b) {
			System.out.println(a + b);
			return a + b;
		}

		//metode de scadere a doua numere de tip int, double, float si long

		public int dif(int a, int b) {
			System.out.println(a - b);
			return a - b;
		}

		public double dif(double a, double b) {
			System.out.println(a - b);
			return a - b;
		}

		public float dif(float a, float b) {
			System.out.println(a - b);
			return a - b;
		}

		public long dif(long a, long b) {
			System.out.println(a - b);
			return a - b;
		}


		//metode de impartire a doua numere de tip int, double, float si long

		public int imparte(int a, int b) {
			System.out.println(a / b);
			return a / b;
		}

		public double imparte(double a, double b) {
			System.out.println(a / b);
			return a / b;
		}

		public float imparte(float a, float b) {
			System.out.println(a / b);
			return a / b;
		}

		public long imparte(long a, long b) {
			System.out.println(a / b);
			return a / b;
		}

		//metode de extragere a X procente (%) dintr-un nr de tip int, byte, double

		public double procent(double x, int b) {
			System.out.println(b - (x * 0.01 * b));
			return b - (x * 0.01 * b);
		}

		public double procent(double x, byte b) {
			System.out.println(b - (x * 0.01 * b));
			return b - (x * 0.01 * b);
		}
		
		public double procent(double x, double b) {
			System.out.println(b - (x * 0.01 * b));
			return b - (x * 0.01 * b);
		}

//partea de mai jos este pentru testarea metodelor
	public static void main (String [] args) {

		AritmeticCalculator rez = new AritmeticCalculator();

		//apelarea la metodele de adunre summ
		System.out.println("Mai jos avem rezultatele sumei a doua numere de tip int, double, float si long: ");
		rez.summ(6, 3); 

		rez.summ(2.5, 3.35); 
		
		rez.summ(3.5f, 2.5f);

		rez.summ(2522521521552536663335.2525, 302025221112002522122112.3525255); 

		//apelarea la metodele de scadere dif
		System.out.println("Mai jos avem rezultatele diferentei a doua numere de tip int, double, float si long: ");
		rez.dif(6, 3); 

		rez.dif(2.5, 3.35); 
		
		rez.dif(3.5f, 2.5f);

		rez.dif(2522521521552536663335.2525, 302025221112002522122112.3525255); 

		//apelarea la metodele de impartire imparte
		System.out.println("Mai jos avem rezultatele impartirii a doua numere de tip int, double, float si long: ");
		rez.imparte(6, 3); 

		rez.imparte(2.5, 3.35); 
		
		rez.imparte(3.5f, 2.5f);

		rez.imparte(2522521521552536663335.2525, 302025221112002522122112.3525255); 


		//apelarea la metodele de impartire imparte
		System.out.println("Mai jos avem rezultatele extragerii a X procente din numar de tip int, byte si double: ");
		rez.procent(22.5, 100); 
		rez.procent(22.5, 127);
		rez.procent(22.5, 127.25);	 
	}

}