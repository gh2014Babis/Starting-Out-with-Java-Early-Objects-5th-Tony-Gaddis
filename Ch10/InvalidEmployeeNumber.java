
@SuppressWarnings("serial")
public class InvalidEmployeeNumber extends Exception {
	
	public InvalidEmployeeNumber() {
		super("Error: the  employee number that is less than 0 or greater than 9999");
	}
}
