
public class testjuly9c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// write an example of multiple level inheritance
		
		Son Aarik = new Son ("mani","tuladhar", "nirajan","Aarik");
		System.out.println(Aarik.firstName);
		System.out.println(Aarik.lastName);
		System.out.println(Aarik.fFirstName);
		System.out.println(Aarik.Sname);
		
		Aarik.displayfName();
		Aarik.displayGName();
		Aarik.displaySName();
		

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


class son extends Father {

	private String Sname;

	public son(String firstName, String lastName, String ffn, String ssn) {
		super(firstName, lastName, ffn);
		this.Sname = ssn;
		
		
	}
	
	public void displaySname() {
		System.out.println(this.Sname + this.lastName);
	}
	
}
