
import java.util.ArrayList;

public class ArrayPlay {
	public static void main(String[] args) {
		ArrayList<String> carsArrayList = new ArrayList<String>();
		Object carsArrayList_ = new ArrayList<String>();
		carsArrayList.add("Volvo");
		carsArrayList.add("Bentz");
		carsArrayList.add("BMW");
		carsArrayList.add("Mazda");
		
		System.out.println(carsArrayList);
		carsArrayList.set(3, "Audi");
		System.out.println(carsArrayList);
		carsArrayList.remove(0);
		System.out.println(carsArrayList);
		
		carsArrayList_ = carsArrayList.clone();
		carsArrayList.clear();
		System.out.println(carsArrayList);
		System.out.println(carsArrayList_);
	}

}
