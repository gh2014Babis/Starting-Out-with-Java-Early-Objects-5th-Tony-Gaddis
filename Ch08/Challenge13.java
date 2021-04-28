import java.util.Scanner;

public class Challenge13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a phone number XXX-XXX-XXXX: ");
		String phone = input.next();
		for (int i = 4; i < phone.length(); i++) {
			if (phone.charAt(i) == 'A' || phone.charAt(i) == 'B' || phone.charAt(i) == 'C')
				phone = phone.substring(0, i) + '2' + phone.substring(i + 1);
			else if (phone.charAt(i) == 'D' || phone.charAt(i) == 'E' || phone.charAt(i) == 'F')
				phone = phone.substring(0, i) + '3' + phone.substring(i + 1);
			else if (phone.charAt(i) == 'G' || phone.charAt(i) == 'H' || phone.charAt(i) == 'I')
				phone = phone.substring(0, i) + '4' + phone.substring(i + 1);
			else if (phone.charAt(i) == 'J' || phone.charAt(i) == 'K' || phone.charAt(i) == 'L')
				phone = phone.substring(0, i) + '5' + phone.substring(i + 1);
			else if (phone.charAt(i) == 'M' || phone.charAt(i) == 'N' || phone.charAt(i) == 'O')
				phone = phone.substring(0, i) + '6' + phone.substring(i + 1);
			else if (phone.charAt(i) == 'P' || phone.charAt(i) == 'Q' || phone.charAt(i) == 'R' || phone.charAt(i) == 'S')
				phone = phone.substring(0, i) + '7' + phone.substring(i + 1);
			else if (phone.charAt(i) == 'T' || phone.charAt(i) == 'U' || phone.charAt(i) == 'V')
				phone = phone.substring(0, i) + '8' + phone.substring(i + 1);
			else if (phone.charAt(i) == 'W' || phone.charAt(i) == 'X' || phone.charAt(i) == 'Y' || phone.charAt(i) == 'Z')
				phone = phone.substring(0, i) + '9' + phone.substring(i + 1);
		}
		System.out.println(phone.substring(12));
		input.close();
	}
}
