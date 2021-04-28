public class ArrayOperations {

	public static int getTotal(int[] a) {
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}
		return total;
	}
	
	public static float getTotal(float[] a) {
		float total = 0;
		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}
		return total;
	}
	
	public static double getTotal(double[] a) {
		double total = 0;
		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}
		return total;
	}
	
	public static long getTotal(long[] a) {
		long total = 0;
		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}
		return total;
	}
	
	public static double getAverage(int[] a) {
		int total = getTotal(a);
		return (double)total / a.length;
	}
	
	public static float getAverage(float[] a) {
		float total = getTotal(a);
		return total / a.length;
	}
	
	public static double getAverage(double[] a) {
		double total = getTotal(a);
		return total / a.length;
	}
	
	public static double getAverage(long[] a) {
		long total = getTotal(a);
		return (double)total / a.length;
	}	
	
	public static int getHighest(int[] a) {
		int max = a[0];
		for (int j = 1; j < a.length; j++) {
			if (a[j] > max)
				max = a[j];
		}
		return max;
	}
	
	public static float getHighest(float[] a) {
		float max = a[0];
		for (int j = 1; j < a.length; j++) {
			if (a[j] > max)
				max = a[j];
		}
		return max;
	}
	
	public static double getHighest(double[] a) {
		double max = a[0];
		for (int j = 1; j < a.length; j++) {
			if (a[j] > max)
				max = a[j];
		}
		return max;
	}
	
	public static long getHighest(long[] a) {
		long max = a[0];
		for (int j = 1; j < a.length; j++) {
			if (a[j] > max)
				max = a[j];
		}
		return max;
	}
	
	public static int getLowest(int[] a) {
		int min = a[0];
		for (int j = 1; j < a.length; j++) {
			if (a[j] < min)
				min = a[j];
		}
		return min;
	}
	
	public static float getLowest(float[] a) {
		float min = a[0];
		for (int j = 1; j < a.length; j++) {
			if (a[j] < min)
				min = a[j];
		}
		return min;
	}
	
	public static double getLowest(double[] a) {
		double min = a[0];
		for (int j = 1; j < a.length; j++) {
			if (a[j] < min)
				min = a[j];
		}
		return min;
	}
	
	public static long getLowest(long[] a) {
		long min = a[0];
		for (int j = 1; j < a.length; j++) {
			if (a[j] < min)
				min = a[j];
		}
		return min;
	}
}