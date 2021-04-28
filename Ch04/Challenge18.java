import java.util.Scanner;

public class Challenge18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a pocket number [0-36]: ");
		int pocketNumber = input.nextInt();
		if (pocketNumber < 0 || pocketNumber > 36)
			System.out.println("Invalid pocket number");
		else {
			RoulettePocket rp = new RoulettePocket(pocketNumber);
			System.out.println("Color: " + rp.getPocketColor());
		}
		input.close();
	}
}
