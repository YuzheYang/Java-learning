//
//public class ConstructorJavaPlay {
//
//int x;
//double x_r;
//public ConstructorJavaPlay() {
//	x = 50;
//	x_r = Math.pow(x, 2);
//	}
//
//public static void main(String[] args) {
//	ConstructorJavaPlay myObj = new ConstructorJavaPlay();// Create an object of class MyClass (This will call the constructor)
//	System.out.println(myObj.x_r); // Print the value of x
//	}
//}

public class ConstructorJavaPlay {
  int x;

  public ConstructorJavaPlay(int y) {
    x = y;
  }

  public static void main(String[] args) {
	  ConstructorJavaPlay myObj = new ConstructorJavaPlay(5);
	  System.out.println(myObj.x);
	  }
}
