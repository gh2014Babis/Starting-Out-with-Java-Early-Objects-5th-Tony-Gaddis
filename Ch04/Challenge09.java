import java.util.Scanner;

public class Challenge09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);		
		System.out.println("---MENU OF CHOICES---");
		System.out.println("1. Air");
		System.out.println("2. Water");
		System.out.println("3. Steel");
		System.out.print("Enter your choice: ");
		int choice = input.nextInt();
		if (choice < 1 || choice > 3) {
			System.out.println("Invalid choice");
		} else {
			System.out.print("Enter the distance a sound wave will travel: ");	
			double distance = Double.parseDouble(input.next());
			SoundSpeed ss = new SoundSpeed();
			ss.setDistance(distance);
			if (choice == 1)
				System.out.println("Time in air: " + ss.getSpeedInAir() + " seconds");
			else if (choice == 2) 
				System.out.println("Time in water: " + ss.getSpeedInWater() + " seconds");
			else
				System.out.println("Time in steel: " + ss.getSpeedInSteel() + " seconds");
		}
		input.close();
	}
}
