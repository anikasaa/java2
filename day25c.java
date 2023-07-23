
public class day25c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToyotaT sienna = new ToyotaT(2);
		System.out.println(sienna.wheel);
		sienna.brake();

	}

}
// with constructor

abstract class VehicleT {
	int wheel;

	public VehicleT(int wh) {
		this.wheel = wh;
	}

	abstract public void brake();
}

class ToyotaT extends VehicleT {

	public ToyotaT(int wh) {
		super(wh);

	}

	public void brake() {
		System.out.println("i am brake for ToyotaT");

	}

}
