public class ColoredSphere extends SimpleSphere 
{
	
	private String color;
	private final String DEFAULT_COLOR = "Black";
	public ColoredSphere()
	{
		//TODO: Finish this default constructor
		super();
		this.color = DEFAULT_COLOR;//Calls superclass default constructor--must be done before all else
	}
	
	public ColoredSphere(double radius, String color)
	{
		super(radius);
		this.color = color;
	}
	//TODO: Define a function to get the sphere's color
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}

}