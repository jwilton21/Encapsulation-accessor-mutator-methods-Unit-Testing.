
public class Student_Tester {

	public static void main(String[] args) {
		// Make new student objects.
		// Set information.
		Student student1 = new Student("Hannah Jones", 17235189,21031992,27);
		Student student2 = new Student("Harry Potter", 	17235190,14011991,29);
		
		
		student1.enrolOnModule(null);
		student1.takeExam();
		System.out.println();

		// Student 2, invoke class  methods.
		student2.enrolOnModule(null);
		student2.takeExam();
		System.out.println();
		
		// Change name.
		student1.setStudentName("Hannah Riley");
		
		// Have a birthday
		student1.setAge(28);
		student1.getStudentName();
	}

}
