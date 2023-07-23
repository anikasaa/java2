
public class day21a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// inheritance

		Student Sahara = new Student();
		System.out.println(Sahara.firstName);
		System.out.println(Sahara.lastName);
		System.out.println(Sahara.age);

		Sahara.firstName = "Sahara";
		Sahara.lastName = "Tuladhar";
		Sahara.age = 6;

		System.out.println(Sahara.firstName);
		System.out.println(Sahara.lastName);
		System.out.println(Sahara.age);
		Sahara.displayName();

		// creating object of TeacherA

		TeacherC a = new TeacherC();
		System.out.println(a.salary);

		a.firstName = "Sahara a";
		a.lastName = "Tuladhar a";
		a.age = 23;
		a.salary = 1500;

		System.out.println(a.firstName);
		System.out.println(a.lastName);
		System.out.println(a.age);

		a.displayName();
		a.displaysalary();

	}

}

class Student {

	String firstName;
	String lastName;
	int age;

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}            
}

class TeacherC extends Student {
	int salary;

	public void displaysalary() {
		System.out.println(this.salary);

	}

}