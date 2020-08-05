
public class CalculationOperation {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = -3;
		int RandomNumD = (int)(Math.random()*101);
		int d = 10;
		
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(a==d); // returns false, because 10 is not equal to 15
		System.out.println(a > b);
		System.out.println(isJavaFun);
		System.out.println(isFishTasty);		
		System.out.println(Math.max(a, b));
		System.out.println(Math.min(a, b));
		System.out.println(Math.sqrt(a));
		System.out.println(Math.abs(c));
		System.out.println(Math.abs(RandomNumD));
		if (a > b) {
			System.out.println("a > b");
		}else {
			System.out.println("a < b");
		}
		
		
		int day = 4;
		switch (day) {
		  case 6:
		    System.out.println("Today is Saturday");
		    break;
		  case 7:
		    System.out.println("Today is Sunday");
		    break;
		  default:
		    System.out.println("Looking forward to the Weekend");
		}
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
		  System.out.println(i);
		}
		
		int[][] myArray = { {1, 2, 3, 4}, {5, 6, 7, 8} };	
	    for (int i = 0; i < myArray.length; ++i) {
	        for(int j = 0; j < myArray[i].length; ++j) {
	          System.out.println(myArray[i][j]);
	        }
	    }
	    
	    
	    
	    
	}
}
