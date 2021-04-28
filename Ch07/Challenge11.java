public class Challenge11 {

	public static void main(String[] args) {
		int[] a = {44, 19, 32, 15, 10, 6, 24};
		System.out.println("Total sum: " + ArrayOperations.getTotal(a));		
		System.out.println("Average: " + ArrayOperations.getAverage(a));
		System.out.println("Highest in row 0: " + ArrayOperations.getHighest(a));
		System.out.println("Lowest in row 2: " + ArrayOperations.getLowest(a));
	}
}