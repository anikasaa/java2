
public class day10revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// how to define String?
		
		String name = "anisha";
		System.out.println(name);
		
		
		// 0 1 2 3 4 5
		// A n i s h a
		//string is collection of characters
		
		//index  0,1,2,3,4,5
		//string always starts with 0
		//string stores values by index
		
		//program 2
		//print character 5
		
		char fifthchar = name.charAt(5);
		System.out.println(fifthchar);
		
		//length()
		//action- count total number of char(does not count from 0)
		//return-int
		
		
		//0 1 2 3 4 5 6 7
		//T u l a d h a r
		
		String Lastname = "Tuladhar";
		int totalChar = Lastname.length();
		System.out.println(totalChar);
		
		
		// length -1 is always the last index(meaning not counting 0)
		
		//program 3
		// print total characters 
		
		String daughtername = "sahara";
		int totalC = daughtername.length();
		System.out.println(totalC);
		
		for(int i = 0; i < totalC; i ++) {
			System.out.println(i);
			System.out.println(daughtername.charAt(i));
		}
		
		// program4
		
		String city = "pune";
		
		//0 1 2 3
		//p u n e
		
		for (int i = 0; i <city.length();i++) {
			System.out.println(i);
			System.out.println(city.charAt(i));
			
		}
		
		// program 5
		
		// print every char in reverse order
		
		for (int i = city.length()-1; i >=0; i--) {
			System.out.println(city.charAt(i));
			
		}
		
		//program 6
		
		String city2 = "Nagpur";
		String upperCaseString = city2.toUpperCase();
		System.out.println(upperCaseString);
		
		
		//program 7
		
		String city3 = "Portland";
		String lowerCaseString = city3.toLowerCase();
		System.out.println(lowerCaseString);
		
		
		//program 8
		//pune------> enup
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		
	}

}
