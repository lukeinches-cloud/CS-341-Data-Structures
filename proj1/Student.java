package proj1;

public class Student extends Person {
	private int credNum;
	private int gradePoints;
	
	public Student(String name, int id)
	{
		super(name, id);
		credNum=0;
		gradePoints=0;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		
	if(!(obj instanceof Student)) {
		return false;
	}
	
	return(this.getId() == ((Student)obj).getId());
	
	}
	
	public double getGPA()
	{
		return((double)gradePoints/credNum);
	}

	public int getCredNum() {
		return credNum;
	}
	public void setCredNum(int credNum) {
		this.credNum = credNum;
	}

	public double getGradePoints() {
		return gradePoints;
	}

	public void setGradePoints(int gradePoints) {
		this.gradePoints = gradePoints;
	}

}