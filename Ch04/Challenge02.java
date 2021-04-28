import java.util.Scanner;

public class Challenge02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number of seconds: ");
		int seconds = input.nextInt();
		if (seconds < 60) {
			System.out.println("Number of seconds: " + seconds);
		} else if (seconds < 3600) {
			System.out.println("Number of minutes: " + ((double)seconds / 60));
		} else if (seconds < 86400) {
			System.out.println("Number of hours: " + ((double)seconds / 3600));
		} else {
			System.out.println("Number of days: " + ((double)seconds / 86400));
		}
		input.close();
	}
}
