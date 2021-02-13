import java.util.Scanner;

public class Challenge12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of your favorite city: ");
		String city = input.next();
		System.out.println("The number of characters in the city name: " + city.length());
		System.out.println("The name of the city in all uppercase letters: " + city.toUpperCase());
		System.out.println("The name of the city in all lowercase letters: " + city.toLowerCase());
		System.out.println("The first character in the name of the city: " + city.charAt(0));
		input.close();
	}
}
