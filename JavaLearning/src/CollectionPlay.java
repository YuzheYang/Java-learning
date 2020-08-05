import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class CollectionPlay {

  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    ArrayList<Integer> nums = new ArrayList<Integer>();
    cars.add("Aston Martin");
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    Collections.sort(cars);  // Sort cars
    for (String i : cars) {
      System.out.println(i);
    }
    nums.add(30);
    nums.add(20);
    nums.add(10);
    nums.add(40);
    nums.add(50);
    Collections.sort(nums);
    for (int i : nums) {
        System.out.println(i);
      }
  }
}