import java.util.Scanner;

public class Challenge09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of miles driven: ");
		double milesDriven = Double.parseDouble(input.next());
		System.out.print("Enter the gallons of gas used: ");
		double gallonsUsed = Double.parseDouble(input.next());
		double mpg = milesDriven / gallonsUsed;
		System.out.println("MPG = " + mpg);
		input.close();
	}
}
