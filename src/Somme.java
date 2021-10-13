import java.util.Scanner;

public class Somme {
	double n1;
	double n2;
	
	public Somme () {
		
	}
	
	public Somme (double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public double surface () {
		double resultat = this.n1 + this.n2;
		return resultat;
	}

	public double resultat () {
		double surfaceSum = this.n1 + this.n2;
		return surfaceSum;
	}
	
	public static int valeur() {
		System.out.println("Entrez un nombre");
		Scanner sc = new Scanner(System.in);
		 double reponse = sc.nextInt();
		 return (int) reponse;
	}
	
	@Override
	public String toString() {
		return "Somme [n1=" + n1 + ", n2=" + n2 + "]";
	}
	
	
}
