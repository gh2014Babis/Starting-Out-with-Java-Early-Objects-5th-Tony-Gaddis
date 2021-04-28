package challenges;

public class Population {
	
	@SuppressWarnings("unused")
	private double startingNumber;
	@SuppressWarnings("unused")
	private double increase;
	@SuppressWarnings("unused")
	private int days;
	
	public Population(double startingNumber, double increase, int days) {
		this.startingNumber = startingNumber;
		this.increase = increase;
		this.days = days;
	}
	
	public double organismPopulation(double startingNumber, double increase, int days) {
		if (days == 0)
			return startingNumber;
		else {
			startingNumber += startingNumber * increase;
			return organismPopulation(startingNumber, increase, days - 1);
		}
	}
}