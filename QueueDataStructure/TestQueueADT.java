
public class TestQueueADT {

	public static void main(String[] args) {
		// Test our ADT
	
		// Create new queue object
		QueueArrayBased myQ = new QueueArrayBased();

		
		// Add some junk to the queue
		for(int i = 0; i < 30; i++)
		{
			try
			{
				myQ.enqueue(Integer.valueOf(i));
			}
			
			catch(QueueException e)
			{
				System.out.println(e);
			}
		}
		
		System.out.print("After populating queue: ");
		System.out.println(myQ);
		
		
		
		// Dequeue an item
		try
		{
			System.out.println("Dequeued item: " + myQ.dequeue());
		}
		
		catch(QueueException e)
		{
			System.out.println(e);
		}
		
		System.out.print("After dequeueing item: ");
		System.out.println(myQ);
		
		
		
		// Dequeue a few more items
		for(int i = 0; i < 3; i++) 
		{
			try
			{
				System.out.println("Dequeued item: " + myQ.dequeue());
			}
			
			catch(QueueException e)
			{
				System.out.println(e);
			}
		}
		
		System.out.print("After dequeueing items: ");
		System.out.println(myQ);
		
		for(int i = 25; i < 30; i++)
		{
			try
			{
				myQ.enqueue(Integer.valueOf(i));
			}
			
			catch(QueueException e)
			{
				System.out.println(e);
			}
		}
		
		System.out.print("After populating queue: ");
		System.out.println(myQ);

		
		
		
		// Peek at item
		try
		{
			System.out.println("Peek item: " + myQ.peek());
		}
		
		catch(QueueException e)
		{
			System.out.println(e);
		}
		System.out.print("After peeking item: ");
		System.out.println(myQ);
		
		
		
		
		
		// Clear queue
		myQ.clear();
		
		System.out.print("After clearing: ");
		System.out.println(myQ);
		
		// Now, try popping
		try
		{
			System.out.println(myQ.dequeue());
		}
		
		catch(QueueException e)
		{
			System.out.println(e);
		}
		



	}		
}
