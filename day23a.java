
public class day23a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cat c = new cat();
		c.displayMessage();

	}

}

// use of super keyword in java

class Animal {

	public void display() {
		System.out.println("i am an animal");
	}
}

class cat extends Animal {
	public void display() {
		System.out.println("i am a cat");
	}

	public void displayMessage() {
		display();
		super.display();
	}
}
