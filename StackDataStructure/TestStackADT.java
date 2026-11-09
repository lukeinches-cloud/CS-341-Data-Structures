
public class TestStackADT {

	public static void main(String[] args) {
		// Test our ADT
		
	
		// Create new stack object
		StackArrayBased myStack = new StackArrayBased();

			
		// Add some junk to the list
		for(int i = 0; i < 30; i++)
		{
			try
			{
				myStack.push(Double.valueOf(i));
			}
			
			catch(StackException e)
			{
				System.out.println(e);
			}
		}
		
		System.out.print("After populating stack: ");
		System.out.println(myStack);
		
		
				// Pop an item
		try
		{
			System.out.println("Popped item: " + myStack.pop());
		}
		
		catch(StackException e)
		{
			System.out.println(e);
		}
		
		System.out.print("After popping item: ");
		System.out.println(myStack);
		
		
		
		// Peek at item
		try
		{
			System.out.println("Peek item: " + myStack.peek());
		}
		
		catch(StackException e)
		{
			System.out.println(e);
		}
		
		
		
		// Clear stack
		myStack.clear();
		
		System.out.print("After clearing: ");
		System.out.println(myStack);
		
		// Now, try popping
		try
		{
			System.out.println(myStack.pop());
		}
		
		catch(StackException e)
		{
			System.out.println(e);
		}
		

	}		
}
