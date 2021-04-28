import java.io.*;
import java.util.Scanner;

public class Challenge11 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner inputFile = new Scanner(new File("SalesData.txt"));
		double totalSales = 0;
		int totalWeeks = 0;
		int minWeek = 0, maxWeek = 0;
		double minWeekSales = -1, maxWeekSales = -1;
		while (inputFile.hasNext()) {
			totalWeeks++;
			String[] sales = inputFile.nextLine().split(",");
			double weekSales = 0;
			for (int i = 0; i < sales.length; i++) {
				weekSales += Double.parseDouble(sales[i]);
			}
			totalSales += weekSales;
			System.out.println("Total sales for week " + totalWeeks + ": $" + weekSales);
			System.out.println("Average daily sales for week " + totalWeeks + ": $" + (weekSales / 7));
			if (totalWeeks == 1) {
				minWeekSales = weekSales;
				maxWeekSales = weekSales;
				minWeek = 1;
				maxWeek = 1;
			} else {
				if (weekSales < minWeekSales) {
					minWeek = totalWeeks;
					minWeekSales = weekSales;
				}
				if (weekSales > maxWeekSales) {
					maxWeek = totalWeeks;
					maxWeekSales = weekSales;
				}
			}
		}
		System.out.println("Total sales for all of the weeks: $" + totalSales);
		System.out.println("Average weekly sales: $" + (totalSales / totalWeeks));
		System.out.println("Highest amount of sales: $" + maxWeekSales + ", Week: " + maxWeek);
		System.out.println("Lowest amount of sales: $" + minWeekSales + ", Week: " + minWeek);
		inputFile.close();
	}
}
