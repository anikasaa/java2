
public class day16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human2 Anisha = new Human2("Anisha Tuladhar", 37);
		Human2 Sahara = new Human2("Sahara Tuladhar", 6);

		System.out.println(Anisha.age);
		System.out.println(Anisha.name);

		System.out.println(Sahara.age);
		System.out.println(Sahara.name);

	}

}

class Human2 {
	int age;
	String name;

	public Human2(String nm, int ag) {
		this.name = nm;
		this.age = ag;

	}

	public String talk() {
		return "hello";

	}

	public void walk() {
		System.out.println("I am walking");
	}

}