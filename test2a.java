
public class test2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// define a class vehicle with 2 property color and type and one method start() and create object usinf constructor
		
		vehicle toyota = new vehicle("brown","prius");
		System.out.println(toyota.color);
		System.out.println(toyota.type);
		
		
		

	}

}
class vehicle 
{
	String color;
	String type;
	public vehicle ( String color, String type) {
		
		this.color=color;
		this.type=type;
	}
	
	public void start() {
		System.out.println("the car is bmw");
	}
}
  

