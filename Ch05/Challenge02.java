import java.util.Scanner;

public class Challenge02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int speed, time;
		do {
			System.out.print("Enter the speed in miles per hour: ");
			speed = input.nextInt();
			if (speed < 0) {
				System.out.println("Invalid speed value");
			}
		} while (speed < 0);
		do {
			System.out.print("Enter the time in hours: ");
			time = input.nextInt();
			if (time < 1) {
				System.out.println("Invalid time value");
			}
		} while (time < 1);
		System.out.println("Hour \t\t Distance Traveled");
		System.out.println("....................................");
		for (int i = 1; i <= time; i++) {
			DistanceTraveled dt = new DistanceTraveled(speed, i);
			System.out.print(i + "\t\t\t" + dt.getDistance() + "\n");
		}
		input.close();
	}
}
