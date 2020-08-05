
public class ModiferJavaPlay {
//		  final int x = 10; // will generate an error: cannot assign a value to a final variable
//		  final double PI = 3.14;
	
		  static int x = 10;
		  static double PI = 3.14;
		  


		  public static void main(String[] args) {
			  ModiferJavaPlay myObj = new ModiferJavaPlay();
			  myObj.x = 50; 
			  myObj.PI = 25;
			  System.out.println(myObj.x);
			  System.out.println(myObj.PI);
		  }
		}