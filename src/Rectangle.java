
public class Rectangle {
	double longueur;
	double largeur;

	public Rectangle() {

	}
	
	public Rectangle (double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public double surface () {
		double resultat = this.largeur * this.largeur;
		return resultat;
	}

	@Override
	public String toString() {
		return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]";
	}
	
	
}