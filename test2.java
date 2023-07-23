
public class test2 {

	private static Object reverse;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Write a function which add two numbers and return a int(iwth parameter)
		
		Sub();
		Sub();
		Sub();
		Sub();
		Sub();

		SubB(20, 10);
		SubB(15, 40);
		SubB(25, 5);
		
		
		
	}

	private static void SubB(int x, int y) {
		System.out.println(x+y);
		
		
		
		
		
	}

	private static void Sub() {
		// TODO Auto-generated method stub
		
		
		// write a program to reverse a string
		
		String city2 = "Malden";
		String Rev = "";
		
		for (int i = city2.length()-1; i>=0;i--) {
			 reverse = reverse + city2.charAt(i);
		System.out.println(reverse);
		
		
		}

		
		
		// write a program to define multi-dimensional array of int and loop using for each
		
		int [][] numbers2 = {{5,10,15},{11,22,33},{55,66,77}};
		 for (int []row:numbers2) {
			 for (int col:row) {
				 System.out.println(col);
			 }
			 
		 }
		 
		 //Define a String aaray amd loop using while loop
		 
		 String []animals = {"dog","cat","elephant"};
		 int t1 = 0;
		 while ( t1 <animals.length) {
			 t1=t1+1;
			 System.out.println(animals[t1]);
			 
			 
		 }
		 
		 
		 
	}
	
	

	
}

