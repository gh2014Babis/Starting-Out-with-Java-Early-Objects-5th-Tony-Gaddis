import java.util.*;

public class Challenge14 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a sentence in which all the words are run together: ");
		String sentence = input.nextLine();
		String str = "";
		for (int i = 0; i < sentence.length(); i++) {
			if (i == 0)
				str += sentence.charAt(i);
			else {
				if (!Character.isUpperCase(sentence.charAt(i)))
					str += sentence.charAt(i);
				else
					str += " " + Character.toLowerCase(sentence.charAt(i));
			}
		}
		System.out.println(str);
		input.close();		
	}
}