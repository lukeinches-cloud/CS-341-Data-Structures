package proj1;

public class Proj1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instructor instructor1 = new Instructor("Collin Engstrom", 11234, "Computer Science");
		Course course1 = new Course("Data Structures", 341);
		Student student1 = new Student("Luke Inches", 21234);
		Student student2 = new Student("Lucas Inches", 31234);
		Student student3 = new Student("John Smith", 41234);
		Student student4 = new Student("Alice Smith", 51234);
		Student student5 = new Student("Bob Smith", 61234);
		Student student6 = new Student("Charlie Smith", 71234);
		Student student7 = new Student("Diana Johnson", 81234);
		Student student8 = new Student("Edward Brown", 91234);
		Student student9 = new Student("Fiona Davis", 101234);
		Student student10 = new Student("George Wilson", 111234);
		Student student11 = new Student("Hannah Miller", 121234);
		Student student12 = new Student("Ian Moore", 131234);
		Student student13 = new Student("Julia Taylor", 141234);
		Student student14 = new Student("Kevin Anderson", 151234);
		Student student15 = new Student("Laura Thomas", 161234);
		Student student16 = new Student("Michael Jackson", 171234);
		Student student17 = new Student("Nina White", 181234);
		Student student18 = new Student("Oscar Harris", 191234);
		Student student19 = new Student("Paula Martin", 201234);
		Student student20 = new Student("Quentin Clark", 211234);
		Student student21 = new Student("Rachel Lewis", 221234);
		Student student22 = new Student("Samuel Walker", 231234);
		Student student23 = new Student("Tina Hall", 241234);
		Student student24 = new Student("Ulysses Allen", 251234);
		Student student25 = new Student("Victoria Young", 261234);
		Student student26 = new Student("William King", 271234);
		Student student27 = new Student("Xena Wright", 281234);
		Student student28 = new Student("Yusuf Scott", 291234);
		Student student29 = new Student("Zoe Green", 301234);
		Student student30 = new Student("Aaron Baker", 311234);
		Student student31 = new Student("Bella Adams", 321234);
		Student student32 = new Student("Carter Nelson", 331234);
		Student student33 = new Student("Daisy Hill", 341234);
		Student student34 = new Student("Ethan Ramirez", 351234);
		Student student35 = new Student("Grace Campbell", 361234);
		Student student36 = new Student("Henry Mitchell", 371234);
		course1.setInstructor(instructor1);
		Student[] allStudents = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10, student11, student12, student13, student14, student15, student16, student17, student18, student19, student20, student21, student22, student23, student24, student25, student26, student27, student28, student29, student30, student31, student32, student33, student34, student35, student36};
		for(Student s : allStudents) {
			try {
				course1.addStudent(s);
			}
			catch(CourseException e){
				System.out.println("Error: " + e);
			}
		}
		
		for(int i=0; i<2; i++) {
			try {
				course1.removeStudent(student35);
			}
			catch(CourseException e) {
				System.out.println("Error: " + e);

			}
		}
		
		try {
			course1.addStudent(student1);
		}
		catch(CourseException e) {
			System.out.println("Error: " + e);

		}
		
		
		
		if(course1.search(student2.getId())) {
			System.out.println(student2.toString()+" is enrolled");
		}
		
		System.out.println((course1.getInstructor()).toString() + " teaches " + (course1.getInstructor()).getDepartment() + ": " + course1.getName() );
		
		student1.setGradePoints(58);
		student1.setCredNum(15);
		
		System.out.printf(student1.toString() + " has a GPA of: %.2f%n", student1.getGPA());
	}

}
