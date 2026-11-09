
// Make this package-private
class Node {
	//TODO: Add two member variables to keep track of
	//		everything for the current node.
	Object item;
	Node next;
	
	Node()
	{
		item = null;
		next = null;
	}

	
	//Constructor that will initialize based on Object newItem
	Node(Object newItem)
	{
		item = newItem;
		next = null;
	}
	
	//TODO:	Add a constructor that will initialize based on
	//		two arguments.
	
	Node(Object newItem, Node next)
	{
		this.item = newItem;
		this.next = next;
	}

	
	// toString() method will return String object for Node's item.
	public String toString()
	{
		return item.toString();
	}
}
