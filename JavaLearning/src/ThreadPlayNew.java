
public class ThreadPlayNew extends Thread {
  public static int amount = 0;

  public static void main(String[] args) {
//	  System.out.println("A");
	  ThreadPlayNew thread = new ThreadPlayNew();
//	  System.out.println("B");
	  thread.start();
	  System.out.println("C");
	  System.out.println(amount);
	  amount++;
	  System.out.println("D");
	  System.out.println(amount);
	  System.out.println("E");
	  }

  public void run() {
//	  System.out.println("F");
	  amount++;
//	  System.out.println("G");
  }
}
