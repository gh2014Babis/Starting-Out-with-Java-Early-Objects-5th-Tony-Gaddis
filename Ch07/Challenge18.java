import java.util.*;
import java.io.*;

public class Challenge18 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		PhoneBookEntry[] catalog = new PhoneBookEntry[5];
		String name, phone;
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter a name: ");
			name = input.nextLine();
			System.out.print("Enter a phone: ");
			phone = input.nextLine();
			catalog[i] = new PhoneBookEntry(name, phone);
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(catalog[i]);
		}
		input.close();
	}
}