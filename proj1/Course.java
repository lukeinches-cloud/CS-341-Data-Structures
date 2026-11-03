package proj1;
import java.util.ArrayList;

public class Course {
	private String name;
	private int registrationCode;
	public static final int DEFAULT_MAX_STUDENTS = 35;
	private int maxStudents;
	private Instructor instructor;
	private int studentNum;
	private ArrayList<Student> students;
	
	public Course(String name, int registrationCode)
	{
		this.name = name;
		this.registrationCode = registrationCode;
		this.maxStudents = DEFAULT_MAX_STUDENTS;
		this.students = new ArrayList<>();
		this.studentNum = 0;
	}
	
	public boolean search(int id)
	{
		for(Student s : students) {
			if(s.getId() == id) {
				return true;
			}
		}
		
		return false;
	}

	public Instructor getInstructor() {
		return instructor;
	}
	
	public void addStudent(Student s) throws CourseException
	{
		if(studentNum >= maxStudents) {
			throw new CourseException("Course is full");
		}
		if(search(s.getId())) {
			throw new CourseException("Student is already enrolled");
		}
		students.add(s);
		studentNum++;
	}
	
	public void removeStudent(Student s) throws CourseException
	{
		if(!(search(s.getId()))) {
			throw new CourseException("Student is not enrolled");
		}
		students.remove(s);
		studentNum--;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public String getName() {
		return name;
	}

	
}
