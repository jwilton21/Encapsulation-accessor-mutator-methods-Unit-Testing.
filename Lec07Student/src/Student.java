// Object class.
public class Student 
{	// Only accessible within parameters of Student class. 
	private String studentName;
	private int studentNumber;
	private String course;
	private double gradeAverage;
	private double dateOfBirth;
	private int age;

	// CONSTRUCTORS- ways to initialise our objects. Overloading- different constructors with different parameters 
	// for different use cases; i.e. student fills form in with no name- student fills in with just name. Student fills in form with all parameters.
	//public Student()
	{

	}


	public Student(String studentName)
	{

	}
	// Setting up the object with the full parameter list.
	public Student(String studentName, int studentNumber,String course, double gradeAverage)
	{	// Refer to current object, avoid naming conflict- so it's assigned at class level.
		this.studentName = studentName;
		this.studentNumber = studentNumber;
		this.course = course;
		this.gradeAverage = gradeAverage;
	}

	// GETTER- retrieves information and returns back to class variable.
	// Return studentName.
	public String getStudentName()
	{
		return studentName;

	}
	// GETTER
	// Return studentNumber.
	public int getStudentNumber()
	{
		return studentNumber;

	}

	// GETTER
	// Return course.
	public String getCourse(String course)
	{	
		return course;

	}

	// GETTER
	// Return gradeAverage.
	public double getGradeAverage(Double gradeAverage)
	{
		return gradeAverage;
	}

	// GETTER
	public double getAge()
	{
		return age;
	}
	// SETTER
	// Mutator, refer to current object, avoid naming conflict, assign gradeAverage to class variable using .this
	public void setGradeAverage(double gradeAverage)
	{
		this.gradeAverage = gradeAverage;
	}

	// SETTER
	public void setStudentName(String studentName)
	{
		this.studentName = studentName;

	}
	// SETTER
	public void setAge(int age)
	{
		this.age = age;
	}

	// SETTER
	public void setCourse(String course)
	{
		this.course = course;
	}

	// SETTER
	public void setStudentNumber(int studentNumber)
	{
		this.studentNumber = studentNumber;
	}

	// Class methods.
	public void enrolOnModule()
	{
		System.out.println(studentName +" has enrolled on the module");
	}

	public void takeExam()
	{
		System.out.println(studentNumber + " has taken the exam");

	}
	// Method to call setter. Not changing instance variable value.
	public void haveABirthday()
	{
		setAge(age ++);
	}
}

