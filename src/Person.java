
public class Person {

	public void SetAge(int n) {
	n = 14;
	System.out.println("Vous avez " + n + " ans.");
	}
}

class Etudiant extends Person {
	public void goToClass() {
		System.out.println("I'm going to class");
	}
	public void displayAge(){
		System.out.println("My Age is...");
	}
}

	class Teacher extends Person {
		String subject;

		public void Explains() {
			System.out.println("Explanation begins");
		}
	}
