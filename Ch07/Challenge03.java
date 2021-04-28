import java.util.*;

public class Challenge03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a charge account: ");
		int account = input.nextInt();
		if (ChargeAccount.find(account))
			System.out.println("The account " + account + " was found");
		else
			System.out.println("The account " + account + " was not found");
		input.close();
	}
}