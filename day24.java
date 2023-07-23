
public class day24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VehicleS X = new VehicleS("grey", "Ty05", 0210);

		// accessing properties
		System.out.println(X.color);
		System.out.println(X.model);

		// calling out method
		X.displayColor();
		X.displayChaseNoandModel();

		// creating instance of childclass
		CarX toyota = new CarX("grey", "Ty05", 0124, "toyota");
		System.out.println(toyota.color);
		System.out.println(toyota.model);
		System.out.println(toyota.name);

		toyota.displayChaseNoandModel();
		toyota.displayColor();

		// overloading

		toyota.launchDate(2023);
		toyota.launchDate(2023, "april");
		toyota.launchDate(2023, "april", 21);

		// calling out parent method

		toyota.greetMsg();

		int wheels = toyota.displayWheel();
		System.out.println(wheels);

	}

}

class VehicleS {
	String color;
	String model;
	private int chaseNo;

	public VehicleS(String cl, String md, int chaseNo) {
		this.color = cl;
		this.model = md;
		this.chaseNo = chaseNo;
	}

	public void displayColor() {
		System.out.println(this.color);
	}

	public void displayChaseNoandModel() {
		System.out.println(this.chaseNo);
		this.displayModelNo();

	}

	private void displayModelNo() {
		System.out.println(this.model);
	}

	public void greetMsg() {
		System.out.println("welcome to toyota");
	}

	protected void greetMsg2() {
		System.out.println("welcome to toyota once again");
	}

}

class CarX extends VehicleS {
	String name;
	private int wheel = 3;

	public CarX(String cl, String md, int chaseNo, String nm) {
		super(cl, md, chaseNo);
		this.name = nm;
	}

	// overloading (same class, same method name, different signature)

	public void launchDate(int year) {
		System.out.println(year);
	}

	public void launchDate(int year, String month) {
		System.out.println(year);
		System.out.println(month);
	}

	public void launchDate(int year, String month, int date) {
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
	}

	public int displayWheel() {
		return this.wheel;

	}

	// override(same method, same signature, different class, and should be
	// inheritance)

	public void greetMsg() {
		System.out.println("congratulations on your new toyota");
		super.greetMsg();
		this.greetMsg2();
	}

}
