import java.lang.Math;
public class SimpleSphere 
{
	private double radius;
	public static final double DEFAULT_RADIUS = 1;
	
	public SimpleSphere()
	{
		this.radius = DEFAULT_RADIUS;
		//TODO: Set member variable radius to the default value
	}
	
	public SimpleSphere(double r)
	{
		this.radius= r;
		//TODO: Define this constructor to take in an initial value for radius
	}
	
	public void printRadius()
	{
		System.out.println(radius);
		//TODO: Print the radius
	}
	
	public double getRadius()
	{
		return radius;
	}
	//TODO: Define a function to return the radius
	
	public int getRadiusInt()
	{
		return(int) radius;
	}

	//TODO: Define a function to return the radius as an int
	public double getVolume()
	{
		double RadiusCubed = radius;
		for(int i = 0; i < 2; i++)
		{
			RadiusCubed *= radius;
		}
		return (4.0/3.0)*Math.PI*RadiusCubed;
	}

	//TODO: Define a function to return the volume of the sphere
	// HINT: You'll need to cube the radius. Use a for-loop to do this.
	
}
