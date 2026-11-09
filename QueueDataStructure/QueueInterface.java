//Use an interface to define ADT Queue
public interface QueueInterface {
	//All operations that we need to implement
	public boolean isEmpty();
	
	public int size();
	
	public void clear();
	
	public void enqueue(Object item)
			throws QueueException;
	
	public Object dequeue()
			throws QueueException;
	
	public Object peek()
		throws QueueException;
	

}
