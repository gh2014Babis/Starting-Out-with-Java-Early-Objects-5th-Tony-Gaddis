import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class BankAccountFile {
	
	private final int RECORD_SIZE = 16;     // Record length
	private RandomAccessFile bankAccountFile; // Random-Access file
	   
	/**
	* Constructor 
	*/
	   
	public BankAccountFile(String filename) throws FileNotFoundException {
		// Open the file for reading and writing.
		bankAccountFile = new RandomAccessFile(filename, "rw");
	}
	   
	/**
	 * The writeInventoryItem method writes the
	 * InventoryItem argument to the file at the
	 * current file pointer position.
	 */

	public void writeBankAccount(BankAccount item) throws IOException {
		bankAccountFile.writeDouble(item.getBalance());
		bankAccountFile.writeDouble(item.getAnnualInterestRate());
	}
	   
	/**
	 * The readInventoryItem method reads and returns
	 * the record at the current file pointer position.
	 */

	public BankAccount readBankAccount() throws IOException {
		double balance = bankAccountFile.readDouble();
		double annualInterestRate = bankAccountFile.readDouble();
		BankAccount item = new BankAccount(balance, annualInterestRate);
	    return item;
	}

	/**
	 * The getByteNum method accepts a record number
	 * and returns that record's starting byte number.
	 */

	private long getByteNum(long recordNum) {
	      return RECORD_SIZE * recordNum;
	}
	   
	/**
	 * The moveFilePointer method moves the file
	 * to the record indicated by the argument.
	 */

	public void moveFilePointer(long recordNum) throws IOException {
		bankAccountFile.seek(getByteNum(recordNum));
	}

	/**
	 * The getNumberOfRecords method returns the number
	 * of records stored in the file. 
	 */
	   
	public long getNumberOfRecords() throws IOException {
		return bankAccountFile.length() / RECORD_SIZE;
	}
	   
	/**
	 * The close method closes the file.
	 */
	   
	public void close() throws IOException {
		bankAccountFile.close();
	}
}
