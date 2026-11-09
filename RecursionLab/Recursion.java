
public class Recursion {
	
	// Find the factorial of an integer by using recursion
	public static int fact(int n)
	{
		// TODO: Add check for invalid numbers
		if(n < 0)
		{
			return -1;
		}
		
		// TODO: Determine base case
		else if(n == 0 || n== 1)
		{
			// TODO: add correct return statement
			return 1;
		}
		
		// TODO: Determine recurrence relation
		//  This is where the recursion is called
		else
		{
			return n * fact(n-1);
		}
		
	}
	
	// Reverse a string with recursion
	public static void reverse(String a)
	{
		// TODO: Determine base case
		//   Hint: use the string's compareTo() method.
		//         Compare to the empty string
		if(a.compareTo("") == 0) {
			System.out.println();
		}
		
		else {
		reverse(a.substring(1));
		System.out.print(a.charAt(0));
		}
		
		
		
		
		// TODO: Determine recurrence relation
		//  This is where the recursion is called
		//  Hint: It's also where you'll need to print using
		//        the string's charAt() method.
		
	}
	
	
	//Pre: Passes in number of months as an int
	
	// Solve the rabbit problem with recursion
	public static int rabbitPairCt(int n)
	{
		// TODO: Add check for invalid numbers
		if(n <= 0)
		{
			return -1;
			// TODO: Add an appropriate statement here
		}
	
		else if(n == 1 || n == 2)
		{
			return 1;
		}
		
		else
		{
			return rabbitPairCt(n-1) + rabbitPairCt(n-2);
		}
		// TODO: Establish base case
		//   Hint: How many pairs are there initially? For how long?
		
		// TODO: Establish recurrence relation
		
	}

}
