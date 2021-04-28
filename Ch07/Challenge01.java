import java.util.Scanner;

public class Challenge01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[] rainfall = new double[12]; 
		for (int i = 0; i < rainfall.length; i++) {
			System.out.print("Enter the total rainfall for the month " + (i + 1) + ": ");
			rainfall[i] = Double.parseDouble(input.next());
		}
		RainFall rf = new RainFall(rainfall);
		System.out.println("Total rainfall: " + rf.getTotal());
		System.out.println("Average monthly rainfall: " + rf.getAvg());
		System.out.println("Month with the most rain: " + (rf.getMax() + 1));
		System.out.println("Month with the least rain: " + (rf.getMin() + 1));
		input.close();
	}
}
