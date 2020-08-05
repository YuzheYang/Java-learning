public class ThreadPlay extends Thread {
	
	
	  public void run() {
		    System.out.println("This code is running in a thread at C pos");
		  }
	  
	  
	  public static void main(String[] args) {
	  ThreadPlay thread = new ThreadPlay();
	  System.out.println("This code is outside of the thread at A pos");
	  thread.start();
	  System.out.println("This code is outside of the thread at B pos");
	  }
}