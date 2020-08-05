
public class LoopShow {
	public static void main(String args[]){
		int x = 10;
		System.out.println("While Loop begin...");
		while(x< 20) {
			
			System.out.println("value of x is: " + x);
			x++;
//			System.out.print("\n");  
		}
		System.out.println("For Loop begin...");
		for(x=10; x<20; x++) {
			System.out.println("value of x is: " + x);
		}
        System.out.print("Enhanced for loop...\n");
		int [] numbers = {10, 20, 30, 40, 50};
		for(int k : numbers ){
			if(k==30) {
				break;
			}
	         System.out.print( k );
	         System.out.print(",");
	      }
	}
}
