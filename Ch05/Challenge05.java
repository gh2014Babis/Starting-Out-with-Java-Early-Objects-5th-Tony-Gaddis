import java.util.Scanner;

public class Challenge05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of floors: ");
		int floors = input.nextInt();
		while (floors < 1) {
			System.out.println("Invalid number of floors");
			System.out.print("Enter the number of floors: ");
			floors = input.nextInt();
		}
		int totalRooms = 0;
		int totalOccupiedRooms = 0;
		int totalVacantRooms = 0;
		int rooms;
		for (int i = 1; i <= floors; i++) {
			do {
				System.out.print("Enter the number of rooms for the floor " + i + ": ");
				rooms = input.nextInt();
				if (rooms < 10)
					System.out.print("Invalid number of rooms");				
			} while (rooms < 10);
			totalRooms += rooms;
			System.out.print("Enter the number of occupied rooms [0-" + rooms + "] for the floor " + i + ": ");
			int occupiedRooms = input.nextInt();
			while (occupiedRooms > rooms) {
				System.out.println("Invalid number of occupied rooms");
				System.out.print("Enter the number of occupied rooms [0-" + rooms + "] for the floor " + i + ": ");
				occupiedRooms = input.nextInt();
			}
			totalOccupiedRooms += occupiedRooms;
		}
		totalVacantRooms = totalRooms - totalOccupiedRooms;
		System.out.println("Total rooms: " + totalRooms);
		System.out.println("Total occupied rooms: " + totalOccupiedRooms);
		System.out.println("Total vacant rooms: " + totalVacantRooms);
		System.out.println("Occupancy rate: " + ((double)totalOccupiedRooms / totalRooms));
		input.close();
	}
}
