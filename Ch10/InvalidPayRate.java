
@SuppressWarnings("serial")
public class InvalidPayRate extends Exception {
	
	public InvalidPayRate() {
		super("Error: negative hourly pay rate");
	}
}
