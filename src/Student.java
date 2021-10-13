

import java.util.Scanner;

public class Student {
	String nom;
	double note1;
	double note2;
	
	public Student () {	
	}
	
	public Student(String nom, double note1, double note2) {
		this.note1 = note1;
		this.note2 = note2;
	}
	
	public double moyenne () {
		double moy = ((this.note1 + this.note2)/2);
		return moy;
	}
	
	public double show() {
		System.out.println(moyenne());
		return moyenne();	}
	
	public static String nom() {
		System.out.println("Entrez un nom");
		Scanner sc = new Scanner(System.in);
		 String reponse = sc.nextLine();
		 return reponse;
	}
	
	public static int valeur() {
		System.out.println("Entrez un nombre");
		Scanner sc = new Scanner(System.in);
		 double reponse = sc.nextInt();
		 return (int) reponse;
	}

	@Override
	public String toString() {
		return "Student [nom=" + nom + ", note1=" + note1 + ", note2=" + note2 + "]";
	}
	
	
}
