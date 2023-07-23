
public class day15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating a instance or object
		
		Human Anisha  = new Human();
		System.out.println(Anisha.age);
		System.out.println(Anisha.name);
		Anisha.walk();
		Anisha.talk();
		
		Anisha.age = 37;
		Anisha.name = "Anisha Tuladhar";
		System.out.println(Anisha.age);
		System.out.println(Anisha.name);
		
		
		//creating another object
		
		Human Sahara = new Human();
		System.out.println(Sahara.age);
		System.out.println(Sahara.name);
		Sahara.talk();
		Sahara.walk();
		
		Sahara.age = 6;
		Sahara.name = "Sahara Tuladhar";
		System.out.println(Sahara.age);
		System.out.println(Sahara.name);
		
		
		

	}

}


class Human {
	int age;
	String name;
	            
	// Methods
	
	public void talk() {
		System.out.println("i can talk");
	}
	
	public void walk() {
		System.out.println("i can walk");
	}
}