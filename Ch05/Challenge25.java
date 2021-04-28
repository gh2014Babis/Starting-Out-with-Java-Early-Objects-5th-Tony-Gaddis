import java.util.Random;
import java.util.Scanner;

public class Challenge25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int pcChoice;
		String pcColor, playerColor;
		Random rand = new Random();
		int times = 0;
		for (int i = 1; i <= 10; i++) {
			pcChoice = rand.nextInt(5);
			if (pcChoice == 0)
				pcColor = "Red";
			else if (pcChoice == 1)
				pcColor = "Green";
			else if (pcChoice == 2)
				pcColor = "Blue";
			else if (pcChoice == 3)
				pcColor = "Orange";
			else 
				pcColor = "Yellow";
			System.out.println(pcColor);
			System.out.print("Enter a color (Red/Green/Blue/Orange/Yellow): ");
			playerColor = input.next().toLowerCase();
			while (!playerColor.equals("red") && !playerColor.equals("green") && !playerColor.equals("blue") && !playerColor.equals("orange") && !playerColor.equals("yellow")) {
				System.out.println("Invalid input value");
				System.out.print("Enter a color (Red/Green/Blue/Orange/Yellow): ");
				playerColor = input.next().toLowerCase();
			}
			if (playerColor.equals(pcColor.toLowerCase()))
				times++;
		}
		System.out.println(times + " times you correctly guessed the selected color");
		input.close();
	}
}
