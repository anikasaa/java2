
public class day18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle BMW = new Vehicle();
		Vehicle tesla = new Vehicle ("tesla");
		Vehicle hyundai = new Vehicle("tesla","s4");
		
		
		

	}

}


class Vehicle {
	
	String name;
	String model;
	
	public Vehicle() {
		System.out.println("default constructor is called");
	}
	
	public Vehicle(String nm) {
		this.name = nm;
		System.out.println("the name of the vehicle"+ this.name);
	}
	
	
	public Vehicle(String nm, String md1) {
		this.name = nm;
		System.out.println("The name of vehicle"+ this.name + this.model);
	}
	

}