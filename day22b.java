
public class day22b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		SBI Delhi = new SBI ("india","delhi");
		Delhi.loan();
		Delhi.save();
		Delhi.displayMessage();
		
		
				

	}

}

class Worldbank {
	String country;

	// with constructor

	public Worldbank(String cnt) {
		this.country = cnt;
	}

	public void save() {
		System.out.println(" i am a save method");
	}

	public void loan() {
		System.out.println("i am a loan method");
	}
	
	public void displayMessage() {
		System.out.println("Welcome to Worldbank");
	}

}
 
class PNB extends Worldbank {                                                          
	String branchName;

	public PNB(String cnt, String bn) {
		super(cnt);
		this.branchName = bn;
	}
	
	// Overriding the parent method loan and save
	
	public void save () {
		System.out.println("i am save method from PNB");
	}
	
	public void loan () {
		System.out.println("i am loan method from PNB");
	}
	
}


class SBI extends Worldbank {
	String branchName;

	public SBI(String cnt, String bn) {
		super(cnt);
		this.branchName = bn;
	}
	
	//Overriding the parent method and save
	
	public void save() {
		System.out.println("i am save method from SBI");
	}
	
	public void loan() {
		System.out.println("i am loan method from SBI");
	}
	
	
	
	
	
	
	
	
	
	
}