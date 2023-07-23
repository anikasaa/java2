
public class day12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// program 1

		String city1 = "Boston";
		String uc = city1.toUpperCase();
		System.out.println(uc);
		System.out.println(city1.toUpperCase());
		System.out.println("welcome".toUpperCase());

		// Program 2

		String city2 = "MAlden";
		String lc = city2.toLowerCase();
		System.out.println(lc);

		// program 3

		String city3 = "Burlington";
		int toc = city3.length();
		System.out.println(toc);

		// program 4

		String city4 = "Somerville";
		int toc2 = city4.toUpperCase().toLowerCase().length();
		System.out.println(toc2);

		// program 5

		String city5 = "Cambridge";
		char c = city5.charAt(city5.length() - 1);
		System.out.println(c);

		// StartsWith()

		String city8 = "Boston";
		boolean s3 = city8.startsWith("Bos");
		System.out.println(s3);

		// EndsWith()

		String city9 = "Melrose";
		boolean s4 = city9.endsWith("ose");
		System.out.println(s4);

		// ReplaceFirst()

		String city10 = "I live in Boston Massachusetts";
		String s5 = city10.replaceFirst("Boston", "Malden");
		System.out.println(s5);

		// ReplaceAll()

		String s6 = city10.replaceAll("Boston", "Malden");
		System.out.println(s6);

		// replace()
		String s7 = city10.replace("o", "a");
		System.out.println(s7);

		// Concat()
		String city11 = "Kathmandu";
		String city12 = "Welcome to ";
		String s10 = city12.concat(city11);
		System.out.println(s10);

		// contains()
		String city13 = "I am from Nepal";
		Boolean s11 = city13.contains("from");
		System.out.println(s11);

		// equals()

		String city14 = "Kathmandu";
		String city15 = "kathmandu";
		boolean s12 = city14.equals(city15);

		// equal1IgnoranceCase()

		boolean s13 = city14.equalsIgnoreCase(city15);

		System.out.println(s13);
		
		
		
		//trim()
		
		String city16 = " I am from Nepal";
		System.out.println(city16.length());
		String s14 = city16.trim();
		System.out.println(s14.length());
		
		
		//contains
		
		String city17 = "I speak Nepali";
		String city18 = "English";
		boolean s15 = city17.toUpperCase().contains(city18);
		System.out.println(s15);
		
		
		

	}

}
