public class Challenge20 {
	
	public static void main(String[] args) {
		int[][] a = {{4, 9, 2}, {3, 15, 7}, {8, 1, 6}};
		if (checkMagic(a))
			System.out.println("The array is magic");
		else
			System.out.println("The array is not magic");
	}
	
	public static boolean checkMagic(int[][] a) {
		int[] sums = new int[8];
		int k = -1;
		for (int i = 0; i < a.length; i++) {
			k++;
			for (int j = 0; j < a[i].length; j++) {
				sums[k] += a[i][j];
			}
		}
		for (int j = 0; j < 3; j++) {
			k++;
			for (int i = 0; i < 3; i++) {
				sums[k] += a[i][j];
			}
		}
		k++;
		for (int i = 0; i < a.length; i++) {		
			sums[k] += a[i][i];
		}
		k++;
		for (int i = 0; i < a.length; i++) {		
			sums[k] += a[i][3 - i - 1];
		}
		for (int i = 1; i < sums.length; i++) {
			if (sums[i] != sums[0])
				return false;
		}
		return true;
	}
}