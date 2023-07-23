
public class exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// write a function for addiotn of two number

		System.out.println(3 + 8);

//define two variables and perform arithmetic operations
		int a = 9, b = 18;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

// define three variables and print the greatest number

		int aa = 5, bb = 20, cc = 90;

		if (aa > bb && aa > cc) {
			System.out.println("aa is greatest number");
		} else if (bb > aa && bb > cc) {
			System.out.println("bb is greatest number");

		} else {
			System.out.println("cc is greatest number");

		}

// write program for switch case 

		String city = "Boston";
		switch (city) {
		case "Arlington":
			System.out.println("VA");
			break;

		case "Dallas":
			System.out.println("TX");
			break;

		default:
			System.out.println("incorrect city name");

		}

	}

}
