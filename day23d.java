
public class day23d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Professor p = new Professor ("English");
		p.displaySubjects();
		p.xyz();
		

	}

}


class TeacherT {
	
	protected String subject;
	
	public TeacherT (String sub) {
		this.subject = sub;
		
	}
	
	public void xyz() {
		System.out.println("teacher xyz");
	}
	
}

class Professor extends TeacherT {

	public Professor(String sub) {
		super(sub);
		
	}
	
	public void displaySubjects() {
		System.out.println(this.subject);
		System.out.println(super.subject);
	}   
	
	public void xyz () {
		System.out.println("professor xyz");
		super.xyz();
	}
	

	
}
