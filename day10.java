
public class day10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// program 1

		String name = "nirajan";
		System.out.println(name);

		// program 2
		// charAt();

		char fifthChar = name.charAt(5);
		System.out.println(fifthChar);

		// length -1 is always the last index

		// program 3

		String mothername = "sadhana";
		int totalC = mothername.length();
		System.out.println(totalC);

		for (int i = 0; i < totalC; i++) {
			System.out.println(i);
			System.out.println(mothername.charAt(i));

		}

		// program 4
		String city = "boston";

		// 0 1 2 3 4 5
		// b o s t o n

		for (int i = 0; i < city.length(); i++) {
			System.out.println(i);
			System.out.println(city.charAt(i));
		}

		// program 5
		// print every char in reverse order

		for (int i = city.length() - 1; i >= 0; i--) {
			System.out.println(i);
			System.out.println(city.charAt(i));

		}

		// program 6

		String city2 = "malden";
		String upperCaseString = city2.toUpperCase();
		System.out.println(upperCaseString);

		// program 7
                             
		String city3 = "somerville";
		String lowerCaseString = city3.toLowerCase();
		System.out.println(lowerCaseString);

//program 8

// pune = "enup"

		String city4 = "pune"; 
		for (int i = city4.length() - 1; i >= 0; i--) {
			System.out.println(city4.charAt(i));

		}
	}
}
