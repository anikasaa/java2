
public class day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for(initialization; condtionCheck; increment/decrement){
		//statements
		//}
		
		
		//initialization
		// while(condition)
		//statements
		//increment/decrement
		//}
		
		// print 1 to 3
		
		int t1 = 1;
		while (t1<=3) {
			System.out.println(t1);//1//2//3
			t1++; //2 //3//4
		}
		
		// program 2
		
		//print 1 to 5
		
		int t2 = 1;
		while (t2<=5) {
			System.out.println(t2);//1//2//3//4//5
			t2++; //2//3//4//5//6
		}

		
		//program 5
		 //print hello 3 times
		
		int t5=1;
		while (t5<=3) {
			System.out.println("hello");
			t5 ++;
			}
		
		//program 3
		
	// create table of 5
		int t3=5;
		while (t3<=50) {
			System.out.println(t3);
			t3= t3+5;
		}
		
		
		//program 4
		// table of 3 but reverse
		
		int t4=30;
		while (t4>=3) {
			System.out.println(t4);
			t4= t4-3;
			
		}
		
		// program 6
		// table of 7 reverse but break at 35
		
		int t6 = 70;
		while (t6>=7) {
			System.out.println(t6);
			if (t6==35) {
				break;
			}
			t6= t6-7;
		}
		
		//program 7
		// print 1 to 10 but skip 5 so basically you print 1,2,3,4,6,7,8,9,10
		
		int t7=1;
				while (t7<=10) {
					if(t7==5) {
						t7++;
						continue;
						
					}
					System.out.println(t7);
					t7++;
				}
		
		
		
	}

}
