
@SuppressWarnings("serial")
public class InvalidIDNumber extends Exception {
	
	public InvalidIDNumber() {
		super("Error: the ID is <= 0");
	}
}