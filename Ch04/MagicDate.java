
public class MagicDate {
	
	private int month;
	private int day;
	private int year;
	
	public MagicDate(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public boolean isMagic() {
		if (year == month * day)
			return true;
		return false;
	}
}
