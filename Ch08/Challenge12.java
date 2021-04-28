
public class Challenge12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Babis Antonopoulos Angel Liakopoulou";
		System.out.println("Words in str1: " + StringOperations.wordCount(str1));
		char[] array = {'B', 'a', 'b', 'i', 's', ' ', 'A', 'n', 't', 'o', 'n', 'o', 'p', 'o', 'u', 'l', 'o', 's'};
		System.out.println(StringOperations.arrayToString(array));
		System.out.println("Most frequent char: " + StringOperations.mostFrequent(str1));
		String string1 = "the dog jumped over the fence";
		String string2 = "the";
		String string3 = "that";
		System.out.println(StringOperations.replaceSubstring(string1, string2, string3));
	}
}
