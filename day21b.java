
public class day21b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// single inheritance with constructor

		TeacherX AnishaBN = new TeacherX("ani", "tula", 20, 2000);
		System.out.println(AnishaBN.firstName);
		System.out.println(AnishaBN.lastName);
		System.out.println(AnishaBN.age);
		System.out.println(AnishaBN.salary);

		AnishaBN.displayName();
		AnishaBN.displaySalary();

	}

}

class StudentX {

	String firstName;
	String lastName;
	int age;

	public StudentX(String fn, String ln, int ag) {

		this.firstName = fn;
		this.lastName = ln;
		this.age = ag;

	}

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}

}

class TeacherX extends StudentX {
	int salary;

	public TeacherX(String fn, String ln, int ag, int sal) {
		super(fn, ln, ag);
		this.salary = sal;

	}

	public void displaySalary() {
		System.out.println(this.salary);
	}

}
