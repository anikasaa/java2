
public class day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// switch case without statement
		
		String city = "Boston";
		
		switch (city) {
		
		case "Vegas":
			System.out.println("NV");
		case "Boston":
			System.out.println("MA");
		case "Portsmouth":
			System.out.println("NH");
		case "Burlington":
			System.out.println("VT");
			default:
				System.out.println("Incorrect city name");
				
				
		}
		
		// program 2 
		
		String city2 = "Burlington";
		switch(city2) {
		case "Vegas":
			 System.out.println("NV");
			 break;
		case "Boston":
			System.out.println("MA");
			break;
		case "Portsmouth":
			System.out.println("NH");
			break;
		default:
			System.out.println("Incorrect city name");
			 
		                         
		}
		
		
		//program 3
		
		String city3 = "Malden";
		switch  (city3) {
		case "Vegas":
		case "Reno":
			System.out.println("NV");
			break;
			
		
		case "Boston":
		case "Malden":
			System.out.println("MA");
			break;
			
		case "Portsmouth":
		case "Concord":
			System.out.println("NH");
			break;
			
		case "Burlington":
		case "Stowe":
		case "Essex":
			System.out.println("VT");
			break;
			
		default:
			System.out.println("Incorrect city name");
			
		
		}
		
		
		
		
		
		

	}

}
