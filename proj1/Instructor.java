package proj1;

public class Instructor extends Person {
	private String department;
	
	public Instructor(String name, int id, String department)
	{
		super(name, id);
		this.department=department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	

}
