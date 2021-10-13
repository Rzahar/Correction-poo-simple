import java.util.Scanner;

public class Points {
	int x, y;

	public Points() {
	}

	public Points(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static int valeurX() {
		System.out.println("Entrez la valeur des absisses");
		Scanner sc = new Scanner(System.in);
		double reponse = sc.nextInt();
		return (int) reponse;
	}

	public static int valeurY() {
		System.out.println("Entrez la valeur des ordonnées");
		Scanner sc = new Scanner(System.in);
		double reponse = sc.nextInt();
		return (int) reponse;
	}

	public double distance (Points point) {
		double result = 0;
		double partie1 = Math.pow((point.x - this.x),2);
		double partie2 = Math.pow((point.y - this.y), 2);
		result = Math.sqrt(partie1 + partie2);
		return result;
		
	}
	

	@Override
	public String toString() {
		return "Points [x=" + x + ", y=" + y + "]";
	}
}
