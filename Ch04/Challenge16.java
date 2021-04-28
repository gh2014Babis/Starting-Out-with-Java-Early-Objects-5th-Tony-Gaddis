import java.util.Scanner;

public class Challenge16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a month (1-12): ");
		int month = input.nextInt();
		System.out.print("Enter a day: ");
		int day = input.nextInt();
		System.out.print("Enter a two-digit year: ");
		int year = input.nextInt();
		MagicDate md = new MagicDate(month, day, year);
		if (md.isMagic())
			System.out.println("The date is magic");
		else 
			System.out.println("The date is not magic");
		input.close();
	}
}
