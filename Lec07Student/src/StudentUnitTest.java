
import org.junit.Test;

public class StudentUnitTest
{	@Test
	public void testEnrollOnModule()
{
	Student student1 = new Student("Hannah Jones", 17235189,21031992,27);
	Student student2 = new Student("Harry Potter", 	17235190,14011991,29);
	String student1Expected = "Hannah Jones has enrolled on the module";
	String student1Actual;

	System.out.println("Test output: ");
	student1.enrolOnModule("Hannah Jones ");
	System.out.println("Expected output: Hannah Jones has enrolled on the module");
	
	// TODO test case methods using assertEquals instead.

}

















}








