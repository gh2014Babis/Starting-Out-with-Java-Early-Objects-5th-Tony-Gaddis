import java.util.Scanner;

public class Challenge05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your password: ");
		String password = input.next();
		int len = password.length();
		int uppers = getUppers(password);
		int lowers = getLowers(password);
		int digits = getDigits(password);
		if (len >= 6 && uppers >= 1 && lowers >= 1 && digits >= 1)
			System.out.println("Valid password");
		else
			System.out.println("Invalid password");
		input.close();
	}
	
	public static int getUppers(String psw) {
		int n = 0;
		for (int i = 0; i < psw.length(); i++) {
			if (Character.isUpperCase(psw.charAt(i)))
				n++;
		}
		return n;
	}
	
	public static int getLowers(String psw) {
		int n = 0;
		for (int i = 0; i < psw.length(); i++) {
			if (Character.isLowerCase(psw.charAt(i)))
				n++;
		}
		return n;
	}
	
	public static int getDigits(String psw) {
		int n = 0;
		for (int i = 0; i < psw.length(); i++) {
			if (Character.isDigit(psw.charAt(i)))
				n++;
		}
		return n;
	}
}
