// Object class.
public class Student 
{	// Only accessible within parameters of Student class. 
	public String name;
	private int studentNumber;
	private double dateOfBirth;
	private int age;


	// Setting up the object.
	public Student(String studentName, int studentNumber, double dateOfBirth, int age)
	{	// Assign.
		this.name = studentName;
		this.studentNumber = studentNumber;
		this.dateOfBirth = dateOfBirth;
		this.age = age;

	}

	// GETTER
	public String getStudentName()
	{
		return name;

	}
	// GETTER
	public int getStudentNumber()
	{
		return studentNumber;

	}

	// GETTER
	public double getAge()
	{
		return age;
	}


	// SETTER
	public void setStudentName(String studentName)
	{
		this.name = studentName;

	}
	// SETTER
	public void setAge(int age)
	{
		this.age = age;
	}



	// SETTER
	public void setStudentNumber(int studentNumber)
	{
		this.studentNumber = studentNumber;
	}

	// Class methods.
	public void enrolOnModule(String name)
	{	
		System.out.println( name +"Has enrolled on the module");

	}

	public void takeExam()
	{
		System.out.println(studentNumber + " has taken the exam");

	}

}



