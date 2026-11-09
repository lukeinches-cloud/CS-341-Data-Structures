package proj1;

public class Person {
	private String name;
	private int id;
	
	public Person()
	{
		name="";
		id=0;
	}
	
	public Person(String name, int id)
	{
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	
	@Override
	public String toString()
	{
		return name + ": " + id;
	}

}
