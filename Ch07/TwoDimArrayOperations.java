public class TwoDimArrayOperations {

	public static int getTotal(int[][] a) {
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				total += a[i][j];
			}
		}
		return total;
	}
	
	public static float getTotal(float[][] a) {
		float total = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				total += a[i][j];
			}
		}
		return total;
	}
	
	public static double getTotal(double[][] a) {
		double total = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				total += a[i][j];
			}
		}
		return total;
	}
	
	public static long getTotal(long[][] a) {
		long total = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				total += a[i][j];
			}
		}
		return total;
	}
	
	public static double getAverage(int[][] a) {
		int total = getTotal(a);
		return (double)total / (a.length * a[0].length);
	}
	
	public static float getAverage(float[][] a) {
		float total = getTotal(a);
		return total / (a.length * a[0].length);
	}
	
	public static double getAverage(double[][] a) {
		double total = getTotal(a);
		return total / (a.length * a[0].length);
	}
	
	public static double getAverage(long[][] a) {
		long total = getTotal(a);
		return (double)total / (a.length * a[0].length);
	}
	
	public static int getRowTotal(int[][] a, int row) {
		int total = 0;
		for (int j = 0; j < a[0].length; j++)
			total += a[row][j];
		return total;
	}
	
	public static float getRowTotal(float[][] a, int row) {
		float total = 0;
		for (int j = 0; j < a[0].length; j++)
			total += a[row][j];
		return total;
	}
	
	public static double getRowTotal(double[][] a, int row) {
		double total = 0;
		for (int j = 0; j < a[0].length; j++)
			total += a[row][j];
		return total;
	}
	
	public static long getRowTotal(long[][] a, int row) {
		long total = 0;
		for (int j = 0; j < a[0].length; j++)
			total += a[row][j];
		return total;
	}
	
	public static int getColumnTotal(int[][] a, int col) {
		int total = 0;
		for (int i = 0; i < a.length; i++)
			total += a[i][col];
		return total;
	}
	
	public static float getColumnTotal(float[][] a, int col) {
		float total = 0;
		for (int i = 0; i < a.length; i++)
			total += a[i][col];
		return total;
	}
	
	public static double getColumnTotal(double[][] a, int col) {
		double total = 0;
		for (int i = 0; i < a.length; i++)
			total += a[i][col];
		return total;
	}
	
	public static long getColumnTotal(long[][] a, int col) {
		long total = 0;
		for (int i = 0; i < a.length; i++)
			total += a[i][col];
		return total;
	}
	
	public static int getHighestInRow(int[][] a, int row) {
		int maxRow = a[row][0];
		for (int j = 1; j < a.length; j++) {
			if (a[row][j] > maxRow)
				maxRow = a[row][j];
		}
		return maxRow;
	}
	
	public static float getHighestInRow(float[][] a, int row) {
		float maxRow = a[row][0];
		for (int j = 1; j < a.length; j++) {
			if (a[row][j] > maxRow)
				maxRow = a[row][j];
		}
		return maxRow;
	}
	
	public static double getHighestInRow(double[][] a, int row) {
		double maxRow = a[row][0];
		for (int j = 1; j < a.length; j++) {
			if (a[row][j] > maxRow)
				maxRow = a[row][j];
		}
		return maxRow;
	}
	
	public static long getHighestInRow(long[][] a, int row) {
		long maxRow = a[row][0];
		for (int j = 1; j < a.length; j++) {
			if (a[row][j] > maxRow)
				maxRow = a[row][j];
		}
		return maxRow;
	}
	
	public static int getLowestInRow(int[][] a, int row) {
		int minRow = a[row][0];
		for (int j = 1; j < a.length; j++) {
			if (a[row][j] < minRow)
				minRow = a[row][j];
		}
		return minRow;
	}
	
	public static float getLowestInRow(float[][] a, int row) {
		float minRow = a[row][0];
		for (int j = 1; j < a.length; j++) {
			if (a[row][j] < minRow)
				minRow = a[row][j];
		}
		return minRow;
	}
	
	public static double getLowestInRow(double[][] a, int row) {
		double minRow = a[row][0];
		for (int j = 1; j < a.length; j++) {
			if (a[row][j] < minRow)
				minRow = a[row][j];
		}
		return minRow;
	}
	
	public static long getLowestInRow(long[][] a, int row) {
		long minRow = a[row][0];
		for (int j = 1; j < a.length; j++) {
			if (a[row][j] < minRow)
				minRow = a[row][j];
		}
		return minRow;
	}
}