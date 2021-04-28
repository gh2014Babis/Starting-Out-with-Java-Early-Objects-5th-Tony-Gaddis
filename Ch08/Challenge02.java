import java.util.*;

public class Challenge02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		System.out.println("The number of words is " + countWords(str));
		input.close();
	}
	
	public static int countWords(String str) {
		int count = 0;
		char prev = ' ';
		char cur;
		int i = 0;		
		String s = "";
		while (i <= str.length() - 1) {
			cur = str.charAt(i);
			s += cur;
			if (cur == ' ' && prev != ' ') {
				System.out.println(s);
				s = "";
				count++;
			}
			i++;
			prev = cur;
		}
		if (prev != ' ') {
			System.out.println(s);
			s = "";
			count++;
		}
		return count;
	}
}