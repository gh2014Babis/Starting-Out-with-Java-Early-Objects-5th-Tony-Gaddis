import java.util.*;

public class Challenge03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		System.out.println(capitalizeSentences(str));
		input.close();
	}
	
	public static String capitalizeSentences(String str) {
		boolean flag = false;
		char prev = ' ';
		char cur;
		String s = "";
		int i = 0;
		while (i <= str.length() - 1) {
			cur = str.charAt(i);
			if (i == 0 || (prev == '.' && cur != ' ')) {
				if (!flag) {
					cur = Character.toUpperCase(cur);
					flag = true;
				}
			}
			s += cur;
			i++;
			if (cur == '.') {
				prev = cur;
				flag = false;
			}
		}
		return s;
	}
}