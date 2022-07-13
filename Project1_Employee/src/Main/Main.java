/*
 * MIS2022
 * Σχεδιασμός και Ανάπτυξη Εφαρμογών - Java
 * Μωραϊτόπουλος Παναγιώτης
 * MIS22013
 * Project1
 */

package Main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// New Entries	
		Employee E1 = new Employee("Ελένη Παπαδοπούλου", "ΠΕ", 2, 25, true, 2, 1800);
		Employee E2 = new Employee("Νίκος Παπαδόπουλος", "ΠΕ", 1, 4, true, 2, 1200);
		
		//Print New Entries
		System.out.println("Αρχικές Καταχωρήσεις");	
		System.out.println();
		E1.printData();
		E2.printData();
		
		//Change Field
		E1.setChildren(0);
		
		//Calculate Subsidy
		E1.calcSub(10, 30);
		E2.calcSub(10, 30);
		
		//Print New Data
		System.out.println();
		System.out.println("Νέες Τιμές");	
		System.out.println();
		E1.printData();
		E2.printData();	
		
	}

}
