import java.util.Scanner;

public class Challenge11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of males: ");
		int males = input.nextInt();
		System.out.print("Enter the number of females: ");
		int females = input.nextInt();
		int students = males + females;
		System.out.println("Percentage of males: " + ((double)males / students * 100) + "%");
		System.out.println("Percentage of females: " + ((double)females / students * 100) + "%");
		input.close();
	}
}
