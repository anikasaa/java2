
public class testjuly9d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//overridding
		
		citizensbank boston = new citizensbank ("boston","MA");
		boston.deposit();
		boston.save();
		boston.displayMessage();
		

	}

}

class worldbank {
	String city;
	
	public worldbank (String ct) {
		this.city = ct;
		
	}
	
	public void deposit() {
		System.out.println("i am deposit method");
	}
	
	public void save () {
		System.out.println("i am save method");
	}
	
	public void displayMessage () {
		System.out.println("welcome to worldbank");
	}
}


class citizensbank extends worldbank {
	String branchName;

	public citizensbank(String ct, String bn) {
		super(ct);
		this.city = bn;
		
	}
	
	public void deposit() {
		System.out.println("i am deposit from citizensbank");
	}
	
	public void save() {
		System.out.println("i am save from citizensbank boston");
	}
}


class boa extends worldbank {

	public boa(String ct, String bn ) {
		super(ct);


	}
	
}