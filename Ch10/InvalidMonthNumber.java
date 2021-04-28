
@SuppressWarnings("serial")
public class InvalidMonthNumber extends Exception {
	
	public InvalidMonthNumber() {
		super("Error: the month number is < 1 or > 12");
	}
}
