
public class ObjectMine {
	  int x = 5;
	  static void show() {
		  System.out.println("Here is a call for my object...");
	  }
	  
	  public static void main(String[] args) {
		  ObjectMine myObj1 = new ObjectMine();  // Object 1
		  ObjectMine myObj2 = new ObjectMine();  // Object 2
		  System.out.println(myObj1.x);
		  System.out.println(myObj2.x);
		  show();
	  }
	  
	  
}
