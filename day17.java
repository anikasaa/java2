
public class day17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// program 1

		Person[] students = { new Person("anisha", "tuladhar", 37), new Person("nirajan", "tuladhar", 42),
				new Person("sahara", "tuladhar", 6), new Person("aarik", "tuladhar", 2) };

		// for loop
		for (int i = 0; i < students.length; i++) {
			students[i].displayName();
		}

		// while loop

		int t1 = 0;
		while (t1 < students.length) {
			students[t1].displayName();
			t1++;
		}

		// forEach

		for (Person student : students) {
			student.displayName();
		}

		// program 2

		Calculator month6 = new Calculator();
		month6.addition(5, 8);
		month6.addition(2, 5, 8);
		month6.addition(10, 20);

	}

}

class Person {
	String firstName;
	String lastName;
	int age;

	public Person(String fn, String ln, int ag) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = ag;
	}

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class Calculator {

	public void addition(int a, int b) {
		System.out.println(a + b);
	}

	public void addition(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void addition(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
	}
}
