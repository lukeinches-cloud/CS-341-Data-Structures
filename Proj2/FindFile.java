import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class FindFile {
	
	//Pre: A String that is the path of an actual directory in the file system must be passed in
	//Post: Returns a sorted array list of the names of the subdirectories as Strings of the directory whose name was passed in
	private static ArrayList<String> getDirs(String currentDir)
	{
		//TODO: Create File object to hold directory contents
		File dir = new File(currentDir);
		// Creates a File object using the path that we specified in main
				
		//TODO: Do a directory listing (see File's documentation on 
		//		how to do this. You'll want to keep directory listing 
		//		in a structure like an array for now. You'll iterate
		//		through it later.
		
		File[] listing = dir.listFiles();
		// An array of file objects is created by calling the listFiles method which creates a file object out of every file and subdirectory in the directory it is being called on 
		
		//TODO: Create a different structure to hold only list of directories
		//		Hint: Is there a structure I might've mentioned
		//		in the specifications PDF that can dynamically grow
		//		based on the # of items? 
		//		Hint2: See function's return type. :)
		
		ArrayList<String> dirs = new ArrayList<String>();
		// Creates an array list of Strings that we will use later
		
		//TODO: If directory listing results in null for the array
		//		(i.e., your first data structure), simply
		//		return the second (empty) data structure.
		
		if(listing == null) {
			return dirs;
		}
		// If the file object that listFiles is called on is a file and not a directory then listing will be null and it will return our array list of strings dirs with nothing in it

		//Note that this for-loop iterates through your first
		//array structure and saves items if they're a directory.
		//You'll hold these in your second data structure that 
		//dynamically grows.	
		
		// This loop iterates through all of the file objects in listing and adds the directories names as Strings to our empty array list dirs
		for(int i = 0; i < /* num items in directory listing */ listing.length; i++)
		{
						
			// TODO: If current item is hidden system file 
			//		(starts with "."), skip it. 
			
			if((listing[i].getName()).charAt(0) == '.') {
				continue;
			}
			//skips past all hidden system files
			
			// TODO: If current item is directory, add to your structure
			//		created above for holding the directories. 
			
			if(listing[i].isDirectory()) {
				dirs.add(listing[i].getName());
			}
			// Checks if the file object in listing is a directory and if it is adds its name to our array list of strings dirs
			
		}
		
		//TODO: Sort dirs in ascending order, since
		// the system puts them in a weird order.
		
		Collections.sort(dirs);
		//Sorts all of the subdirectories names contained by dirs into alphabetical order so that we search them in the right order

		//TODO: Return data structure holding the directories list.
		
		return dirs;
		//returns the array list of all the names of the subdirectories
				
	}
	
	//Pre: A String that is the path of an actual directory in the file system must be passed in
	//Post: Returns an array list of the names of the files as Strings of the directory whose name was passed in
	private static ArrayList<String> getFiles(String currentDir)
	{
		//TODO: Create File object to hold directory contents
		
		File dir = new File(currentDir);
		// Creates a File object using the path that we specified in main
		
		//TODO: Do a directory listing (see File's documentation on 
		//		how to do this. You'll want to keep directory listing 
		//		in a structure like an array for now. You'll iterate
		//		through it later.
		
		File[] listing = dir.listFiles();
		// An array of file objects is created by calling the listFiles method which creates a file object out of every file and subdirectory in the directory it is being called on 

		
		//TODO: Create a different structure to hold only list of files.
		//		Hint: Is there a structure I might've mentioned
		//		in the specifications PDF that can dynamically grow
		//		based on the # of items? 
		//		Hint2: See function's return type. :)
		
		ArrayList<String> files = new ArrayList<String>();
		// Creates an array list of Strings that we will use later

		
		//TODO: If directory listing results in null for the array
		//		(i.e., your first data structure), simply
		//		return the second (empty) data structure.
		
		if(listing == null) {
			return files;
		}
		// If the file object that listFiles is called on is a file and not a directory then listing will be null and it will return our array list of strings dirs with nothing in it

		
		//Note that this for-loop iterates through your first
		//array structure and saves items if they're a directory.
		//You'll hold these in your second data structure that 
		//dynamically grows.
		
		// This loop iterates through all of the file objects in listing and adds the file names as Strings to our empty array list dirs
		for(int i = 0; i < /* num items in directory listing */listing.length; i++)
		{
			// TODO: If current item is hidden system file 
			//		(starts with "."), skip it. 
			
			if((listing[i].getName()).charAt(0) == '.') {
				continue;
			}
			//skips past all hidden system files
			
			// TODO: If current item is file, add to your structure
			//		created above for holding the files. 
			
			if(listing[i].isFile()) {
				files.add(listing[i].getName());
			}
			// Checks if the file object in listing is a file and if it is adds its name to our array list of strings dirs

			
		}

		//TODO: Return data structure holding the files list.
		
		return files;
		//returns the array list of all the names of the files
		
	}
	
	//Pre: A String that is the name of the file you are looking for must be passed in along with a String that is the the path of an actual directory in the file system
	//Post: A empty String is returned if the file is not found. If the file is found a String that is the files path is returned
	public static String recursiveFind(String fileToFind, String thisDir)
	{
		String pathToReturn = "";
		//Creates an empty String that we will use to store and return the file path
		
		//TODO: Create two ArrayList data structures
		//		To hold (1) your list of directories and
		//				(2) your list of files. 
		//		You'll need to call your functions defined above to
		//		populate these.
		
		ArrayList<String> dirs = getDirs(thisDir);
		//Uses our getDirs method to get an array list of all of the names of the subdirectories in the directory we are in
		ArrayList<String> files = getFiles(thisDir);
		//Uses our getFiles method to get an array list of all of the names of the files in the directory we are in

		
		// TODO: Implement base case -- we know this is the case
		//		 when there are no more subdirectories.
		
		if(files.contains(fileToFind)) {
			return thisDir;
		}
		// Checks our array list of names of files to see if the file that we are searching for is in it i.e. we have found our target file
		
		else if(dirs.size()==0)
		{
			/* Your code for base case goes here */
			return "";
		}
		//Checks if our array list of subdirectory names is empty. If it is, that means that we have nowhere to go and our target file is not in this directory so we return an empty string
		
		//TODO: Implement recursive case. Note that you'll likely
		//		need one or more if/else tests to cover all cases.
		//		Make sure you consider all file-directory combinations.
		
		else {
			
			for(int i = 0; i < dirs.size(); i++) {
				pathToReturn = recursiveFind(fileToFind, thisDir + File.separator + dirs.get(i));
				// Iterates through our array list of subdirectory names and calls our recursive find method on every of the subdirectories

				if(!pathToReturn.isEmpty()) {
					return pathToReturn;
				}
				// Checks if our recursive find method returned a non-empty string and if it did this means that it found our file and will return the path that we found to where it was called
			}
		}
			
		//If nothing's found, return empty string.
		return "";
		// This runs if the string that was returned is empty and it will return an empty String up the chain of calls
	}
}
