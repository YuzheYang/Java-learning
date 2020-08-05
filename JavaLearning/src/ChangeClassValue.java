
public class ChangeClassValue {
	public static int price(int x) {
		x = (int) Math.pow(x, 2);
		return x;
	}
	
	public static void main(String[] args) {
		int car_price = 1000;
		int new_price = price(car_price);
		System.out.println(new_price);
	}
}
