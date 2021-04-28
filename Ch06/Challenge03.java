import java.util.Scanner;

public class Challenge03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the width of a room: ");
		double width = Double.parseDouble(input.next());
		System.out.print("Enter the length of a room: ");
		double length = Double.parseDouble(input.next());
		RoomDimension rd = new RoomDimension(width, length);
		System.out.print("Enter the price per square foot: ");
		double price = Double.parseDouble(input.next());
		RoomCarpet rc = new RoomCarpet(rd, price);
		System.out.println(rd);
		System.out.println(rc);
		input.close();
	}
}