import java.io.*;
import java.util.Scanner;

public class Challenge03 {

	public static void main(String[] args) throws FileNotFoundException {
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
		input.nextLine();
		// Get the filename.
		System.out.print("Enter the filename: ");
		String filename = input.nextLine();
		// Open the file.
		PrintWriter outputFile = new PrintWriter(new File(filename)); 
		outputFile.println("Hour \t\t Distance Traveled");
		outputFile.println("....................................");
		for (int i = 1; i <= time; i++) {
			DistanceTraveled dt = new DistanceTraveled(speed, i);
			outputFile.println(i + "\t\t\t" + dt.getDistance());
		}
		outputFile.close();
		input.close();
	}
}
