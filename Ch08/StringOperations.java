
public class StringOperations {
	
	private static char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
		                             'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
		                             'u', 'v', 'w', 'x', 'y', 'z'};

	public static int wordCount(String str) {
		String[] words = str.split(" ");
		return words.length;
	}
	
	public static String arrayToString(char[] array) {
		String str = "";
		for (int i = 0; i < array.length; i++)
			str += array[i];
		return str;
	}
	
	public static char mostFrequent(String str) {
		int[] freq = new int[letters.length];
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < letters.length; j++) {
				if (letters[j] == Character.toLowerCase(str.charAt(i))) {
					freq[j]++;
					break;
				}
			}
		}
		int maxPos = 0;
		for (int i = 1; i < freq.length; i++) {
			if (freq[i] > freq[maxPos])
				maxPos = i;
		}
		return letters[maxPos];
	}
	
	public static String replaceSubstring(String str1, String str2, String str3) {
		int i = 0;
		int j = 0, k;
		while (i < str1.length()) {
			if (str1.charAt(i) == str2.charAt(0)) {
				j = i + 1;
				k = 1;
				while (j < str1.length() && k < str2.length()) {
					if (str1.charAt(j) != str2.charAt(k)) {
						break;
					} else {
						k++;
						j++;
					}
				}
				if (k == str2.length()) {
					str1 = str1.substring(0, i) + str3 + str1.substring(i + str2.length());
				}
				i = j;
			} else
				i++;
		}
		return str1;
	}
}
