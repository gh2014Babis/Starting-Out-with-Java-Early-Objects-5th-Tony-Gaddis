import java.util.*;

public class Challenge15 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String sentence = input.nextLine();
		String[] words = sentence.split(" ");
		String str = "";
		for (int i = 0; i < words.length; i++) {
			words[i] = words[i].substring(1) + words[i].charAt(0) + "ay";
			str += words[i] + " ";
		}
		System.out.println(str);
		input.close();
	}
}