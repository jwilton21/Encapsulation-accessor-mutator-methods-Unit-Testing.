
public class Student_Tester {

	public static void main(String[] args) {
		// Make new student objects.
		// Set information.
		Student student1 = new Student("Hannah Jones", 17235189,"Default",0);
		Student student2 = new Student("George Barr", 	17235190,"MSc Honours English Literature",0);
		
		// Object properties.
		student1.setCourse("BSc Honours Software Engineering");
		student1.setGradeAverage(2.1);
		student1.setAge(26);
		student1.enrolOnModule();
		student1.takeExam();
		System.out.println();

		// Student 2, invoke class  methods.
		student2.enrolOnModule();
		student2.takeExam();
		System.out.println();

	}

}
