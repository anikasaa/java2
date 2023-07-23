
public class day23b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnimalX cat = new AnimalX(10);
		// System.out.println(cat.age);
		cat.displayAge();
		int Q1 = cat.updateAge(15);
		System.out.println(Q1);

		cat.displayMessage();

	}

}

class AnimalX {

	private int age;

	public AnimalX(int ag) {
		this.age = ag;

	}

	// method returning string

	private String displayName() {
		return "i am a cat";

	}

	public void displayAge() {
		System.out.println(this.age);
	}

	// methods returning int

	public int updateAge(int updateAgee) {
		this.age = updateAgee;
		return this.age;

	}

	public void displayMessage() {
		String msg = displayName();
		System.out.println(msg);

	}
}
