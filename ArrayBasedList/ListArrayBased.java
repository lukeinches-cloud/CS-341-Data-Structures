
public class ListArrayBased implements ListInterface {
	private static final int MAX_ITEMS = 25;
	private Object items[];   // To hold everything
	private int numItems; 	// To track how many things in list
	
	// TODO: Initialize the member variables using default
	//			constructor.
	public ListArrayBased()
	{
		/* Your code here */
		//This is the equivilent of the creatNewList
		items = new Object[MAX_ITEMS];
		numItems = 0;
	}
	
	public boolean isEmpty()
	{
		if(numItems > 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	// TODO: Write a function to determine if there's anything
	//			in the list

	
	//TODO: Write a function that returns the size of list
	public int size()
	{
		/* Your code here. */
		return numItems;
	}
	
	
	//TODO: Write a function that removes all items from list
	public void removeAll()
	{
		items = new Object[MAX_ITEMS];
		numItems = 0;
	}


	
	//TODO: Write a function that adds an item to list.
	//			Should throw an exception if no room left in list.
	public void add(int index, Object s) throws ListException
	{
		// List is full
		if(numItems== MAX_ITEMS)
		{
			/* Throw exception here */
			throw new ListException("Cannot add item. List is already full!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
				
		// index is somewhere in list
		if(index >= 0 && index <= numItems)
		{
			// Shift old items
			for(int i = numItems-1; i>= index; i--)
			{
				items[i+1]=items[i];
			}
			
			items[index] = s;
			numItems++;
			// Store new item

		}
		
		// Otherwise, we're out of range
		else
		{
			/* Throw exception here */
			throw new ListException("Cannot add item. Requested index is out of bounds.");
		}	
	}
	
	//TODO: Write a function that returns item at specified index.
	public Object get(int index) throws ListException
		{
		if(index<0 || index >= numItems)
			{
			throw new ListException("Can't retrieve item. Requested index out of bounds.");
			}
		
		else
			{
			/* Return item of interest */
			return items[index];
			}
		}
	
	//TODO: Write a function that removes an item at specified index.
	public void remove(int index)
		throws ListException
	{
		// Check situation where index is out of range
		if(index<0 || index >= numItems)
		{
			throw new ListException("Can't retrieve item. Requested index out of bounds.");
		}
		
		else if(index == numItems-1) {
			numItems--;
		}
		
		else
		{
			/* Shift items here */
			for(int i = index; i>=numItems-1; i++) {
				items[i]=items[i+1];
			}
			// Need to decrement number of items in list
			numItems--;
		}
		
		
	}
	
	
	// To help us debug the code--converts all elements to single string
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
