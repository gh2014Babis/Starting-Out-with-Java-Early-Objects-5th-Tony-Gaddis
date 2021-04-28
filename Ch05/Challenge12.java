import java.util.Scanner;

public class Challenge12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sales;
		int bar1 = 0, bar2 = 0, bar3 = 0, bar4 = 0, bar5 = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter today's sales for store " + i + ": ");
			sales = input.nextInt();
			if (i == 1)
				bar1 = sales / 100;
			else if (i == 2)
				bar2 = sales / 100;
			else if (i == 3)
				bar3 = sales / 100;
			else if (i == 4)
				bar4 = sales / 100;
			else 
				bar5 = sales / 100;
		}
		System.out.println("SALES BAR CHART");
		System.out.print("Store 1: ");
		for (int i = 1; i <= bar1; i++) 
			System.out.print("*");
		System.out.println();
		System.out.print("Store 2: ");
		for (int i = 1; i <= bar2; i++) 
			System.out.print("*");
		System.out.println();
		System.out.print("Store 3: ");
		for (int i = 1; i <= bar3; i++) 
			System.out.print("*");
		System.out.println();
		System.out.print("Store 4: ");
		for (int i = 1; i <= bar4; i++) 
			System.out.print("*");
		System.out.println();
		System.out.print("Store 5: ");
		for (int i = 1; i <= bar5; i++) 
			System.out.print("*");
		System.out.println();
		input.close();
	}
}
