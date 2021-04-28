import java.util.Scanner;

public class Challenge06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the weight of a package: ");
		double weight = Double.parseDouble(input.next());
		System.out.print("Enter the miles shipped: ");
		double miles = Double.parseDouble(input.next());
		double charges = getCharges(weight, miles);
		System.out.println("Shipping charges: $" + charges);
		input.close();
	}
	
	public static double getCharges(double weight, double miles) {
		double charges;
		if (weight <= 2)
			charges = 1.10;
		else if (weight <= 6)
			charges = 2.20;
		else if (weight <= 10)
			charges = 3.70;
		else 
			charges = 4.80;
		if (miles > 500)
			charges *= 2;
		return charges;
	}
}
