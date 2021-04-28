import java.io.IOException;
import java.util.Scanner;

public class CreateBankAccountFile {
	
	public static void main(String[] args) throws IOException {
		final int NUM_ITEMS = 5; 			// Number of items
	    double balance;      				
	    double annualInterestRate;          
	      
	    // Create a Scanner object for keyboard input.
	    Scanner keyboard = new Scanner(System.in);
	     
	    // Create an array to hold InventoryItem objects.
	    BankAccount[] items = new BankAccount[NUM_ITEMS];
	      
	    System.out.println("Enter data for " + NUM_ITEMS + " bank account items.");
	                         
	    for (int i = 0; i < items.length; i++) {
	    	System.out.print("Enter an item balance: ");
	    	balance = Double.parseDouble(keyboard.next());
	    	
	    	System.out.print("Enter the annual interest rate: ");
	    	annualInterestRate = Double.parseDouble(keyboard.next());
	    	items[i] = new BankAccount(balance, annualInterestRate);
	    }
	      
	    BankAccountFile file = new BankAccountFile("BankAccount.dat");
	    for (int i = 0; i < items.length; i++) {
	         file.writeBankAccount(items[i]);
	    }
	     
	    // Close the file.
	    file.close();
	      
	    System.out.println("The data was written to the BankAccount.dat file.");
	    keyboard.close();
	}
}