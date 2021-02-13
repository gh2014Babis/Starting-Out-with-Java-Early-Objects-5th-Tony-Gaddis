import java.util.Scanner;

public class Challenge05 {
	
	final static int BAG_CAPACITY = 40;
	final static int BAG_SERVINGS = 10;
	final static double CALORIES_PER_SERVING = 300;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of cookies you ate: ");
		int cookies = input.nextInt();
		double servings = cookies * (double)BAG_SERVINGS / BAG_CAPACITY;
		double totalCalories = servings * CALORIES_PER_SERVING;
		System.out.println("You ate " + cookies + " cookies");
		System.out.println("Total servings " + servings);
		System.out.println("Total calories " + totalCalories);
		input.close();
	}
}
