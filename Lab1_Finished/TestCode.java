public class TestCode 
{

	public static void main(String[] args) 
	{
		System.out.println("This is the main method.");
		
		/* Make a SimpleSphere object */
		SimpleSphere ss = new SimpleSphere();
		ss.printRadius();
		System.out.println("From the main method, radius is " + ss.getRadiusInt());
		
		/* TODO: Make another sphere with your own radius */
		SimpleSphere ss2 = new SimpleSphere(2);
		System.out.println("Volume is: " + ss2.getVolume());
		
		/* Class inheritance */
		ColoredSphere cs = new ColoredSphere();
		System.out.println("ColoredSphere radius: " + cs.getRadius());
		System.out.println("Color of sphere: " + cs.getColor());

	}

}
