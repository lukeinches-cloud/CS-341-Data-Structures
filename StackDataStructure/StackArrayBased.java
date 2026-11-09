
public class StackArrayBased implements StackInterface {
	private static final int MAX_ITEMS = 25;
	private Object items[];   // To hold everything
	private int numItems; 	// To track how many things in list
	
	// TODO: Initialize the member variables using default
	//			constructor.
	public StackArrayBased()
	{
		/* Your code here */

		items = new Object[MAX_ITEMS];
		numItems = 0;

	}
	
	// TODO: Write a function to determine if there's anything
	//			in the stack.
	public boolean isEmpty()
	{
		/* Your code here */
		return(numItems == 0);
	}

	
	//TODO: Write a function that returns the size of stack. 
	//      See interface for signature.
	
	public int size()
	{
		return this.numItems;
	}


	
	//TODO: Write a function that removes all items from stack
	
	public void clear()
	{
		items = new Object[MAX_ITEMS];
		numItems = 0;
	}


	
	//TODO: Write a function that adds an item to stack.
	//			Should throw an exception if no room left in stack.
	public void push(Object s) throws StackException
	{
		// TODO: Check if list is already full
		if(numItems == MAX_ITEMS)
		{
			/* Throw exception here if it is */
			throw new StackException("Stack is full");
		}
				
		// items remain
		else
		{
			// TODO: Store new item
			items[numItems] = s;
			numItems++;


		}
	
	}
	
	//TODO: Write a function that removes an item from top of stack.
	public Object pop() throws StackException
	{
		// TODO: Check situation where stack is empty
		if(numItems < 1)
		{
			/* TODO: Throw an exception here if it is */
			throw new StackException("Cannot pop item. Stack is empty!!");
		}
		
		else
		{
			// TODO: return the item
			Object tmp = items[numItems-1];
			items[numItems-1] = null;
			numItems--;
			return tmp;
		}
		
		
	}
	
	//TODO: Write a function that returns, but doesn't remove, an item from top of stack.
	public Object peek() throws StackException
	{
		// TODO: Check situation where stack is empty
		if(numItems < 1)
		{
			/* TODO: Throw an exception here if it is */
			throw new StackException("Cannot peek item. Stack is empty!!");

			
		}
		
		else
		{
			// TODO: Return item on top of stack
			return items[numItems-1];
		}
		
		
	}
	
	
	// To help us debug the code--converts all elements to single string
	@Override
	public String toString()
	{
		String s = "";
		
		for(int i = 0; i < size(); i++)
		{
			s += (items[i] + " ");
		}
		
		return s;
	}

}
