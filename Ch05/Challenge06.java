import java.util.Scanner;

public class Challenge06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int startingNumber;
		double increase;
		int days;
		do {
			System.out.print("Enter the starting number of population: ");
			startingNumber = input.nextInt();
			if (startingNumber < 2)
				System.out.println("Invalid input value");
		} while (startingNumber < 2);
		do {
			System.out.print("Enter the average daily population increase: ");
			increase = Double.parseDouble(input.next());
			if (increase < 0)
				System.out.println("Invalid input value");
		} while (increase < 0);
		do {
			System.out.print("Enter the number of days they will multiply: ");
			days = input.nextInt();
			if (days < 1)
				System.out.println("Invalid input value");
		} while (days < 1);
		Population p = new Population(startingNumber, increase, days);
		p.displayDailyPopulation();
		input.close();
	}
}
