
public class day22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		additionA(5, 2);
		additionA(5, 2, 6);
		additionA(5, 2, 6, 8);

	}

	// overloading... same class....same method....different signature

	// method 1

	public static void additionA(int x, int y) {
		System.out.println(x + y);
	}

	// method 2

	public static void additionA(int x, int y, int z) {
		System.out.println(x + y + z);
	}

	// method 3

	public static void additionA(int x, int y, int z, int a) {
		System.out.println(x + y + z + a);
	}

}
