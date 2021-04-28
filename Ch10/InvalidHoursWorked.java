
@SuppressWarnings("serial")
public class InvalidHoursWorked extends Exception {
	
	public InvalidHoursWorked() {
		super("Error: the hours worked are < 0 or > 84");
	}
}
