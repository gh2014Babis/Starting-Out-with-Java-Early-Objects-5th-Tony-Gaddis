import java.util.*;
import java.io.*;

public class Challenge05 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a charge account: ");
		int account = input.nextInt();
		if (ChargeAccount2.find(account, "accounts.txt"))
			System.out.println("The account " + account + " was found");
		else
			System.out.println("The account " + account + " was not found");
		input.close();
	}
}