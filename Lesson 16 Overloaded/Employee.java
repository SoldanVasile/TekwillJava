public class Employee {

	String name, surname, educationLevel, socialStatus;
	double salary;
	int idNomber;
	byte age, numbOfChildren;

	public Employee(String eName, String eSurname) {

		name = eName;
		surname = eSurname;

	}

	public Employee(String eName, String eSurname, int eIdNomber, String eSocialStatus) {

		this (eName, eSurname);
		idNomber = eIdNomber;
		socialStatus = eSocialStatus;

	}

	public Employee(String eName, String eSurname, int eIdNomber, String eSocialStatus, byte eAge, byte eNumbOfChildren, String eEducationLevel, double eSalary) {

		this (eName, eSurname, eIdNomber, eSocialStatus);

		age = eAge;
		numbOfChildren = eNumbOfChildren;
		educationLevel = eEducationLevel;
		salary = eSalary;

	}

	public static void main(String [] args) {

		Employee angajat = new Employee ("Ion", "Iordachi");

		System.out.println(angajat.name + " " + angajat.surname);



		Employee angajatPd = new Employee ("Ion" , "Iordachi", 200505225, "Casatorit");

		System.out.println(angajatPd.name + " " + angajatPd.surname + " " + angajatPd.idNomber + " " + angajatPd.socialStatus);

	}


}