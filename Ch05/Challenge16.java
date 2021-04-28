import java.util.Scanner;

public class Challenge16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the budget for the month: ");
		double budget = Double.parseDouble(input.next());
		double totalExpenses = 0;
		double expense;
		for (int i = 1; i <= 30; i++) {
			System.out.print("Enter the amount of expenses for the day " + i + ": ");
			expense = Double.parseDouble(input.next());
			totalExpenses += expense;
		}
		if (totalExpenses < budget) {
			System.out.println("$" + (budget - totalExpenses) + " under budget");
		} else if (totalExpenses > budget) {
			System.out.println("$" + (totalExpenses - budget) + " over budget");
		} else {
			System.out.println("Budget is equal with total expenses");
		}
		input.close();
	}
}