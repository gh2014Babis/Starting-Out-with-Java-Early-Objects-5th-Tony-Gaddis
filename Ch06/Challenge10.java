import java.util.Scanner;

public class Challenge10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String make = "VW";
		String model = "GTI III";
		String color = "Blue";
		String licenseNum = "HAE8505";
		System.out.print("Enter the number of minutes that the car has been parked: ");
		int parkedMinutes = input.nextInt();
		ParkedCar pc = new ParkedCar(make, model, color, licenseNum, parkedMinutes);
		System.out.print("Enter the number of minutes of parking time that has been purchased: ");
		int purchasedMinutes = input.nextInt();
		ParkingMeter pm = new ParkingMeter(purchasedMinutes);
		String name = "Babis Antonopoulos";
		String badgeNumber = "1980";
		PoliceOfficer po = new PoliceOfficer(name, badgeNumber, pc, pm);
		ParkingTicket pt = po.check();
		if (pt != null) {
			System.out.println("Illegal parking");
			pt.report1();
			pt.report2();
			pt.report3();
		} else {
			System.out.println("No illegal parking");
		}
		input.close();
	}
}
