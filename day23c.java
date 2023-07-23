
public class day23c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cars c = new Cars(2021);
		System.out.println(c.year);

		Tesla t = new Tesla(2023);
		t.displayyear();

	}

}

class Cars {
	protected int year;

	public Cars(int year) {
		this.year = year;

	}
}

class Tesla extends Cars {

	public Tesla(int year) {
		super(year);

	}

	public void displayyear() {
		System.out.println(this.year);

	}

}
