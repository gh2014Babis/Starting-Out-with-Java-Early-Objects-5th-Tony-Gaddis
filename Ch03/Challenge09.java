import java.util.Scanner;

public class Challenge09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius of a circle: ");
		double radius = Double.parseDouble(input.next());
		Circle c = new Circle(radius);
		System.out.println("Area: " + c.getArea());
		System.out.println("Diameter: " + c.getDiameter());
		System.out.println("Circumference: " + c.getCircumference());
		input.close();
	}
}
