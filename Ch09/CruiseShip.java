
public class CruiseShip extends Ship {
	
	private int maxPassengers;
	
	public CruiseShip(String name, String builtYear, int maxPassengers) {
		super(name, builtYear);
		this.maxPassengers = maxPassengers;
	}
	
	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
	
	public int getMaxPassengers() {
		return maxPassengers;
	}
	
	public String toString() {
		return "Name: " + getName() + ", Max passengers: " + getMaxPassengers();
	}
}
