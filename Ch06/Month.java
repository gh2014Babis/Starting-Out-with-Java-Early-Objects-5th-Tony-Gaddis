
public class Month {
	
	private int monthNumber;
	
	public Month() {
		monthNumber = 1;
	}
	
	public Month(int monthNumber) {
		if (monthNumber >= 1 && monthNumber <= 12)
			this.monthNumber = monthNumber;
		else
			this.monthNumber = 1;
	}
	
	public Month(String monthName) {
		if (monthName.equals("January"))
			monthNumber = 1;
		else if (monthName.equals("February"))
			monthNumber = 2;
		else if (monthName.equals("March"))
			monthNumber = 3;
		else if (monthName.equals("April"))
			monthNumber = 4;
		else if (monthName.equals("May"))
			monthNumber = 5;
		else if (monthName.equals("June"))
			monthNumber = 6;
		else if (monthName.equals("July"))
			monthNumber = 7;
		else if (monthName.equals("August"))
			monthNumber = 8;
		else if (monthName.equals("September"))
			monthNumber = 9;
		else if (monthName.equals("October"))
			monthNumber = 10;
		else if (monthName.equals("November"))
			monthNumber = 11;
		else
			monthNumber = 12;
	}
	
	public void setMonthNumber(int monthNumber) {
		if (monthNumber >= 1 && monthNumber <= 12)
			this.monthNumber = monthNumber;
		else
			this.monthNumber = 1;
	}
	
	public int getMonthNumber() {
		return monthNumber;
	}
	
	public String getMonthName() {
		String monthName;
		if (monthNumber == 1)
			monthName = "January";
		else if (monthNumber == 2)
			monthName = "February";
		else if (monthNumber == 3)
			monthName = "March";
		else if (monthNumber == 4)
			monthName = "April";
		else if (monthNumber == 5)
			monthName = "May";
		else if (monthNumber == 6)
			monthName = "June";
		else if (monthNumber == 7)
			monthName = "July";
		else if (monthNumber == 8)
			monthName = "August";
		else if (monthNumber == 9)
			monthName = "September";
		else if (monthNumber == 10)
			monthName = "October";
		else if (monthNumber == 11)
			monthName = "November";
		else
			monthName = "December";
		return monthName;
	}
	
	public String toString() {
		return "Month name: " + getMonthName();
	}
	
	public boolean equals(Month obj) {
		if (this.getMonthNumber() == obj.getMonthNumber())
			return true;
		return false;
	}
	
	public boolean greaterThan(Month obj) {
		if (this.getMonthNumber() > obj.getMonthNumber())
			return true;
		return false;
	}
	
	public boolean lessThan(Month obj) {
		if (this.getMonthNumber() < obj.getMonthNumber())
			return true;
		return false;
	}
}
