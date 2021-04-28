
@SuppressWarnings("serial")
public class InvalidPrice extends Exception {
	
	public InvalidPrice() {
		super("Error: A negative number was given for the price");
	}
}
