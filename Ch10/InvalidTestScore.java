
@SuppressWarnings("serial")
public class InvalidTestScore extends Exception {
	
	public InvalidTestScore() {
		super("Error: the item is < 0 or > 100");
	}
}
