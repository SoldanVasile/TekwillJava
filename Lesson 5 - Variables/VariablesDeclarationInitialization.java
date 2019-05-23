
// crearea unui fisier java cu declararea si initializarea variabilelor de diferite tipuri

public class VariablesDeclarationInitialization {

	public static void main(String[] args) {

		//declararea si initializarea variabilelor de tip boolean care poate avea doar doua valori: true sau false
		//am luat ipotetic operatia de logarea securizata pe o pagina web oarecare 

		boolean ipAddresDefinned, paswordInserted, corectAnswerSecurityQuestion, loggedIn, loadContent; 
		
		ipAddresDefinned = true;
		paswordInserted = true;
		corectAnswerSecurityQuestion = true;
		loggedIn = false;
		loadContent = false;


		//declararea si initializarea variabilelor de tip short cu intervalul de la -32768 pana la 32767
		//am luat drept model, declararea numarului de localitati in Republica Moldova si dotarea lor cu elemente sociale
	
		short noOfVillages, noOfSchools, noOfMedicalInstitutions, noOfKindergartens, noOfShops;

		noOfVillages = 3000;
		noOfSchools = 1500;
		noOfMedicalInstitutions = 1400;
		noOfKindergartens = 1000;
		noOfShops = 12000;

		
		//declararea si initializarea variabilelor de tip byte cu intervalul de la -128 pana la 127
		//am luat drept model, declararea temperaturii medii anuale in Republica Moldova in grade Celsius, cu indicarea semnuli pozitiv sau negativ 
		
		byte tMedieAnuala, tMinVara, tMaxVara, tMinIarna, tMaxIarna;

		tMedieAnuala = +12;
		tMinVara = +14;
		tMaxVara = +42;
		tMinIarna = -42;
		tMaxIarna = +8;


		//declararea si initializarea variabilelor de tip int cu intervalul de la -2 147 483 648 pana la 2 147 483 647
		//am luat drept model, declararea numarului de locuitori ai unui stat si structura acestora pe varste, sexe

		int nrLocuitori, nrBarbati, nrFemei, nrCopii, nrVarstnici;

		nrLocuitori = 80580450;
		nrBarbati = 38500200;
		nrFemei = 42080250;
		nrCopii = 10450850;
		nrVarstnici = 18040820;

		
		//declararea si initializarea variabilelor de tip long cu intervalul de la -9 223 372 036 854 775 808 pana la -9 223 372 036 854 775 807
		//am luat drept model, declararea numarului de particule la dezintegrarea unei cantitati de substanta oricare
		
		long nrAtomi, nrProtoni, nrNeutroni, nrElectroni, nrMolecule;

		nrAtomi = 22502552552552L;
		nrProtoni = 22525252525456L;
		nrNeutroni = 22502552525522L;
		nrElectroni = 22525252525252L;
		nrMolecule = 252515541262L;
		
		
		//declararea si initializarea variabilelor de tip float numar zecimal
		//am luat drept model, declararea platilor sociale si salariale in Republica Moldova

		float salMax, salMed, salMin, salNormativ, salNormativPrognozat;

		salMax = 25302.25F;
		salMed = 16250.65F;
		salMin = 4950.52F;
		salNormativ = 2950.00F;
		salNormativPrognozat = 3250.00F;
		

		//declararea si initializarea variabilelor de tip double numar zecimal
		//am luat drept model, declararea raportului financiar, volumului vanzarilor si costului de productie 

		double volVanzari, costVanzari, rezFinanciar, pretMin, pretMax, pretMediu;

		volVanzari = 252525215225.25;
		costVanzari = 305252152112.90;
		rezFinanciar = volVanzari - costVanzari;
		pretMin = 252525.52;
		pretMax = 310222.85;
		pretMediu = (pretMin + pretMax)/2;

		
		//declararea si initializarea variabilelor de tip char 
		//am luat drept model, declararea caracterului cu care este desemnat un anumit tip de operatiune tehnologica in procesul de productie 

		char debitarePiesa, frezarePiesa, gaurirePiesa, lezuirePiesa, verificarePiesa;

		debitarePiesa = 'D';
		frezarePiesa = 'F';
		gaurirePiesa = 'G';
		lezuirePiesa = 'L';
		verificarePiesa = 'V';


		//declararea si initializarea variabilelor de tip String (Se scrie cu litera are!!!) 
		//am luat drept model, declararea mesajului cu care este desemnat un anumit tip de operatiune tehnologica in procesul de productie 
		
		String mesajAtentionare, mesajInceput, mesajProces, mesajFinalizare, mesajFelicitare;
		
		mesajAtentionare = "Atentie, in curand va incepe prelucrarea piesei!";
		mesajInceput = "Incepe procesul de prelucrare";
		mesajProces = "Are loc procesul de prelucrare";
		mesajFinalizare = "Procesul de prelucrare a fost finalizat, treceti la cerificarea piesei!";
		mesajFelicitare = "Felicitari! Piesa poate fi ambalata.";

	}

}