//Use an interface to define ADT List
public interface StackInterface {
	//All operations that we need to implement
	public boolean isEmpty();
	
	public int size();
	
	public void clear();
	
	public void push(Object item)
			throws StackException;
	
	public Object pop()
			throws StackException;
	
	public Object peek()
		throws StackException;
	

}
