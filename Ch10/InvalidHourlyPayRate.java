
@SuppressWarnings("serial")
public class InvalidHourlyPayRate extends Exception {
	
	public InvalidHourlyPayRate() {
		super("Error: the hourly pay rate is < 0 or > 25");
	}
}
