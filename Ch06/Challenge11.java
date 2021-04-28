import java.util.Scanner;

public class Challenge11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int choice;
		double r, w, l, b, h;
		while (true) {
			do {
				System.out.println("Geometry Calculator");
				System.out.println("1. Calculate the Area of a Circle");
				System.out.println("2. Calculate the Area of a Rectangle");
				System.out.println("3. Calculate the Area of a Triangle");
				System.out.println("4. Quit");
				System.out.print("Enter your choice (1-4): ");
				choice = input.nextInt();
				if (choice != 1 && choice != 2 && choice != 3 && choice != 4)
					System.out.println("Invalid choice");
			} while (choice != 1 && choice != 2 && choice != 3 && choice != 4);
			if (choice == 1) {
				System.out.print("Enter the radius of a circle: ");
				r = Double.parseDouble(input.next());
				while (r < 0) {
					System.out.println("Invalid input value");
					System.out.print("Enter again the radius of a circle: ");
					r = Double.parseDouble(input.next());
				}
				System.out.println("Circle area: " + Geometry.getCircleArea(r));
			} else if (choice == 2) {
				System.out.print("Enter the length of a rectangle: ");
				l = Double.parseDouble(input.next());
				while (l < 0) {
					System.out.println("Invalid input value");
					System.out.print("Enter again the length of a rectangle: ");
					l = Double.parseDouble(input.next());
				}
				System.out.print("Enter the width of a rectangle: ");
				w = Double.parseDouble(input.next());
				while (w < 0) {
					System.out.println("Invalid input value");
					System.out.print("Enter again the width of a rectangle: ");
					w = Double.parseDouble(input.next());
				}
				System.out.println("Rectangle area: " + Geometry.getRectangleArea(l, w));
			} else if (choice == 3) {
				System.out.print("Enter the base of a triangle: ");
				b = Double.parseDouble(input.next());
				while (b < 0) {
					System.out.println("Invalid input value");
					System.out.print("Enter again the base of a triangle: ");
					b = Double.parseDouble(input.next());
				}
				System.out.print("Enter the height of a triangle: ");
				h = Double.parseDouble(input.next());
				while (h < 0) {
					System.out.println("Invalid input value");
					System.out.print("Enter again the height of a rectangle: ");
					h = Double.parseDouble(input.next());
				}
				System.out.println("Triangle area: " + Geometry.getTriangleArea(b, h));
			} else {
				System.out.println("END OF PROGRAM");
				break;
			}
		}
		input.close();
	}
}
