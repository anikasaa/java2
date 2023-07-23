
public class day20R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentA Anisha = new StudentA ();
		System.out.println(Anisha.firstName);
		System.out.println(Anisha.lastName);
		System.out.println(Anisha.ssn);
		Anisha.displayName();
		
		
		
		TeacherA AnishaA = new TeacherA();
		System.out.println(AnishaA.salary);
		System.out.println(AnishaA.firstName);        
		System.out.println(AnishaA.lastName);
		System.out.println(AnishaA.ssn);
		
		AnishaA.displaySalary();
		Anisha.displayName();
		
		
	}

}



class StudentA {
	String firstName = "Anisha";
	String lastName = "Tuladhar";
	int ssn = 1111;
	
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}



class TeacherA extends StudentA {
	int salary = 2000;
	public void displaySalary() {
		System.out.println(this.salary);
	}
}