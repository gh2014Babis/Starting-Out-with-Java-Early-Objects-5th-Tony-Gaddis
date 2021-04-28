import java.util.Scanner;

public class Challenge04 {
	
	final static double PACKAGE_PRICE = 99;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the quantity: ");
		int quantity = input.nextInt();
		double price = quantity * PACKAGE_PRICE;
		double totalPrice = price;
		double discount = 0;
		if (quantity < 0) {
			System.out.println("Invalid quantity");
		} else if (quantity < 10) {
			discount = 0;
		} else if (quantity < 20) {
			discount = price * 0.2;
		} else if (quantity < 50) {
			discount = price * 0.3;
		} else if (quantity < 100) {
			discount = price * 0.4;
		} else {
			discount = price * 0.5;
		}
		totalPrice = price - discount;
		System.out.println("Discount: $" + discount);
		System.out.println("Total price: $" + totalPrice);
		input.close();
	}
}