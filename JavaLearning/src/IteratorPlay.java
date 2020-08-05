import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPlay {
	// Import the ArrayList class and the Iterator class
	public static void main(String[] args) {
		// Make a collection
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	
	    // Get the iterator
	    Iterator<String> it = cars.iterator();
	
	    // Print the first item
//	    for(int i=0; i<cars.size();i++) {
//		    System.out.println(it.next());
//	    }
	    while(it.hasNext()) {
	    	  System.out.println(it.next());
	    }
	  }
	}