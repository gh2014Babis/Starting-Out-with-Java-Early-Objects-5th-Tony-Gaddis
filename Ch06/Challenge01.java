import java.util.Scanner;

public class Challenge01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1. Circle's area");
			System.out.println("2. Rectangle's area");
			System.out.println("3. Cylinder's area");
			System.out.print("Enter your choice [1-3]: ");
			choice = input.nextInt();
			if (choice != 1 && choice != 2 && choice != 3)
				System.out.println("Invalid input value");
		} while (choice != 1 && choice != 2 && choice != 3);
		if (choice == 1) {
			System.out.print("Enter the circle’s radius: ");
			double r = Double.parseDouble(input.next());
			System.out.println("Circle's area: " + Area.getArea(r));
		} else if (choice == 2) {
			System.out.print("Enter the width of rectangle: ");
			int width = input.nextInt();
			System.out.print("Enter the length of rectangle: ");
			int length = input.nextInt();
			System.out.println("Rectangle's area: " + Area.getArea(width, length));
		} else {
			System.out.print("Enter the cylinder’s radius: ");
			double r = Double.parseDouble(input.next());
			System.out.print("Enter the cylinder’s height: ");
			double h = Double.parseDouble(input.next());
			System.out.println("Cylinder’s area: " + Area.getArea(r, h));
		}
		input.close();
	}
}
