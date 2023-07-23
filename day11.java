
public class day11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstName = "Anisha";

		// 0 1 2 3 4 5
		// A n i s h a
		String rev = "";

		for (int i = 0; i < firstName.length(); i++) {
			// System.out.println(i);
			System.out.println(firstName.charAt(i));
			rev = firstName.charAt(i) + rev;

			// a + ""-----> a
			// n + a ------> na

		}
		System.out.println(rev);
		{

		}

		// program 2

		String city = "Malden";
		String rev2 = "";
		{
		}

		// 0 1 2 3 4 5                                                                            
		// M a l d e n

		for (int i = city.length() - 1; i >= 0; i--) {
			System.out.println(i);
			System.out.println(city.charAt(i));

			rev2 = rev2 + city.charAt(i);
		}

		System.out.println(rev2);

		// program 1

		String city1 = "Boston";
		String uc = city1.toUpperCase();
		System.out.println(uc);
		System.out.println(city1.toUpperCase());
		System.out.println("welcome".toUpperCase() + uc);

		// program 2

		String city2 = "Somerville";
		String lc = city2.toLowerCase();
		System.out.println(lc);

		// program 3

		String city3 = "Brockton";    
		int toc = city3.length();
		System.out.println(toc);

		// program 4
		String city4 = "Middleton";
		int toc2 = city4.toUpperCase().toLowerCase().length();
		System.out.println(toc2);

		// program 5

		String city5 = "Lynnfield";
		char c = city5.charAt(city5.length() - 1);
		System.out.println(c);

		// program 6

		// 0 1 2 3 4 5 6 7
		// e v e r e t t e

		String city6 = "Everett";

		String s1 = city6.substring(3);
		System.out.println(s1);

		String s2 = city6.substring(1, 3);
		System.out.println(s2);

	}

}
