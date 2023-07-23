
public class day21d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// one parent 2 child
		
		
		DaughterA Sahara = new DaughterA ("nirajan","tuladhar","sahara");
		SonA aarik = new SonA ("nirajan", "tuladhar","aarik");
		
		aarik.displaySName();
		aarik.displayFName();
		
		Sahara.displayFName();
		Sahara.displayDName();
		

	}

}



class FatherA {
	
	String firstName;
	String lastName;
	
	public FatherA (String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
		
	}
	
	public void displayFName() {
		System.out.println(this.firstName + this.lastName);
	}
}



class SonA extends FatherA {
	
	String Sname;

	public SonA(String fn, String ln, String sn) {
		super(fn, ln);
		this.Sname = sn;
	}
	
	
	public void displaySName () {
		System.out.println(this.Sname + this.lastName);
		
	}
	
}

class DaughterA extends FatherA {
	
	String Dname;
	
	public DaughterA(String fn, String ln, String dn) {
		super(fn, ln);
		this.Dname = dn;
		
	}
	
	public void displayDName () {
		System.out.println(this.Dname +this.lastName);
	}

	
	
}
