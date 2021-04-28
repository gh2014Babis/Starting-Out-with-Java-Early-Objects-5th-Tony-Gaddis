import java.util.Scanner;

public class Challenge06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] name = {"Harrison, Rose", "James, Jean", "Smith, William", "Smith, Brad"};
		String[] phone = {"555-2234", "555-9098", "555-1785", "555-9224"};
		System.out.print("Enter a name: ");
		String n = input.nextLine();		
		for (int i = 0; i < name.length; i++) {
			if (n.length() <= name[i].length()) {
				if (n.equals(name[i].substring(0, n.length())))
					System.out.println(name[i] + ": " + phone[i]);
			}
		}
		input.close();
	}
}
