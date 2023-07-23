
public class day19 {
                                                                                                              
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// with constructor

		StudentB Sahara = new StudentB("Sahara", "Tuladhar", 2222);
		System.out.println(Sahara.firstName);
		System.out.println(Sahara.lastName);
		System.out.println(Sahara.ssn);
		Sahara.displayName();

		TeacherB Saharat = new TeacherB("Saharat", "Tuladhar", 2222, 5000);
		System.out.println(Saharat.firstName);
		System.out.println(Saharat.lastName);
		System.out.println(Saharat.ssn);
		System.out.println(Saharat.salary);

		Saharat.displayName();
		Saharat.displaysalary();

	}

}

class StudentB {
	String firstName;
	String lastName;
	int ssn;

	public StudentB(String fn, String ln, int ss) { 

		this.firstName = fn;
		this.lastName = ln;
		this.ssn = ss;
	}

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class TeacherB extends StudentB {

	int salary;

	public TeacherB(String fn, String ln, int ss, int sal) {
		super(fn, ln, ss);
		this.salary = sal;
	}

	public void displaysalary() {
		System.out.println(this.salary);

	}

}
