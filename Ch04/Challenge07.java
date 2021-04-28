import java.util.Scanner;

public class Challenge07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of calories: ");
		double calories = Double.parseDouble(input.next());
		System.out.print("Enter the number of fat grams: ");
		double fatGrams = Double.parseDouble(input.next());
		if (calories < fatGrams * 9) {
			System.out.println("Invalid number of fat grams");
		} else {
			FatGram fg = new FatGram(calories, fatGrams);
			System.out.println("The percentage of the calories that come from fat: " + (fg.getPercentage() * 100) + "%");
		}
		input.close();
	}
}
