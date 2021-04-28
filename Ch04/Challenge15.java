import java.util.Scanner;

public class Challenge15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of books: ");
		int books = input.nextInt();
		int points;
		if (books == 0)
			points = 0;
		else if (books == 1)
			points = 5;
		else if (books == 2)
			points = 15;
		else if (books == 3)
			points = 30;
		else
			points = 60;
		System.out.println("Number of points: " + points);
		input.close();
	}
}
