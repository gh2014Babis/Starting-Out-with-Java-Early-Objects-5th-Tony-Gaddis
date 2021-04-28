import java.util.Scanner;

public class Challenge08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RetailItem item = new RetailItem("Candy bar", 17789, 0.75, 1.5);
		System.out.println(item);
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the quantity of items: ");
		int quantity = input.nextInt();
		CashRegister cr = new CashRegister(item, quantity);
		System.out.println("Sale's subtotal: $" + cr.getSubtotal());
		System.out.println("Sales taale'sx: $" + cr.getTax());
		System.out.println("Total: $" + cr.getTotal());
		input.close();
	}
}
