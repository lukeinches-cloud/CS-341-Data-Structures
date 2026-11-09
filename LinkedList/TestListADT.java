
public class TestListADT {

	public static void main(String[] args) {
		// Test our ADT
		
		
		// Create new list object
		ListReferenceBased aList = new ListReferenceBased();
		
		// Try adding to bad index
		
		try
		{
			aList.add(1, Integer.valueOf(1));

		}
		
		catch(ListIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		// Add some junk to the list
		for(int i = 0; i < 12; i++)
		{
			try
			{
				aList.add(i, Double.valueOf(i));
			}
			
			catch(ListIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
		}
		
		System.out.print("After populating list: ");
		System.out.println(aList);
		
		// Remove an item -- out of bounds
		
		try
		{
			aList.remove(15);
		}
		
		catch(ListIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		// Remove an item -- in bounds
		try
		{
			aList.remove(3);
		}
		
		catch(ListIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		System.out.print("After removing item: ");
		System.out.println(aList);
		
	}		
}
