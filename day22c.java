
public class day22c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CalculatorX a = new CalculatorX();
		a.multiplication(5, 2);
		a.multiplication(5, 2, 3);
		a.multiplication(5, 2, 3, 1);
		

	}

}

class CalculatorX {
	public void multiplication (int x, int y) {
		System.out.println(x*y);
	}
	
	
	public void multiplication (int x, int y, int z) {
		System.out.println(x*y*z);
	}
	
	public void multiplication (int x, int y, int z, int a) {
		System.out.println(x*y*z*a);
	}
}
