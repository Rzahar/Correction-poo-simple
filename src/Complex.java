import java.util.Scanner;

public class Complex {
	int firstNum;
	int secondNum;
	
public Complex() {
}

public Complex(int firstNum, int secondNum) {
	this.firstNum = firstNum;
	this.secondNum = secondNum;
}

public int somme() {
	int res = this.firstNum + this.secondNum;
	return res;
}

public static int valeurR() {
	System.out.println("Entrez un nombre réel");
	Scanner sc = new Scanner(System.in);
	 double reponse = sc.nextInt();
	 return (int) reponse;
}

public  static int valeurI() {
	System.out.println("Entrez un nombre imaginaire");
	Scanner sc = new Scanner(System.in);
	 double reponse = sc.nextInt();
	 return (int) reponse;
}



@Override
public String toString() {
	return "Complex [firstNum=" + firstNum + ", secondNum=" + secondNum + "]";
}


}

