
public class day13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Program 1
		
		int [] numbers = new int [6];
		numbers[0] = 100;
		numbers [1] = 200;
		numbers[3] = 300;
		numbers [4] = 400;
		numbers[5] = 500;
		
		System.out.println(numbers [0]);
		System.out.println(numbers [1]);
		System.out.println(numbers [2]);
		System.out.println(numbers [3]);
		System.out.println(numbers [4]);
		System.out.println(numbers [5]);
		
		int [] numbers2 = {101,102,103,104,105,106};
		System.out.println(numbers2[0]);
		System.out.println(numbers2[2]);
		System.out.println(numbers2[3]);
		System.out.println(numbers2[4]);
		System.out.println(numbers2[5]);
		
		
		// program 2
		
		String [] cities = new String [5];
		
		cities[0]= "boston";
		cities[1]= "somerville";
		cities[2]= "malden";
		cities[3]= "melrose";
		cities[4]= "medford";
		
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		System.out.println(cities[4]);
		
		
		// looping through array
		
		for(int i = 0; i < cities.length; i++) {
			
			System.out.println(i);
			System.out.println(cities[i]);
		}
		
		
		int [] marks = {11,22,33,44,55,66};
		
		for(int i = 0 ; i < marks.length; i ++) {
			System.out.println(marks[i]);
		}
		
		System.out.println("reverse.....");
		
		for(int i = marks.length -1; i >=0; i--) {
			System.out.println(marks[i]);
			
		}
		
		// program 3
		                                          
		int mks []= {10,20,30,40,50,60,70};
		
		int t1 = 0;
		
		while(t1 < mks.length) {
			System.out.println(mks[t1]);
			t1=t1+1;
		}
		
		
		int t2 = mks.length -1;
		while(t2>=0) {
			System.out.println(mks[t2]);
			t2=t2-1;
		}
		
		
		//program 4 (for each loop)
		
		String [] animals = {"dog","cat","rabbit"};
		int[]mks2= {5,10,15};
		
		for(String x:animals) {
			System.out.println(x);
		}
		
		for(int y: mks2) {
			System.out.println(y);
		}
		
	
		
		// 
		
		
		
		
		  
		
		
		
		

	}

}
