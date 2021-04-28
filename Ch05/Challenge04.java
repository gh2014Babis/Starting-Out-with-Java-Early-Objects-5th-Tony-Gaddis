import java.util.Scanner;

public class Challenge04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int days;
		do {
			System.out.print("Enter the days worked: ");
			days = input.nextInt();
			if (days < 1) 
				System.out.print("Invalid input value");
		} while (days < 1);
		double salary = 1;
		for (int i = 2; i <= days; i++) {
			salary *= 2;
		}
		System.out.println("The salary is $" + (salary / 100));
		input.close();
	}	
}
