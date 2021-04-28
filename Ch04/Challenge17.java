import java.util.Scanner;

public class Challenge17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of people: ");
		int people = input.nextInt();
		System.out.print("Enter the number of hot dogs: ");
		int hotDogs = input.nextInt();
		int totalHotDogs = people * hotDogs;
		int hotDogPacks = 0;
		if (totalHotDogs / 10 == 0)
			hotDogPacks = 1;
		else {
			if (totalHotDogs % 10 != 0)
				hotDogPacks = totalHotDogs / 10 + 1;
			else 
				hotDogPacks = totalHotDogs / 10;
		}
		int hotDogBunsPacks = 0;
		if (totalHotDogs / 8 == 0)
			hotDogBunsPacks = 1;
		else {
			if (totalHotDogs % 8 != 0)
				hotDogBunsPacks = totalHotDogs / 8 + 1;
			else 
				hotDogBunsPacks = totalHotDogs / 8;
		}
		System.out.println("The minimum number of packages of hot dogs required: " + hotDogPacks);
		System.out.println("The minimum number of packages of buns required: " + hotDogBunsPacks);
		System.out.println("The number of hot dogs that will be left over: " + (hotDogPacks * 10 - totalHotDogs));
		System.out.println("The number of buns that will be left over: " + (hotDogBunsPacks * 8 - totalHotDogs));
		input.close();
	}
}
