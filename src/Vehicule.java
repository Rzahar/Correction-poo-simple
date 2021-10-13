
public class Vehicule {
	public String couleur;
	public String marque;
	public Double prix;

	public Vehicule() {
		System.out.println("Passage par le constructeur");
		this.marque = "Tesla";
		this.couleur = "bleu";
		this.prix = 15.00;
	}
	


	public Vehicule(String marque, double prix) {
		this.marque = marque;
		this.prix = prix; 
	}
	
	public Vehicule (String marque, String couleur, double prix) {
this(marque,prix);
System.out.println("passage par le constructeur");
this.couleur = couleur;
	}
	
	
	@Override
	public String toString() {
		return "Vehicule [marque=" + marque + ",couleur=\" + couleur + \", prix=" + prix + "]";
	}
	
	
}
