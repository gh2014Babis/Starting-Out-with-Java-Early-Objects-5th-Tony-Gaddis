public class Challenge16 {

	public static void main(String[] args) {
		int[][] a = {{4, 9, 2}, {3, 15, 7}, {8, 1, 6}};
		System.out.println("Total sum: " + TwoDimArrayOperations.getTotal(a));		
		System.out.println("Average: " + TwoDimArrayOperations.getAverage(a));
		System.out.println("Total of row 1: " + TwoDimArrayOperations.getRowTotal(a, 1));
		System.out.println("Total of column 2: " + TwoDimArrayOperations.getColumnTotal(a, 2));
		System.out.println("Highest in row 0: " + TwoDimArrayOperations.getHighestInRow(a, 0));
		System.out.println("Lowest in row 2: " + TwoDimArrayOperations.getLowestInRow(a, 2));
	}
}