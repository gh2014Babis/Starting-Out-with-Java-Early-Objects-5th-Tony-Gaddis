package challenges;

public class Challenge04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {67, 56, 23, 15, 134, 9, 26, 33, 95};
		System.out.println("Max = " + maxElement(arr, 1, arr[0]));
	}
	
	public static int maxElement(int[] arr, int idx, int maxValue) {
		if (idx == arr.length)
			return maxValue;
		else {
			if (arr[idx] > maxValue)
				maxValue = arr[idx];
			return maxElement(arr, idx + 1, maxValue);
		}
	}
}
