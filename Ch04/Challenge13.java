import java.util.Scanner;

public class Challenge13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the weight: ");
		double weight = Double.parseDouble(input.next());
		System.out.print("Enter the height: ");
		double height = Double.parseDouble(input.next());
		double bmi = weight * 703 / (Math.pow(height, 2));
		if (bmi < 18.5)
			System.out.println("Underweight");
		else if (bmi <= 25)
			System.out.println("Optimal");
		else
			System.out.println("Overweight");
		input.close();
	}
}
