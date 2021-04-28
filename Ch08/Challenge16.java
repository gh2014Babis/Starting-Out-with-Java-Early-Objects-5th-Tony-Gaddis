import java.util.Scanner;

public class Challenge16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] symbols = {' ', ',', ';', '?', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				          'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
				          'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		String[] morseCode = {" ", "--..--", ".-.-.-", "..--..", "-----", ".----", "..---", "...--", "....-", ".....",
				              "-....", "--...", "---..", "----.", ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
				              "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
				              "...-", ".--", "-..-", "-.--", "--.."};
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		String morseStr = "";
		for (int i = 0; i < str.length(); i++) {
			char cur = Character.toUpperCase(str.charAt(i));
			int pos = -1;
			for (int j = 0; j < symbols.length; j++) {
				if (symbols[j] == cur) {
					pos = j;
					break;
				}
			}
			if (pos != -1) {
				morseStr += morseCode[pos];
			}
		}
		System.out.println(morseStr);
		input.close();
	}
}
