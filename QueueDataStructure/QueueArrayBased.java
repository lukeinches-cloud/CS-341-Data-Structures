
public class QueueArrayBased implements QueueInterface {
	private static final int MAX_ITEMS = 25;
	private Object items[];   // To hold everything
	private int numItems; 	// To track how many things in list
	private int front;
	private int back;
	
	// TODO: Initialize the member variables using default
	//			constructor.
	public QueueArrayBased()
	{
		/* Your code here */
		items = new Object[MAX_ITEMS];
		numItems = 0;
		front = 0;
		back = MAX_ITEMS-1;

	}
	
	// TODO: Write a function to determine if there's anything
	//			in the queue.
	public boolean isEmpty()
	{
		/* Your code here */
		return (numItems == 0);
	}

	
	//TODO: Write a function that returns the size of queue. 
	//      See interface for signature.

	public int size()
	{
		return numItems;
	}

	
	//TODO: Write a function that removes all items from queue
	
	public void clear()
	{
		items = new Object[MAX_ITEMS];
		numItems = 0;
		front = 0;
		back = MAX_ITEMS-1;
	}

	
	//TODO: Write a function that adds an item to queue.
	//			Should throw an exception if no room left in queue.
	public void enqueue(Object s) throws QueueException
	{
		// TODO: Check if list is already full
		if(numItems == MAX_ITEMS)
		{
			throw new QueueException("Que is full");
		}
				
		// Space remains
		else
		{
			// TODO: Store new item
			back = (back+1)%MAX_ITEMS;
			items[back] = s;
			numItems++;

		}
	
	}
	
	//TODO: Write a function that removes an item from head of queue.
	public Object dequeue() throws QueueException
	{
		if(numItems == 0)
		{
			throw new QueueException("Que is empty");
		}
				

		else
		{
			Object tmp = items[front];
			items[front] = null;
			front = (front+1)%MAX_ITEMS;
			numItems--;
			return tmp;

		}

	}

	
	
	//TODO: Write a function that returns, but doesn't remove, an item from head of queue.
	public Object peek() throws QueueException
	{
		if(numItems == 0)
		{
			throw new QueueException("Que is empty");
		}
		return items[front];
	}

	
	
	// To help us debug the code--converts all elements to single string
	@Override
	public String toString()
	{
		String s = "\n";
		
		for(int i = 0; i < size(); i++)
		{
		    s += ((front+i)%MAX_ITEMS) + ": " + items[(front+i)%MAX_ITEMS] + " " + "\n";
		}
		
		return s;
	}

}
