import java.util.Scanner;

public class Challenge04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a temperature in Fahrenheit: ");
		double ftemp = Double.parseDouble(input.next());
		Temperature t = new Temperature(ftemp);
		System.out.println("Temperature in Celsius: " + t.getCelsius());
		System.out.println("Temperature in Kelvin: " + t.getKelvin());
		input.close();
	}
}
