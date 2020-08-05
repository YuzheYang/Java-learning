public class JavaMethod {
  static void myMethod(String fname, int age) {
    System.out.println(fname + " is " + age);
  }
  static int myMethodNew(int i){
	  return i+5;
	  
  }

  public static void main(String[] args) {
    myMethod("Liam", 5);
    myMethod("Jenny", 8);
    myMethod("Angie", 31);
    int newNum = myMethodNew(87);
    System.out.println(newNum);
  }
}
