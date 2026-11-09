//Use an interface to define ADT List
public interface ListInterface {
	//All operations that we need to implement
	public boolean isEmpty();
	
	public int size();
	
	public Object get(int index)
			throws ListIndexOutOfBoundsException;
	
	public void add(int index, Object item)
		throws ListIndexOutOfBoundsException;
	
	public void remove(int index)
		throws ListIndexOutOfBoundsException;
	
	public void removeAll();
}
