
public class ListReferenceBased implements ListInterface {
	// Member variables to keep track of list info
	private Node head;
	private int numItems; //Keep track of items
	
	//TODO: Make a default constructor to initialize 
	//		member variables.
	public ListReferenceBased()
	{
		numItems= 0;
		head = null;
	}


	
	//TODO:	Create and implement isEmpty() function.
	public boolean isEmpty() 
	{
		return(numItems==0);
	}

	
	//TODO:	Create and implement size() function.
	public int size()
	{
		return numItems;
	}

	
	//TODO: Implement function to return node at
	//		location specified by index.
	private Node find(int index)
		throws ListIndexOutOfBoundsException
	{
		// Check if index is out of bounds.
		if(index >= numItems || index < 0)
		{
			throw new ListIndexOutOfBoundsException("Index in find is out of bounds!");
		}
		
		else
		{
			//TODO:	Advance thru linked list until index
			//		is reached.
			Node curr = head;
			
			for(int i = 0; i < index; i++) {
				curr = curr.next;
			}

			
			//TODO:	Return item at index.
			return curr;

		}
	}
	
	//TODO:	Implement get() function that will
	public Object get(int index)
		throws ListIndexOutOfBoundsException
	{
		//Check to make sure we're in bounds.
		if(index >= 0 && index < numItems)
		{
			//TODO:	Find the node at index and return
			//		item stored by that node.
			Node tmp = find(index);
			return tmp.item;

		}
		
		//Otherwise, we're out of range.
		else
		{
			//TODO:	Add correct exception statement here.
			throw new ListIndexOutOfBoundsException("Index in get is out of bounds!");
			
		}
	}
	
	//TODO:	Implement function that will add an Object
	//		at index.
	public void add(int index, Object item)
			throws ListIndexOutOfBoundsException 
	{
		//TODO:	Check to make sure index isn't out of range
		if(index >= 0 && index <= numItems)
		{
			// TODO: Check if we're at beginning of list
			if(index==0)
			{
				//TODO: If so, add node there.
				Node tmp = new Node(item,head);
				
				head = tmp;
				
			}
			
			else
			{
				//TODO: Otherwise, need to add node at index.
				Node prev = find(index-1);
				Node tmp = new Node(item, prev.next);
				prev.next = tmp;

			}
			
			//TODO:	Don't forget to keep track of number items in list.
			numItems++;
			
		}
		
		//Otherwise, list index is out of bounds
		else
		{
			//TODO: Add correct exception statement here.
			throw new ListIndexOutOfBoundsException("Index in add is out of bounds!");

		}
		
	}
	
	//TODO:	Implement function that'll remove node at index.
	public void remove(int index)
		throws ListIndexOutOfBoundsException
	{
		if(index>=0 && index <=numItems)
		{
			//TODO: What if index is at beginning of list?
			if(index==0)
			{
				//TODO: Add code here to handle removing first node.
				head = head.next;

			}
			
			else
			{
				//TODO: Otherwise, how to deal with removing a node?
				Node prev = find(index-1);
				prev.next = prev.next.next;

			}
			
			//TODO:	Don't forget to keep track of number of list items!
			numItems++;
			
		}
		
		else
		{
			throw new ListIndexOutOfBoundsException("Index out of bounds on remove.");
		}

	}
			
	//TODO:	Implement function that removes all from the list.
	public void removeAll()
	{
		numItems= 0;
		head = null;
	}
	
	// toString method will return String object for this list.
	public String toString()
	{
		String outString = "";
		for(Node curr = head; curr != null; curr=curr.next)
		{
			outString += curr.toString() + ", ";
		}
		
		return outString;
	}
	
}