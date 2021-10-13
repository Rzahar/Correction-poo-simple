
public class Telephone {
	String marque;
	String modele;
	String couleur;
	double prix;
	
	public Telephone() {  //constructeur; à déclarer du plus bête au plus intelligente, du vide au plus complet
		
		
	}
	public Telephone (String marque, String modele, String couleur, double prix) {
		this.marque = marque;
		this.modele = modele;
		this.couleur = couleur;
		this.prix = prix;
	}
	
	public void envoyerMEssage(String message) {
		System.out.println(message);
	}
	
	public void appeler(String destinataire) {
		System.out.println("Je suis en train d'appeler " + destinataire);
	}
	@Override
	public String toString() {
		return "Telephone [marque=" + marque + ", modele=" + modele + ", couleur=" + couleur + ", prix=" + prix + "]";
	}
	
	//methode tostring permet d'afficher l'objet, A LA FIN
	
	
}
