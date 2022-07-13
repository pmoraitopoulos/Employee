/*
 * MIS2022
 * Σχεδιασμός και Ανάπτυξη Εφαρμογών - Java
 * Μωραϊτόπουλος Παναγιώτης
 * MIS22013
 * Project1
 */

package Main;

import java.util.*;

public class Employee {
	
	//private String firstName;
	//private String lastName;
	private String fullName;
	private String education;
	private int master;
	private int workYears;
	private boolean married;
	private int children;
	private int income;
	private int sub;

	//Constructor1
	public Employee(String myFullName, String myEducation, int myMaster, int myWorkYears, boolean myMarried, int myChildren, int myIncome) {
		
		fullName = myFullName;
		
		if (myEducation.equals("ΥΕ") || myEducation.equals("ΔΕ") || myEducation.equals("ΠΕ"))
			education = myEducation;
		else
			System.out.println("Μη αποδεκτή Βαθμίδα Εκπαίδευσης");
		
		if (myMaster == 0 || myMaster == 1 || myMaster == 2)
			master = myMaster;
		else
			System.out.println("Μη αποδεκτή επιλογή Μεταπτυχιακών σπουδών");
		
		if(myWorkYears >=0)
			workYears = myWorkYears;
		else
			System.out.println("Δεν επιτρέπονται αρνητικές τιμές στα χρόνια εργασίας");
		
		married = myMarried;
		
		if(myChildren >=0)
			children = myChildren;
		else
			System.out.println("Μη αποδεκτή τιμή ανήλικων παιδιών");
		
		if(myIncome >= 0)
			income = myIncome;
		else
			System.out.println("Μη αποδεκτή τιμή εισοδήματος");	
		
		sub = 0;		
	}
	
	
	//Getters
	public String getName() {
		return fullName;
	}
	
	public String getEducation() {
		return education;
	}
	
	public int getMaster() {
		return master;
	}
	
	public int getWorkYears() {
		return workYears;
	}
	
	public boolean getMarried() {
		return married;
	}
	
	public int getChildren() {
		return children;
	}
	
	public int getIncome() {
		return income;
	}
	
	public int getSub() {
		return sub;
	}
	
	public int getIncomeAndSub() {
		return (income+sub);
	}
	
	//Mutators
	
	public void setEducation(String myEducation) {
		
		if (myEducation == "YE" || myEducation == "ΔΕ" || myEducation == "ΠΕ")
			education = myEducation;
		else
			System.out.println("Μη αποδεκτή Βαθμίδα Εκπαίδευσης");
	}
	
	public void setMaster(int myMaster) {
		
		if (myMaster == 0 || myMaster == 1 || myMaster == 2)
			master = myMaster;
		else
			System.out.println("Μη αποδεκτή επιλογή Μεταπτυχιακών σπουδών");
	}
	
	public void raseWorkYears() {
		++workYears;
	}
	
	public void setMarried(boolean myMarried) {
		married = myMarried;
	}
	
	/*public void setIncome(int myIncome) {
		
		if(myIncome >= 0)
			income = myIncome;
		else
			System.out.println("Μη αποδεκτή τιμή εισοδήματος");
	}
	*/
	public void setChildren(int myChildren) {
		if(myChildren >=0)
			children = myChildren;
		else
			System.out.println("Μη αποδεκτή τιμή ανήλικων παιδιών");
	}
	
	public void calcSub(int subForWork, int subForChildren) {
		int subForMarried;
		if (married)
			subForMarried = 50;
		else
			subForMarried = 0;
		
		
		sub = subForWork*workYears + subForMarried +children*subForChildren + master*50;
	}
	
	//PrintData Methods
	
	public void printData() {
		String masterLog;
		String marriedLog;
		if(master == 0)
			masterLog = "Δεν έχει";
		else if(master ==1)
			masterLog = "Μεταπτυχιακό δίπλωμα";
		else
			masterLog = "Διδακτωρικό δίπλωμα";
		
		if(married)
			marriedLog = "Έγγαμος";
		else
			marriedLog = "Άγαμος";
		
		System.out.println("==============================");
		System.out.println("Ονοματεπώνυμο: " + getName());
		System.out.println("Βαθμίδα Εκπαίδευσης: " + getEducation());
		System.out.println("Μεταπτυχιακές σπουδές: " + masterLog);
		System.out.println("Έτη υπηρεσίας:  " + getWorkYears());
		System.out.println("Οικογενειακή κατάσταση: " + marriedLog);
		System.out.println("Αριθμός ανήλικων παιδιών: " + getChildren());
		System.out.println("Μισθός: " + getIncome() + " euros");
		System.out.println("Μηνιαίο εισόδημα: " + getIncomeAndSub() + " euros");
		System.out.println("==============================");
	}

}
