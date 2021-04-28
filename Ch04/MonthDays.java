
public class MonthDays {
	
	private int month;
	private int year;
	
	public MonthDays(int month, int year) {
		this.month = month;
		this.year = year;
	}
	
	public int getNumberOfDays() {
		int numOfDays;
		if (month == 2) {
			if (isLeap()) {
				numOfDays = 29;
			} else {
				numOfDays = 28;
			}
		} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 11 || month == 12) {
			numOfDays = 31;
		} else {
			numOfDays = 30;
		}
		return numOfDays;
	}
	
	private boolean isLeap() {
		if (year % 100 == 0) {
			if (year % 400 == 0)
				return true;
			else
				return false;
		} else {
			if (year % 4 == 0)
				return true;
			else
				return false;
		}
	}
}
