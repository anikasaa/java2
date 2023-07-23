
public class day14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		// Multi- dimensional array
		// {10,20,30,40}, {45,55,65,75}, {105,205,305,405}

		int[][] marks3 = new int[3][4];

		marks3[0][0] = 10;
		marks3[0][1] = 20;
		marks3[0][2] = 30;
		marks3[0][3] = 40;

		marks3[1][0] = 45;
		marks3[1][1] = 55;
		marks3[1][2] = 65;
		marks3[1][3] = 75;

		marks3[2][0] = 105;
		marks3[2][1] = 205;
		marks3[2][2] = 305;
		marks3[2][3] = 405;
		
		System.out.println(marks3[1][2]);
		
		
		//program 1
		//for loop
		
		for (int i = 0; i < marks3.length; i++) {
			System.out.println(i);
			
			int []arr = marks3[i];
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[j]);
			}
		}
		
		//program 2
		
		int [][] numbers2 = {
				
				{45,55,65},
				{75,85,95},
				{100,200,300}
		};
		
		for (int i = 0; i < numbers2.length; i++) {
			int[]arr = numbers2[i];
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[j]);
			}
			
		}
		
		// while loop
		//program 3
		
		int r1 = 0;
		
		while (r1 < numbers2.length) {
			int arr[]= numbers2 [r1];
			int c1 = 0;
			while (c1 < arr.length) {
				System.out.println(arr[c1]); 
				c1= c1+1;
				r1 ++;
				
						
			}
		}
		
		// program 4
		 for (int []row:numbers2) {
			 for (int col : row) {
				 System.out.println(col);
			 }
		 }


	}

}
