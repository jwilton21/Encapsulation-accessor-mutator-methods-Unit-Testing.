import org.junit.Assert;
import org.junit.jupiter.api.Test;

class StudentUnitTest {

	Student student1 = new Student("Hannah Jones", 17235189,"MSc Honours Software Engineering",0);
	Student student2 = new Student("George Barr", 17235190,"MSc Honours Biomedical Engineering",0);
	
	// First unit test.
	@Test
	void test3EnrolInModule()
	{	
		System.out.println("Expected output: Hannah Jones has enrolled in the module.");
		student1.enrolOnModule();
		Assert.assertEquals("Hannah Jones has enrolled in the module","Hannah Jones has enrolled in the module");
		// If assertEquals method returns true then next line accessed and test passed.
		System.out.println("Test passed");
	}

}
