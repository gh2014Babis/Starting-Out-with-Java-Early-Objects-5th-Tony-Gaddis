
public class Population {
	
	private int startingNumber;
	private double increase;
	private int days;
	
	public Population(int startingNumber, double increase, int days) {
		this.startingNumber = startingNumber;
		this.increase = increase;
		this.days = days;
	}
	
	public void displayDailyPopulation() {
		double pop = startingNumber;
		for (int i = 1; i <= days; i++) {
			pop += pop * increase;
			System.out.println("Day " + i + ": " + pop);
		}
	}
}
