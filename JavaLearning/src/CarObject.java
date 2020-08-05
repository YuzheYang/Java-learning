

public class CarObject {
	  // Static method
	  static void myStaticMethod() {
	    System.out.println("Static methods can be called without creating objects");
	  }

	  // Public method
	  public void myPublicMethod() {
	    System.out.println("Public methods must be called by creating objects");
	  }
	  
	  public void speed(int maxSpeed) {
		    System.out.println("Max speed is: " + maxSpeed);
		  }

	  // Main method
	  public static void main(String[] args) {
	    myStaticMethod(); // Call the static method
	    // myPublicMethod(); This would compile an error

	    CarObject myObj = new CarObject(); // Create an object of MyClass
	    myObj.myPublicMethod(); // Call the public method on the object
	    myObj.speed(30);
	    
	  }
	}