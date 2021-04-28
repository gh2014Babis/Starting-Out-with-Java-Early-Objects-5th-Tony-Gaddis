import java.util.Scanner;

public class Challenge13Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String phone;
		do {
			System.out.print("Enter a phone number XXX-XXX-XXXX: ");
			phone = input.next();
			if (!checkPhoneFormat(phone))
				System.out.println("Invalid format");
		} while (!checkPhoneFormat(phone));
		input.close();
	}
	
	public static boolean checkPhoneFormat(String phone) {
		if (phone.charAt(3) != '-' || phone.charAt(7) != '-')
			return false;
		String str1 = phone.substring(0, 3);
		String str2 = phone.substring(4, 7);
		String str3 = phone.substring(8);
		boolean f1 = true;
		for (int i = 0; i < str1.length(); i++) {
			if (!Character.isDigit(str1.charAt(i))) {
				f1 = false;
				break;
			}
		}
		boolean f2 = true;
		for (int i = 0; i < str2.length(); i++) {
			if (!Character.isDigit(str2.charAt(i))) {
				f2 = false;
				break;
			}
		}
		boolean f3 = true;
		for (int i = 0; i < str3.length(); i++) {
			if (!Character.isDigit(str3.charAt(i))) {
				f3 = false;
				break;
			}
		}
		if (f1 && f2 && f3)
			return true;
		return false;
	}
}
