public class Challenge17 {

	public static void main(String[] args) {
		int[] numbers = {4, 13, 27, 29, 34, 50, 52, 61, 65, 73, 78, 84, 89, 90, 96, 99, 105, 112, 145, 160};
		int sum1 = 0;
		sum1 += sequentialSearch(numbers, 29);
		sum1 += sequentialSearch(numbers, 52);
		sum1 += sequentialSearch(numbers, 50);
		sum1 += sequentialSearch(numbers, 84);
		sum1 += sequentialSearch(numbers, 99);
		System.out.println("Average of comparisons in sequential search: " + ((double)sum1 / 5));
		int sum2 = 0;
		sum2 += binarySearch(numbers, 29);
		sum2 += binarySearch(numbers, 52);
		sum2 += binarySearch(numbers, 50);
		sum2 += binarySearch(numbers, 84);
		sum2 += binarySearch(numbers, 99);
		System.out.println("Average of comparisons in binary search: " + ((double)sum2 / 5));
	}
	
	public static int sequentialSearch(int[] array, int number) {
		int comparisons = 0;
		int i = 0;
		while (i < array.length) {
			comparisons++;
			if (array[i] >= number)
				break;			
			i++;
		}
		return comparisons;
	}
	
	public static int binarySearch(int[] array, int number) {
		int comparisons = 0;
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			comparisons++;
			if (array[mid] == number)
				break;
			else if (array[mid] > number)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return comparisons;
	}
}