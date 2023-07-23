
public class day21c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// multiple inheritance

		Son aarik = new Son("mani", "tuladhar", "nirajan", "aarik");
		System.out.println(aarik.firstName);
		System.out.println(aarik.lastName);
		System.out.println(aarik.fFirstName);
		System.out.println(aarik.Sname);

		aarik.displayfName();
		aarik.displayGName();
		aarik.displaySName();

	}

}

class Grandfather {
	String firstName;
	String lastName;

	public Grandfather(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

	}

	public void displayGName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class Father extends Grandfather {

	String fFirstName;

	public Father(String firstName, String lastName, String ffn) {
		super(firstName, lastName);
		this.fFirstName = ffn;

	}

	public void displayfName() {
		System.out.println(this.fFirstName + this.lastName);

	}

}

class Son extends Father {

	String Sname;

	public Son(String firstName, String lastName, String ffn, String ssn) {
		super(firstName, lastName, ffn);
		this.Sname = ssn;

	}

	public void displaySName() {
		System.out.println(this.Sname + this.lastName);
	}

}