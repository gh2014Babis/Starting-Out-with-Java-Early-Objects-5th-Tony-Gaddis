import java.io.IOException;
import java.util.Scanner;

public class ReadBankAccountFile {
	
	public static void main(String[] args) throws IOException {
		int recordNumber;		// Record number
		String again;         	// To get a Y or an N
		BankAccount item;     	// An object from the file
	      
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);	    
		
		// Open the file.
		BankAccountFile file = new BankAccountFile("BankAccount.dat");
		
		// Report the number of records in the file.
		System.out.println("The BankAccount.dat file has " + file.getNumberOfRecords() + " records.");
		
		// Get a record number from the user and
		// display the record.
		do {
			// Get the record number.
			System.out.print("Enter the number of the record you wish to see: ");
			recordNumber = keyboard.nextInt();
			// Consume the remaining newline.
			keyboard.nextLine();
			// Move the file pointer to that record.
			file.moveFilePointer(recordNumber);
			// Read the record at that location.
			item = file.readBankAccount();
			// Display the record.
			System.out.println("\nBalance: " + item.getBalance());
			System.out.println("Annual Interest Rate: " + item.getAnnualInterestRate());
			// Ask the user whether to get another record.
			System.out.print("\nDo you want to see another " +
	                          "record? (Y/N): ");
			again = keyboard.nextLine();
		} while (again.charAt(0) == 'Y' || again.charAt(0) == 'y');
		
		// Close the file.
		file.close();
		keyboard.close();
	}
}