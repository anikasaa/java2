
public class testjul9b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// write a class using constructor with two proeprties(field) and one method and create object of same class
		
		Vehicle Tesla = new Vehicle();
		Vehicle toyota = new Vehicle ("toyota");
		Vehicle honda = new Vehicle ("toyota", "crv");

	}

}

class VehicleX {
	String name;
	String model;
	
	
	
	public VehicleX() {
		System.out.println("construction is called");
	}
	
	public VehicleX(String nm) {
		this.name = nm;
		System.out.println("Tesla"+ this.name);
	}
	
	public VehicleX(String nm, String mdn) {
		System.out.println("Tesla" + this.name + this.model);
	}
}
