
public interface ListInterface {
	public boolean isEmpty();
	public int size();
	public void add(int index, Object item)
		throws ListException;
	public Object get(int index)
		throws ListException;
	public void removeAll();
	public void remove(int position)
		throws ListException;
}
