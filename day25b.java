
public class day25b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Catc c = new Catc();
		c.makeSound();
		c.eat();

	}

}

abstract class AnimalX1 {
	abstract void makeSound();

	public void eat() {
		System.out.println("i like to eat");
	}
}

class Catc extends AnimalX1 {
	public void makeSound() {
		System.out.println("i can meow");
	}
}
