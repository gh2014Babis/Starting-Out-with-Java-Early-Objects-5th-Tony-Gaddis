import java.util.Scanner;

public class Challenge07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[][] sales = new double[6][3];
		for (int i = 0; i < sales.length; i++) {
			System.out.println("Division " + i);
			for (int j = 0; j < sales[i].length; j++) {
				System.out.print("Enter the sales figures: ");
				sales[i][j] = Double.parseDouble(input.next());
				while (sales[i][j] < 0) {
					System.out.println("Invalid input value");
					System.out.print("Enter again the sales figures: ");
					sales[i][j] = Double.parseDouble(input.next());
				}
			}
		}
		
		for (int j = 0; j < 3; j++) {
			System.out.println("Quarter " + j);
			for (int i = 0; i < sales.length; i++) {
				System.out.println("Division " + i + " $" + sales[i][j]);
			}
		}
		System.out.println("*******************************************");
		for (int i = 0; i < sales.length; i++) {
			System.out.println("Division " + i);
			for (int j = 1; j < sales[i].length; j++) {
				if (sales[i][j] > sales[i][j - 1])
					System.out.println("Increase in " + j + " quarter from " + (j - 1) + " $" + (sales[i][j] - sales[i][j - 1]));
				else if (sales[i][j] < sales[i][j - 1])
					System.out.println("Decrease in " + j + " quarter from " + (j - 1) + " $" + (sales[i][j - 1] - sales[i][j]));
			}
			System.out.println();
		}
		System.out.println("*******************************************");
		double[] totalQ = new double[3];
		for (int j = 0; j < 3; j++) {
			int totalSales = 0;
			for (int i = 0; i < sales.length; i++) {
				totalSales += sales[i][j];
			}
			totalQ[j] = totalSales;
			System.out.println("Quarter " + j + ": $" + totalSales);
		}
		System.out.println("*******************************************");		
		for (int j = 1; j < 3; j++) {
			if (totalQ[j] > totalQ[j - 1])
				System.out.println("Company's increase in " + j + " quarter from " + (j - 1) + " $" + (totalQ[j] - totalQ[j - 1]));
			else if (totalQ[j] < totalQ[j - 1])
				System.out.println("Company's decrease in " + j + " quarter from " + (j - 1) + " $" + (totalQ[j - 1] - totalQ[j]));
		}
		System.out.println("*******************************************");
		for (int j = 0; j < 3; j++) {
			System.out.println("Average of quarter " + j + ": " + (totalQ[j] / 6));
		}
		System.out.println("*******************************************");
		for (int j = 0; j < 3; j++) {
			System.out.println("Quarter " + j);
			int maxD = 0;
			for (int i = 1; i < sales.length; i++) {
				if (sales[i][j] > sales[maxD][j])
					maxD = i;
			}
			System.out.println("The division with the highest sales: " + maxD);
		}
		input.close();
	}
}
