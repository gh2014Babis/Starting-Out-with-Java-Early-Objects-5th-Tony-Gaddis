import java.io.*;
import java.util.Scanner;

public class Challenge09 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the quantity of items: ");
		int quantity = input.nextInt();
		System.out.print("Enter the price of unit: ");
		double price = Double.parseDouble(input.next());
		RetailItem item = new RetailItem("Candy bar", 17789, price / 2, price);
		CashRegister cr = new CashRegister(item, quantity);
		PrintWriter output = new PrintWriter(new File("Challenge09.txt"));
		output.write("SALES RECEIPT\n");
		output.write("Unit Price: $" + price + "\n");
		output.write("Quantity: " + quantity + "\n");
		output.write("Subtotal: $" + cr.getSubtotal() + "\n");
		output.write("Sales Tax: $" + cr.getTax() + "\n");
		output.write("Total: $" + cr.getTotal());
		output.close();
		input.close();
	}
}
