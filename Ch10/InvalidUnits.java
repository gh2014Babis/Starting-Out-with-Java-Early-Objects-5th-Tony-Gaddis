
@SuppressWarnings("serial")
public class InvalidUnits extends Exception {
	
	public InvalidUnits() {
		super("Error: A negative number was given for the units on hand");
	}
}
